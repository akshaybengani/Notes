package com.akshaybengani.noxmlonlyjava;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView textView=new TextView(this);
        textView.setText("Hey My name is Akshay Bengani !!");
        textView.setTextColor(Color.CYAN);
        textView.setTextSize(50);

        setContentView(textView);

//        setContentView(R.layout.activity_main);


    }
}
