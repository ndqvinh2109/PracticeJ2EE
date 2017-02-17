package com.practice.my.shopping.entity;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Collection;

/**
 * Created by Quang on 02/17/2017.
 */
@Entity
public class Employee {

    @Id
    private long id;
    private String name;
    private String address;

    @ElementCollection(targetClass = Vacation.class)
    private Collection vacationBookkings;

    public Collection getVacationBookkings() {
        return vacationBookkings;
    }

    public void setVacationBookkings(Collection vacationBookkings) {
        this.vacationBookkings = vacationBookkings;
    }

    public String getAddress() {
        return address;

    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
