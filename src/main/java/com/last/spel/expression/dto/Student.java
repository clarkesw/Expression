package com.last.spel.expression.dto;

import com.last.spel.expression.DailySession;
import org.springframework.stereotype.Component;

@Component
public class Student implements DailySession{
    
    private long id;
    private String name;
    private Attendance att;

    public Student() {}

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
