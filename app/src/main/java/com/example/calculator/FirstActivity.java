package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class FirstActivity extends AppCompatActivity {

    private EditText firstNum, secNum;
    private Button bA, bS, bM, bD, bC;
    private TextView result;
    private float op1, op2, op3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        // Link java objects to xml views
        firstNum = (EditText) findViewById(R.id.num1);
        secNum = (EditText) findViewById(R.id.num2);
        bA = (Button) findViewById(R.id.addbtn);
        bS = (Button) findViewById(R.id.subbtn);
        bM = (Button) findViewById(R.id.mubtn);
        bD = (Button) findViewById(R.id.divbtn);
        bC = (Button) findViewById(R.id.clrbtn);
        result = (TextView) findViewById(R.id.result);

        // Add operation
        bA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Read form edittexts (convert to string then to float so we can apply addition)
                op1 = Float.parseFloat(firstNum.getText().toString());
                op2 = Float.parseFloat(secNum.getText().toString());

                op3 = op1 + op2;
                // Display in edittext
                result.setText(Float.toString(op3));

            }
        });


        // Subtract operation
        bS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                op1 = Float.parseFloat(firstNum.getText().toString());
                op2 = Float.parseFloat(secNum.getText().toString());
                op3 = op1 - op2;
                result.setText(Float.toString(op3));
            }
        });

        // Multiply operation
        bM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                op1 = Float.parseFloat(firstNum.getText().toString());
                op2 = Float.parseFloat(secNum.getText().toString());
                op3 = op1 * op2;
                result.setText(Float.toString(op3));

            }
        });

        // Divide operation
        bD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                op1 = Float.parseFloat(firstNum.getText().toString());
                op2 = Float.parseFloat(secNum.getText().toString());
                op3 = op1 / op2;
                result.setText(Float.toString(op3));
            }
        });

        //Clear operation
        bC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                firstNum.setText("");
                secNum.setText("");
                result.setText("");
            }
        });

    }
}