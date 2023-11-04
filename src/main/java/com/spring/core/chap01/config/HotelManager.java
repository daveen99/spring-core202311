package com.spring.core.chap01.config;

import com.spring.core.chap01.*;

// 호텔을 운영하기 위해 필요한 의존객체를
// 전담해서 생성해주는 역할
public class HotelManager {

    // Chef를 구하는 기능
    public Chef chef() {
        return new JannChef();
    }
    // Restaurant를 계약하는 기능
    public Restaurant restaurant() {
       return new WesternRestaurant(chef()); // 생성자 주입
//        WesternRestaurant r = new WesternRestaurant();
//        r.setChef(chef()); // 수정자 주입
//        return r;
    }
    // Hotel을 생성하는 기능
    public Hotel hotel() {
        return new Hotel(restaurant(), chef());
    }
}
