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

    public Customer() {
    }

    public Customer(int id, String name, String address, String tel, String email, Account account) {
        super(id, name, address, tel, email, account);
    }

}
