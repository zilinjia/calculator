package com.example.sean.calculate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class
        MainActivity extends AppCompatActivity {
    //1. Declaration
    //2. Hock up step
    //3.Manipulation
    EditText inputText1, inputText2;
    Button plusButton;
    Button minusButton;
    Button multiplyButton;
    Button divideButton;
    TextView resultView;

    float num1, num2,result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputText1 = (EditText) findViewById(R.id.editText);
        inputText2 = (EditText) findViewById(R.id.editText2);
        plusButton = (Button) findViewById(R.id.button);
        minusButton = (Button) findViewById(R.id.button2);
        multiplyButton = (Button) findViewById(R.id.button3);
        divideButton = (Button) findViewById(R.id.button4);
        resultView = (TextView) findViewById(R.id.textView);

        plusButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                num1 = Integer.parseInt(inputText1.getText().toString());
                num2 = Integer.parseInt(inputText2.getText().toString());
                result = num1 + num2;
                resultView.setText(String.valueOf(result));
            }
        });
        minusButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                num1 = Integer.parseInt(inputText1.getText().toString());
                num2 = Integer.parseInt(inputText2.getText().toString());
                result = num1 - num2;
                resultView.setText(String.valueOf(result));
            }
        });
        multiplyButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                num1 = Integer.parseInt(inputText1.getText().toString());
                num2 = Integer.parseInt(inputText2.getText().toString());
                result = num1 * num2;
                resultView.setText(String.valueOf(result));
            }
        });
        divideButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                num1 = Integer.parseInt(inputText1.getText().toString());
                num2 = Integer.parseInt(inputText2.getText().toString());
                result = num1 / num2;
                resultView.setText(String.valueOf(result));
            }
        });

    }
}
