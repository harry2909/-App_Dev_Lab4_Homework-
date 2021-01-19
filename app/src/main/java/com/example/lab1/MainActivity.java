package com.example.lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int mCount = 0;
    private TextView mShowCount;

    private static final String LOG_TAG = MainActivity.class.getSimpleName();

    public static final String EXTRA_MESSAGE = "com.example.lab4.MainActivity.extra.MESSAGE";

    public static final String COUNT_MESSAGE = "com.example.lab4.MainActivity.extra.COUNT";

    public static final int HELLO_REQUEST = 1;

    private TextView mReplyTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = findViewById(R.id.show_count);
    }

    public void showHello(View view) {
        Log.d(LOG_TAG, "Button clicked!");
        Intent helloIntent = new Intent(this, HelloActivity.class);
        Bundle extras = new Bundle();
        String message = "Hello!";
        Integer count = mCount;
        extras.putString(EXTRA_MESSAGE, message);
        extras.putString(COUNT_MESSAGE, Integer.toString(count));
        helloIntent.putExtras(extras);
        startActivity(helloIntent);
    }

    public void countUp(View view) {
        mCount++;
        if(mShowCount != null){
            mShowCount.setText(Integer.toString(mCount));
        }
    }
}