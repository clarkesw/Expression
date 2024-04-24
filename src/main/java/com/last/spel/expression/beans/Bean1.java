package com.last.spel.expression.beans;

import org.springframework.stereotype.Component;

@Component
public class Bean1 {
    private static String NAME = "static variable";
    private String foo = "bar";

    public Integer calculateSalary() {
        return 200000;
    }

    public static String staticMethod() {
        return "this mesg is from static method";
    }

    public static String getNAME() {
        return NAME;
    }

    public static void setNAME(String nAME) {
        NAME = nAME;
    }

    public String getFoo() {
        return foo;
    }

    public void setFoo(String foo) {
        this.foo = foo;
    }
}
