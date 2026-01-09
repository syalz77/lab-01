package com.example.petshop;

import java.util.Date;

public abstract class Mood {

    private Date currentDate;

    public Mood() {
        this.currentDate = new Date();
    }
    public Mood(Date currentDate) {
        this.currentDate = currentDate;
    }

    public Date getCurrentDate() {
        return currentDate;
    }

    public void setCurrentDate(Date currentDate) {
        this.currentDate = currentDate;
    }

    public abstract String currentMood();
}
