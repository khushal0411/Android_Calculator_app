package com.example.democalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView result;
    EditText Num1,Num2;
    Button mul,div,add,c,sub;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        result = findViewById(R.id.result);
        Num1 = findViewById(R.id.Num1);
        Num2 = findViewById(R.id.Num2);
        mul = findViewById(R.id.mul);
        div = findViewById(R.id.div);
        add = findViewById(R.id.add);
        c = findViewById(R.id.clear);
        sub = findViewById(R.id.sub);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int addd;
                int a1, b1;
                a1 = Integer.valueOf(Num1.getText().toString());
                b1 = Integer.valueOf(Num2.getText().toString());
                addd = a1 + b1;
                result.setText(Integer.toString(addd));
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer addd;
                Integer a1, b1;
                a1 = Integer.valueOf(Num1.getText().toString());
                b1 = Integer.valueOf(Num2.getText().toString());
                addd = a1 - b1;
                result.setText(Integer.toString(addd));
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer addd;
                Integer a1, b1;
                a1 = Integer.valueOf(Num1.getText().toString());
                b1 = Integer.valueOf(Num2.getText().toString());
                addd = a1 * b1;
                result.setText(Integer.toString(addd));
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int addd;
                int a1, b1;
                a1 = Integer.valueOf(Num1.getText().toString());
                b1 = Integer.valueOf(Num2.getText().toString());
                addd = a1 / b1;
                result.setText(Integer.toString(addd));
            }
        });
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Num1.setText(" ");
                Num2.setText(" ");
                result.setText(" ");
            }
        });
    }}