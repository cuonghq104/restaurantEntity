/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author Dell
 */
public class Employee extends User implements Serializable {

    private Restaurant restaurant;

    public Employee() {
    }

    public Employee(Restaurant restaurant, int id, String name, String address, String tel, String email, Account account) {
        super(id, name, address, tel, email, account);
        this.restaurant = restaurant;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

}
