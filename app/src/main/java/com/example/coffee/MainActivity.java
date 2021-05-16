package com.example.coffee;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView CoffeCraft;
    private Button theory;
    private Button practice;
    private Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CoffeCraft = findViewById(R.id.CoffeCraft);
    }


    public void onClickColor(View view) {
        CoffeCraft.setTextColor(getResources().getColor(R.color.black));
    }
}