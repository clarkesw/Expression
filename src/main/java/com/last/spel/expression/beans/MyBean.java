package com.last.spel.expression.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MyBean {
    @Value("#{T(com.last.spel.expression.beans.Bean1).NAME}")
    private String loadValueFromAStaticMember;
    
    @Value("#{T(com.last.spel.expression.beans.Bean1).staticMethod()}")
    private String loadValueFromStaticMethod;
    
    @Value("#{T(java.lang.Math).random()")
    private double randomValue;
    
    private Integer integerMaxValue;

    public double getRandomValue() {
        return randomValue;
    }

    public void setRandomValue(double randomValue) {
        this.randomValue = randomValue;
    }

    public Integer getIntegerMaxValue() {
        return integerMaxValue;
    }

    public void setIntegerMaxValue(Integer integerMaxValue) {
        this.integerMaxValue = integerMaxValue;
    }
    
    
    
    public String getLoadValueFromAStaticMember() {
            return loadValueFromAStaticMember;
    }

    public void setLoadValueFromAStaticMember(String loadValueFromAStaticMember) {
            this.loadValueFromAStaticMember = loadValueFromAStaticMember;
    }

    public String getLoadValueFromStaticMethod() {
        return loadValueFromStaticMethod;
    }

    public void setLoadValueFromStaticMethod(String loadValueFromStaticMethod) {
        this.loadValueFromStaticMethod = loadValueFromStaticMethod;
    }
}
