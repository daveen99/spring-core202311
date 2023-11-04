package com.spring.core.lombok;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

// junit5 : 단위 테스트 프레임워크 -> public을 붙이면 안됨
// junit4 : 같은건데 이전 버전
class PersonTest {
    @Test
    void lombokTest() {
        Person person = new Person();
        person.setName("김철수");
        person.setAge(30);

        String name = person.getName();

        System.out.println("person = " + person);

        Person person1 = new Person("박영희", 35);
    }
}