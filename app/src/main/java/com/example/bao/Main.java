package com.example.bao;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Main extends AppCompatActivity {

    ImageButton bt1, bt2, bt3, bt4, bt5, bt6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_act);
        bt1 = findViewById(R.id.bt1);
        bt2 = findViewById(R.id.bt2);
        bt3 = findViewById(R.id.bt3);
        bt4 = findViewById(R.id.bt4);
        bt5 = findViewById(R.id.bt5);
        bt6 = findViewById(R.id.bt6);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity1();
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity2();

            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity3();

            }
        });
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity4();

            }
        });
        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity5();

            }
        });
        bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity6();

            }
        });
    }

    public void openActivity1()
    {
        Intent myIntent=new Intent(this, MainActivity.class);
        startActivity(myIntent);
    }
    public void openActivity2()
    {
        Intent myIntent=new Intent(this, MainActivity_1.class);
        startActivity(myIntent);
    }
    public void openActivity3()
    {
        Intent myIntent=new Intent(this, MainActivity_2.class);
        startActivity(myIntent);
    }
    public void openActivity4()
    {
        Intent myIntent=new Intent(this, MainActivity_3.class);
        startActivity(myIntent);
    }
    public void openActivity5()
    {
        Intent myIntent=new Intent(this, MainActivity_4.class);
        startActivity(myIntent);
    }
    public void openActivity6()
    {
        Intent myIntent=new Intent(this, MainActivity_5.class);
        startActivity(myIntent);
    }

}
