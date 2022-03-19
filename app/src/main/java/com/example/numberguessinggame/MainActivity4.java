package com.example.numberguessinggame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Button;

public class MainActivity4 extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        Intent intent = getIntent();
        int number = intent.getIntExtra(MainActivity3.EXTRA_NUMBER,0);

        TextView changeableTextView = (TextView) findViewById(R.id.changeableTextView);

        changeableTextView.setText("Your Guess Should be Between 1-"+number);

        int correctNumber = (int) Math.floor(Math.random() * (number - 1 + 1) + 1);


        button = (Button) findViewById(R.id.buttonCheck);

        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                check(correctNumber);
            }
        });
    }

    public void check(int correctNumber){
        EditText editText = (EditText) findViewById(R.id.editText);
        int userInput = Integer.parseInt(editText.getText().toString());

        TextView textViewCheck = (TextView) findViewById(R.id.textViewCheck);

        if(userInput == correctNumber){
            textViewCheck.setText("Correct!");
        }
        else{
            textViewCheck.setText("Wrong!");
        }
    }
}