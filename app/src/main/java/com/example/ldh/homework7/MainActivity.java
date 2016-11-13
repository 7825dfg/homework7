package com.example.ldh.homework7;

import android.support.annotation.IntegerRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button b1, b2, b3, b4;
    EditText edit1, edit2;
    TextView v1;
    String num1, num2;
    Integer result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("계산기!!!");
        edit1 = (EditText)findViewById(R.id.editText1);
        edit2 = (EditText)findViewById(R.id.editText2);
        b1 = (Button)findViewById(R.id.button1);
        b2 = (Button)findViewById(R.id.button2);
        b3 = (Button)findViewById(R.id.button3);
        b4 = (Button)findViewById(R.id.button4);
        v1 = (TextView)findViewById(R.id.textView);
        View.OnClickListener cl = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                    switch (v.getId()) {
                        case R.id.button1 :
                               result = Integer.parseInt(num1) + Integer.parseInt(num2);
                            break;
                        case R.id.button2 :
                            result = Integer.parseInt(num1) - Integer.parseInt(num2);
                            break;
                        case R.id.button3 :
                            result = Integer.parseInt(num1) * Integer.parseInt(num2);
                            break;
                        case R.id.button4 :
                            result = Integer.parseInt(num1) / Integer.parseInt(num2);
                            break;
            }
                v1.setText("계산결과 : "+ result);

        }
    };
        b1.setOnClickListener(cl);
        b2.setOnClickListener(cl);
        b3.setOnClickListener(cl);
        b4.setOnClickListener(cl);
}}
