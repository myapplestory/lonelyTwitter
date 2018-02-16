package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * Created by James on 2/16/2018.
 *
 */

public class TweetList {
    private ArrayList<Tweet> tweets = new ArrayList<Tweet>();

    public boolean add(Tweet tweet){
        if (tweets.contains(tweet)){
            throw new IllegalArgumentException();
        } else {
            tweets.add(tweet);
            return true;
        }
    }

    public boolean hasTweet(Tweet tweet){
        return tweets.contains(tweet);
    }

    public Tweet getTweet(int index){
        return tweets.get(index);
    }

    public ArrayList<Tweet> getTweets(){
        Collections.sort(tweets);
        return tweets;
    }

    public int getCount(){
        return tweets.size();
    }
    public void deleteTweet(Tweet tweet){
        tweets.remove(tweet);
    }

}
