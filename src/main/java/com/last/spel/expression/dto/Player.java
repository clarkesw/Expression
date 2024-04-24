package com.last.spel.expression.dto;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Player {
    @Value("Clarke")
    private String name;
    @Value("50")
    private String age;

    public Player() {}

    public Player(String name, String age) {
        this.name = name;
        this.age = age;
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
