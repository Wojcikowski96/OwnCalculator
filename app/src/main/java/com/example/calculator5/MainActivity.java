package com.example.calculator5;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnSimple, btnAdvanced, btnAbout, btnExit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSimple = (Button) findViewById(R.id.btnSimple);
        btnAdvanced = (Button) findViewById(R.id.btnAdvanced);
        btnAbout = (Button) findViewById(R.id.btnAbout);
        btnExit = (Button) findViewById(R.id.btnExit);

        btnSimple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSimple();
            }
        });

        btnAdvanced.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               openAdv();
            }
        });

        btnAbout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAbout();
            }
        });

        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                System.exit(0);
            }
        });
    }

    public void openSimple()
    {
       Intent intent = new Intent(this, Basic.class);
        startActivity(intent);
    }

    public void openAdv()
    {
        Intent intent = new Intent(this, Advanced.class);
        startActivity(intent);
    }

    public void openAbout()
    {
        Intent intent = new Intent(this, About.class);
        startActivity(intent);
    }
}
