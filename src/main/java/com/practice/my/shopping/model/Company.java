package com.practice.my.shopping.model;

import java.util.List;

/**
 * Created by Quang on 02/26/2017.
 */
public class Company {

    private String name;
    private List<Address> addresses;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }
}
