package com.example.majsoul_soundboard;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;

public class Ichihime_Sign extends Activity {
    MediaPlayer mediaPlayer;
    Button chi;
    Button kan;
    Button pon;
    Button pedora;
    Button richi;
    Button doublerichi;
    Button tsumo;
    Button ron;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ichihime_sign);
        chi = (Button) findViewById(R.id.chi);
        kan = (Button) findViewById(R.id.kan);
        pon = (Button) findViewById(R.id.pon);
        pedora = (Button) findViewById(R.id.pedora);
        richi = (Button) findViewById(R.id.richi);
        doublerichi = (Button) findViewById(R.id.doublerichi);
        tsumo = (Button) findViewById(R.id.tsumo);
        ron = (Button) findViewById(R.id.ron);


        mediaPlayer = MediaPlayer.create(Ichihime_Sign.this, R.raw.ichihime_ron);

        chi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(Ichihime_Sign.this, R.raw.ichihime_chi);
                mediaPlayer.start();
            }
        });

        kan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(Ichihime_Sign.this, R.raw.ichihime_kan);
                mediaPlayer.start();
            }
        });

        pon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(Ichihime_Sign.this, R.raw.ichihime_pon);
                mediaPlayer.start();
            }
        });

        pedora.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(Ichihime_Sign.this, R.raw.ichihime_pedora);
                mediaPlayer.start();
            }
        });

        richi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(Ichihime_Sign.this, R.raw.ichihime_richi);
                mediaPlayer.start();
            }
        });

        doublerichi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(Ichihime_Sign.this, R.raw.ichihime_drichi);
                mediaPlayer.start();
            }
        });

        tsumo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(Ichihime_Sign.this, R.raw.ichihime_tsumo);
                mediaPlayer.start();
            }
        });

        ron.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(Ichihime_Sign.this, R.raw.ichihime_ron);
                mediaPlayer.start();
            }
        });






    }
}