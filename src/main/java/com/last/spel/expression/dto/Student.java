/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.last.spel.expression.dto;


import com.last.spel.expression.DailySession;
import org.springframework.stereotype.Component;

/**
 *
 * @author clarke
 */
@Component
public class Student implements DailySession{
    
    private long id;
    private String name;
    private Attendance att;

    public Student(Attendance att) {
        this.att = att;
    }

    public Attendance getAtt() {
        return att;
    }

    public void setAtt(Attendance att) {
        this.att = att;
    }

    @Override
    public void attendLesson() {
        System.out.println("Attending Session..");
    }

    @Override
    public String toString() {
        return "Student{" + "att=" + att + '}';
    }
    
}
