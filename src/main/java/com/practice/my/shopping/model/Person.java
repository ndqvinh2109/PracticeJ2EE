package com.practice.my.shopping.model;

import java.util.List;

/**
 * Created by Quang on 02/26/2017.
 */
public class Person {
    private String firstName;
    private String lastName;
    private List<Address> addresses;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }
}
