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
public class TimeStatistic implements Serializable{
    
    private String dateBooking;
    
    private int quantity;

    public TimeStatistic() {
    }

    public String getDateBooking() {
        return dateBooking;
    }

    public void setDateBooking(String dateBooking) {
        this.dateBooking = dateBooking;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "TimeStatistic{" + "dateBooking=" + dateBooking + ", quantity=" + quantity + '}';
    }
    
    
}
