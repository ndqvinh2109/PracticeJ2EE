package com.practice.my.shopping.model;

/**
 * Created by Quang on 02/26/2017.
 */
public class Address {
    private String addressLines;
    private City city;
    private Country country;

    public String getAddressLines() {
        return addressLines;
    }

    public void setAddressLines(String addressLines) {
        this.addressLines = addressLines;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }
}
