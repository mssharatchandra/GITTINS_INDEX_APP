package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class predict extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_predict);

        Intent finalprediction_intent = getIntent();
        String prediction = finalprediction_intent.getStringExtra("key");



        // Show the value of prediction on the screen

        TextView screen3TextView = (TextView)findViewById(R.id.predictionID);

        screen3TextView.setText(prediction);





    }

    

}