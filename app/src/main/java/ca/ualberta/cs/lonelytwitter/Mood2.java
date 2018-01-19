package ca.ualberta.cs.lonelytwitter;

import java.util.Date;


public class Mood2 extends CurrentMood {

    public Mood2(){
        super();
    }

    public Mood2(Date date) {
        super(date);
    }



    @Override
    public String getMood() {
        return "sad";
    }





}