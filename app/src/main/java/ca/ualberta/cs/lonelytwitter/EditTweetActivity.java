package ca.ualberta.cs.lonelytwitter;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class EditTweetActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_tweet);

        TextView sometextview = (TextView) findViewById(R.id.textView);
        String somestring = getIntent().getStringExtra("text");
        sometextview.setText(somestring);
    }
}
