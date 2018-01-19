package ca.ualberta.cs.lonelytwitter;


import java.util.Date;


public class Mood1 extends CurrentMood {

    public Mood1(Date date) {
        super(date);
    }



    @Override
    public String getMood() {
        return "happy";
    }





}