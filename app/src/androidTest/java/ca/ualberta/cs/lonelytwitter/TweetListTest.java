package ca.ualberta.cs.lonelytwitter;

import android.test.ActivityInstrumentationTestCase2;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by James on 2/16/2018.
 *
 */

public class TweetListTest extends ActivityInstrumentationTestCase2{
    public TweetListTest(){
        super(LonelyTwitterActivity.class);
    }

    public void testAddTweet(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("adding a normal Tweet");

        assertTrue(tweets.add(tweet));
        assertTrue(tweets.hasTweet(tweet));

        tweets.add(tweet);              // inserts same tweet, throws exception
    }

    public void testHasTweet(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("adding a normal Tweet");
        assertFalse(tweets.hasTweet(tweet));
        tweets.add(tweet);
        assertTrue(tweets.hasTweet(tweet));
    }

    public void testGetTweets(){
        TweetList tweets = new TweetList();
        ArrayList<Tweet> orderedTweets = new ArrayList<Tweet>();
        ArrayList<Tweet> returnedTweets = new ArrayList<Tweet>();

        Tweet tweet = new NormalTweet("adding a normal Tweet");
        Tweet tweet2 = new NormalTweet("Another Tweet");
        Date date1 = new Date(2012);
        Date date2 = new Date();

        tweet.setDate(date2);
        tweet2.setDate(date1);
        tweets.add(tweet);
        tweets.add(tweet2);
        orderedTweets.add(tweet2);
        orderedTweets.add(tweet);
        returnedTweets = tweets.getTweets();
        assertEquals(orderedTweets, returnedTweets);
    }


    public void testGetCount() {
        TweetList tweets = new TweetList();

        Tweet tweet = new NormalTweet("adding a normal Tweet");
        tweets.add(tweet);
        int count = tweets.getCount();
        assertEquals(count, 1);
    }

    public void TestDeleteTweet(){
        TweetList tweets = new TweetList();

        Tweet tweet = new NormalTweet("adding a normal Tweet");
        tweets.add(tweet);
        tweets.deleteTweet(tweet);
        assertFalse(tweets.hasTweet(tweet));
    }

}
