package com.example.majsoul_soundboard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton moveIch;
    ImageButton movemiki;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        moveIch = (ImageButton) findViewById(R.id.left001);
        movemiki = (ImageButton) findViewById(R.id.right001);

        moveIch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Ichihime_Main.class);
                startActivity(intent);
            }
        });

        movemiki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Miki_Main.class);
                startActivity(intent);
            }
        });




    }
}