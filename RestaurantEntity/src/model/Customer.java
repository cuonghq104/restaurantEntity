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
public class Customer extends User implements Serializable {

    private String idCard;

    public Customer() {
    }

    public Customer(String idCard, int id, String name, String address, String tel, String email, Account account) {
        super(id, name, address, tel, email, account);
        this.idCard = idCard;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

}
