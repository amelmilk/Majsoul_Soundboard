package com.example.majsoul_soundboard;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;

public class Ichihime_Main extends Activity {

    Button movesign;
    Button moveresult;
    Button movescore;
    Button moveback;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ichihime_main);
        movesign = (Button) findViewById(R.id.sign);
        moveresult = (Button) findViewById(R.id.result);
        movescore = (Button) findViewById(R.id.score);
        moveback = (Button) findViewById(R.id.back);

        movesign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Ichihime_Sign.class);
                startActivity(intent);
                finish();
            }
        });

        moveresult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Ichihime_Result.class);
                startActivity(intent);
                finish();
            }
        });

        movescore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Ichihime_Score.class);
                startActivity(intent);
                finish();
            }
        });

        moveback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
                finish();
            }
        });


    }
}
