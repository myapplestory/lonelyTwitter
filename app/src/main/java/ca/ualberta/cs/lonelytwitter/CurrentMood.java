package ca.ualberta.cs.lonelytwitter;


import java.util.Date;

public abstract class CurrentMood implements Moodable{
    private Date date;

    public CurrentMood() {
        this.date = new Date();
    }

    public CurrentMood(Date date) {
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
