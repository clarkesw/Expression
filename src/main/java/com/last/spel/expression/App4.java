/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.last.spel.expression;

import com.last.spel.expression.beans.MyBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author clarke
 */
public class App4 {
     public static void main(String[] args) {
        ApplicationContext container = new AnnotationConfigApplicationContext(AppConfig.class);
         MyBean bean = container.getBean(MyBean.class);

        System.out.println("Static Member: " + bean.getLoadValueFromAStaticMember());
        System.out.println("Static Method: " + bean.getLoadValueFromStaticMethod());
        
        System.out.println("Random Value: " + bean.getRandomValue());
    }   
}
