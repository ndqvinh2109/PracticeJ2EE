package com.practice.my.shopping.entity;

import javax.persistence.*;
import java.util.Calendar;

/**
 * Created by Quang on 02/17/2017.
 */

@Embeddable
@Access(AccessType.FIELD)
public class Vacation {

    @Temporal(TemporalType.DATE)
    private Calendar startDate;

    @Column(name = "days")
    private int daysTaken;

    public Calendar getStartDate() {
        return startDate;
    }

    public void setStartDate(Calendar startDate) {
        this.startDate = startDate;
    }

    public int getDaysTaken() {
        return daysTaken;
    }

    public void setDaysTaken(int daysTaken) {
        this.daysTaken = daysTaken;
    }
}
