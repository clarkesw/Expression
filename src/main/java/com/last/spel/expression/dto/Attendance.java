/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.last.spel.expression.dto;

import java.util.Date;

/**
 *
 * @author clarke
 */
public class Attendance {
    private Date date;
    private boolean present;

    public Attendance(Date date, boolean present) {
        this.date = date;
        this.present = present;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public boolean isPresent() {
        return present;
    }

    public void setPresent(boolean present) {
        this.present = present;
    }
    

    @Override
    public String toString() {
        return "Attendance{" + "date=" + date + ", present=" + present + '}';
    }
}
