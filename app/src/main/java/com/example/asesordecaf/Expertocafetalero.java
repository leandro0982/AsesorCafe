package com.example.asesordecaf;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.text.BreakIterator;

public class Expertocafetalero extends AppCompatActivity {
    TextView tex;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_expertocafetalero);

        tex = (TextView) findViewById(R.id.tv_muestra);
        Intent intent = new Intent();
        String muesta = intent.getStringExtra("datos");
        tex.setText(muesta );



    }
}