package com.raj1.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button one ,two,three,four,five,six,seven,eight,nine,ten;

      int first_number,secound_number;
      char ope;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      one=findViewById(R.id.one);



    }
}