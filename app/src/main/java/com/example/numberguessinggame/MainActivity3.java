package com.example.numberguessinggame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity3 extends AppCompatActivity {

    private Button button;
    public static final String EXTRA_NUMBER = "com.example.numberguessinggame.EXTRA_NUMBER";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        button = (Button) findViewById(R.id.easy);

        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openActivity4(10);
            }
        });

        button = (Button) findViewById(R.id.medium);

        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openActivity4(30);
            }
        });

        button = (Button) findViewById(R.id.hard);

        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openActivity4(50);
            }
        });
    }

    public void openActivity4(int guesses){


        Intent intent  = new Intent(this, MainActivity4.class);
        intent.putExtra(EXTRA_NUMBER, guesses);
        startActivity(intent);
    }
}