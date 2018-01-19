package ca.ualberta.cs.lonelytwitter;


import java.util.Date;

public abstract class CurrentMood implements Moodable{
    private String mood;
    private Date date;

    public CurrentMood() {
        this.mood = mood;
        this.date = new Date();
    }

    public CurrentMood(Date date) {
        this.mood = mood;
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public abstract String getMood();

    public void setDate(Date date) {
        this.date = date;
    }


}
