package com.example.petshop;

import java.util.Date;

public class SadMood extends Mood{

    public SadMood() {
        super();
    }
    public SadMood(Date currentDate) {
        super(currentDate);
    }


    @Override
    public String currentMood () {
        return "I am sad.";
    }
}

