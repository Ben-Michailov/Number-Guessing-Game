package com.example.numberguessinggame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.startGame);

        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openActivity3();
            }
        });

        button = (Button) findViewById(R.id.leaderboard);

        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openActivity2();
            }
        });

    }

    public void openActivity2(){
        Intent intent  = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }

    public void openActivity3(){
        Intent intent  = new Intent(this, MainActivity3.class);
        startActivity(intent);
    }
}