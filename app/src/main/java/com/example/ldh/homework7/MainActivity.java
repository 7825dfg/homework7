package com.example.ldh.homework7;

import android.icu.text.DecimalFormat;
import android.support.annotation.IntegerRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button b1, b2, b3, b4, b5;
    EditText edit1, edit2;
    TextView v1;
    String num1, num2;
    Double result ;
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
        b5 = (Button)findViewById(R.id.button5);
        v1 = (TextView)findViewById(R.id.textView);
        View.OnClickListener cl = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();

                if(num1.isEmpty() || num2.isEmpty()){
                    Toast.makeText(getApplicationContext(), "숫자를 입력하세요.", Toast.LENGTH_SHORT).show();
                    return;
                }

                switch (v.getId()) {
                        case R.id.button1:

                            result = Double.parseDouble(num1) + Double.parseDouble(num2);
                            break;
                        case R.id.button2:

                            result = Double.parseDouble(num1) - Double.parseDouble(num2);
                            break;
                        case R.id.button3:

                            result = Double.parseDouble(num1) * Double.parseDouble(num2);
                            break;
                        case R.id.button4:
                            if(num2.equals("0")){
                                Toast.makeText(getApplicationContext(), "0으로 나눌 수 없습니다.", Toast.LENGTH_SHORT).show();
                                return;
                            }
                            result = Double.parseDouble(num1) / Double.parseDouble(num2);
                            break;
                        case R.id.button5:
                            if(num2.equals("0")){
                                Toast.makeText(getApplicationContext(), "0으로 나눌 수 없습니다.", Toast.LENGTH_SHORT).show();
                                return;
                            }
                            result = Double.parseDouble(num1) % Double.parseDouble(num2);
                            break;
                    }

                v1.setText(String.format("계산결과 : %.2f", result));

        }
    };
        b1.setOnClickListener(cl);
        b2.setOnClickListener(cl);
        b3.setOnClickListener(cl);
        b4.setOnClickListener(cl);
        b5.setOnClickListener(cl);
}}
