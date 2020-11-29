package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;

public class input_wins_and_loses extends AppCompatActivity {

    public static String MSG = "com.example.myapplication.PREDICTION";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_wins_and_loses);
    }
    public void predict(View view){
        Intent secondIntent = new Intent(this,predict.class);

        EditText wins = findViewById(R.id.wins_input);
        EditText loses = findViewById(R.id.loses_input);
        int number_of_wins = Integer.parseInt(wins.getText().toString());
        int number_of_loses = Integer.parseInt(loses.getText().toString());
        float prediction  =  gittinsMatrix(number_of_wins,number_of_loses);
        prediction=prediction*100;

        String sendingCalculation =String.valueOf(prediction);
        secondIntent.putExtra("key",sendingCalculation);

        startActivity(secondIntent);

    }

    public float gittinsMatrix(int number_of_wins, int number_of_loses) {

        float[][] PredictionTable = {{0.8699f, 0.9102f , 0.9285f , 0.9395f , 0.9470f , 0.9525f , 0.9568f , 0.9603f , 0.9631f , 0.9655f},
                                     {0.7005f,0.7844f, 0.8268f , 0.8533f , 0.8719f , 0.8857f , 0.8964f , 0.9051f , 0.9122f , 0.9183f },
                                     {0.5671f , 0.6726f , 0.7308f , 0.7696f , 0.7973f , 0.8184f , 0.8350f , 0.8485f , 0.8598f , 0.8693f},
                                     {0.4701f , 0.5806f , 0.6490f , 0.6952f , 0.7295f , 0.7561f , 0.7773f , 0.7949f , 0.8097f , 0.8222f},
                                    {0.3969f , 0.5093f , 0.5798f , 0.6311f , 0.6697f , 0.6998f , 0.7249f , 0.7456f , 0.7631f , 0.7781f },
                                     {0.3415f , 0.4509f , 0.5225f , 0.5756f , 0.6172f , 0.6504f , 0.6776f , 0.7004f , 0.7203f , 0.7373f},
                                    {0.2979f , 0.4029f , 0.4747f , 0.5277f , 0.5710f , 0.6061f , 0.6352f , 0.6599f , 0.6811f , 0.6997f },
                                    {0.2632f , 0.3633f , 0.4337f , 0.4876f , 0.5300f , 0.5665f , 0.5970f , 0.6230f , 0.6456f , 0.6653f},
                                    {0.2350f , 0.3303f , 0.3986f , 0.4520f , 0.4952f , 0.5308f , 0.5625f , 0.5895f , 0.6130f , 0.6337f },
                                    {0.2117f , 0.3020f , 0.3679f , 0.4208f , 0.4640f , 0.5002f , 0.5310f , 0.5589f , 0.5831f , 0.6045f}};


        return  PredictionTable[number_of_loses][number_of_wins];

    }
}