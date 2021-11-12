package com.example.majsoul_soundboard;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;

public class Miki_Sign extends Activity {
    MediaPlayer mediaplayer;
    Button chi;
    Button kan;
    Button pon;
    Button pedora;
    Button richi;
    Button doublerichi;
    Button tsumo;
    Button ron;
    Button back;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.miki_sign);
        chi = (Button) findViewById(R.id.chi);
        kan = (Button) findViewById(R.id.kan);
        pon = (Button) findViewById(R.id.pon);
        pedora = (Button) findViewById(R.id.pedora);
        richi = (Button) findViewById(R.id.richi);
        doublerichi = (Button) findViewById(R.id.doublerichi);
        tsumo = (Button) findViewById(R.id.tsumo);
        ron = (Button) findViewById(R.id.ron);
        back = (Button) findViewById(R.id.back);


        mediaplayer = MediaPlayer.create(Miki_Sign.this, R.raw.miki_act_ron);

        chi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaplayer.stop();
                mediaplayer = MediaPlayer.create(Miki_Sign.this, R.raw.miki_act_chi);
                mediaplayer.start();
            }
        });

        kan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaplayer.stop();
                mediaplayer = MediaPlayer.create(Miki_Sign.this, R.raw.miki_act_kan);
                mediaplayer.start();
            }
        });

        pon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaplayer.stop();
                mediaplayer = MediaPlayer.create(Miki_Sign.this, R.raw.miki_act_pon);
                mediaplayer.start();
            }
        });

        pedora.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaplayer.stop();
                mediaplayer = MediaPlayer.create(Miki_Sign.this, R.raw.miki_act_pedora);
                mediaplayer.start();
            }
        });

        richi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaplayer.stop();
                mediaplayer = MediaPlayer.create(Miki_Sign.this, R.raw.miki_act_richi);
                mediaplayer.start();
            }
        });

        doublerichi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaplayer.stop();
                mediaplayer = MediaPlayer.create(Miki_Sign.this, R.raw.miki_act_drichi);
                mediaplayer.start();
            }
        });

        tsumo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaplayer.stop();
                mediaplayer = MediaPlayer.create(Miki_Sign.this, R.raw.miki_act_tsumo);
                mediaplayer.start();
            }
        });

        ron.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaplayer.stop();
                mediaplayer = MediaPlayer.create(Miki_Sign.this, R.raw.miki_act_ron);
                mediaplayer.start();
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaplayer.release();
                mediaplayer = null;
                finish();
            }
        });





    }
}
