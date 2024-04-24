package com.last.spel.expression.dto;

import org.springframework.stereotype.Component;

@Component
public class Inventor {
    private String name;
    private String age;

    public Inventor() {}

    public Inventor(String name, String age) {
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
    
}
