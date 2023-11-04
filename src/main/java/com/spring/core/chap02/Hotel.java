package com.spring.core.chap02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("wr")
public class Hotel {

    // 의존관계: 어떤 객체가 어떤 객체를 필요로 하는 것
    private Restaurant restaurant;
    private Chef headChef;

    @Autowired
    public Hotel(@Qualifier("ar") Restaurant restaurant, @Qualifier("kc") Chef headChef) {
        this.restaurant = restaurant;
        this.headChef = headChef;
    }

    // 레스토랑 예약 기능
    public void reserve() {
        // 예약을 수행하려면 레스토랑에게 연랑해서 예약을 넣어야함
        System.out.printf("저희 호텔의 레스토랑은 %s입니다. 헤드쉐프는 %s입니다.\n"
                       ,restaurant.getClass().getSimpleName()
                       ,headChef.getClass().getSimpleName());
        restaurant.order();
    }
}
