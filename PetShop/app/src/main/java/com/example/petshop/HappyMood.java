package com.example.petshop;

import java.util.Date;

public class HappyMood extends Mood {

    public HappyMood() {

    }
    public HappyMood(Date currentDate) {
        super(currentDate);
    }

    @Override
    public String currentMood () {
        return "I am happy.";
    }

}
