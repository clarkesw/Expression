package com.last.spel.expression.dto;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Player {
    @Value("Clarke")
    private String name;
    @Value("50")
    private String age;
    @Value("#{'usa'.toUpperCase()}")
    private String country;
    private String state;

    public Player() {}

    public Player(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public Player(String name, String age, String country, String state) {
        this.name = name;
        this.age = age;
        this.country = country;
        this.state = state;
    }

//    public String getCountry() {
//        return country;
//    }
//
    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Player{" + "name=" + name + ", age=" + age + '}';
    }
}
