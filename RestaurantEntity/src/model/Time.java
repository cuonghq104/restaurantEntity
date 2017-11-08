/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author cuong
 */
public class Time implements Serializable{
    private int id;
    
    private int minTime;
    
    private int maxTime;
    
    private String periodOfDay;

    public Time() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMinTime() {
        return minTime;
    }

    public void setMinTime(int minTime) {
        this.minTime = minTime;
    }

    public int getMaxTime() {
        return maxTime;
    }

    public void setMaxTime(int maxTime) {
        this.maxTime = maxTime;
    }

    public String getPeriodOfDay() {
        return periodOfDay;
    }

    public void setPeriodOfDay(String periodOfDay) {
        this.periodOfDay = periodOfDay;
    }
    
    
    
}
