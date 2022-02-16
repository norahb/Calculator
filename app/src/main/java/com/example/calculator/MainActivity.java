package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void movetofrst(View v){
        //Use explicit intent to move to another activity
                            // Form (source) , to (destination)
                            // Make sure you copy the exact activity name
        Intent i = new Intent(this, FirstActivity.class);
        startActivity(i);
    }

    public void movetoscnd(View v){
        Intent i = new Intent(this, SecondActivity.class);
        startActivity(i);
    }
}