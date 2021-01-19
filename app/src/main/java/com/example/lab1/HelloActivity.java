package com.example.lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class HelloActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);
        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        String message = extras.getString(MainActivity.EXTRA_MESSAGE);
        String count = extras.getString(MainActivity.COUNT_MESSAGE);
        TextView textView = findViewById(R.id.hello_text_view);
        textView.setText(message);
        TextView count2 = (TextView) findViewById(R.id.count_box);
        count2.setText(count);
    }
}