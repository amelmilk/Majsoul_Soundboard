package com.example.majsoul_soundboard;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;

public class Miki_Score extends Activity {
    MediaPlayer mediaplayer;
    Button tenpai;
    Button noten;
    Button mangan;
    Button haneman;
    Button baiman;
    Button sanbaiman;
    Button kazoe;
    Button yakuman1;
    Button yakuman2;
    Button yakuman3;
    Button yakuman4;
    Button yakuman5;
    Button yakuman6;
    Button kyusyu;
    Button tsuukan;
    Button wind4;
    Button winner;
    Button back;




    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.miki_score);
        tenpai = (Button)findViewById(R.id.tenpai);
        noten = (Button)findViewById(R.id.noten);
        mangan = (Button)findViewById(R.id.mangan);
        haneman = (Button)findViewById(R.id.haneman);
        baiman = (Button)findViewById(R.id.baiman);
        sanbaiman = (Button)findViewById(R.id.sanbaiman);
        kazoe = (Button)findViewById(R.id.kazoeyakuman);
        yakuman1 = (Button)findViewById(R.id.yakuman);
        yakuman2 = (Button)findViewById(R.id.yakuman2);
        yakuman3 = (Button)findViewById(R.id.yakuman3);
        yakuman4 = (Button)findViewById(R.id.yakuman4);
        yakuman5 = (Button)findViewById(R.id.yakuman5);
        yakuman6 = (Button)findViewById(R.id.yakuman6);
        kyusyu = (Button)findViewById(R.id.kyusyu);
        tsuukan = (Button)findViewById(R.id.tsuukan);
        wind4 = (Button)findViewById(R.id.wind4);
        winner = (Button)findViewById(R.id.winner);
        back  = (Button)findViewById(R.id.back);

        mediaplayer = MediaPlayer.create(Miki_Score.this, R.raw.miki_act_chi);

        tenpai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaplayer.stop();
                mediaplayer = MediaPlayer.create(Miki_Score.this, R.raw.miki_gameend_tenpai);
                mediaplayer.start();
            }
        });

        noten.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaplayer.stop();
                mediaplayer = MediaPlayer.create(Miki_Score.this, R.raw.miki_gameend_noten);
                mediaplayer.start();
            }
        });

        mangan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaplayer.stop();
                mediaplayer = MediaPlayer.create(Miki_Score.this, R.raw.miki_gameend_mangan);
                mediaplayer.start();
            }
        });

        haneman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaplayer.stop();
                mediaplayer = MediaPlayer.create(Miki_Score.this, R.raw.miki_gameend_haneman);
                mediaplayer.start();
            }
        });

        baiman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaplayer.stop();
                mediaplayer = MediaPlayer.create(Miki_Score.this, R.raw.miki_gameend_baiman);
                mediaplayer.start();
            }
        });

        sanbaiman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaplayer.stop();
                mediaplayer = MediaPlayer.create(Miki_Score.this, R.raw.miki_gameend_sanbaiman);
                mediaplayer.start();
            }
        });

        kazoe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaplayer.stop();
                mediaplayer = MediaPlayer.create(Miki_Score.this, R.raw.miki_gameend_kazoeyakuman);
                mediaplayer.start();
            }
        });

        yakuman1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaplayer.stop();
                mediaplayer = MediaPlayer.create(Miki_Score.this, R.raw.miki_gameend_yakuman1);
                mediaplayer.start();
            }
        });

        yakuman2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaplayer.stop();
                mediaplayer = MediaPlayer.create(Miki_Score.this, R.raw.miki_gameend_yakuman2);
                mediaplayer.start();
            }
        });

        yakuman3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaplayer.stop();
                mediaplayer = MediaPlayer.create(Miki_Score.this, R.raw.miki_gameend_yakuman3);
                mediaplayer.start();
            }
        });

        yakuman4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaplayer.stop();
                mediaplayer = MediaPlayer.create(Miki_Score.this, R.raw.miki_gameend_yakuman4);
                mediaplayer.start();
            }
        });

        yakuman5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaplayer.stop();
                mediaplayer = MediaPlayer.create(Miki_Score.this, R.raw.miki_gameend_yakuman5);
                mediaplayer.start();
            }
        });

        yakuman6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaplayer.stop();
                mediaplayer = MediaPlayer.create(Miki_Score.this, R.raw.miki_gameend_yakuman6);
                mediaplayer.start();
            }
        });

        kyusyu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaplayer.stop();
                mediaplayer = MediaPlayer.create(Miki_Score.this, R.raw.miki_gameend_kyushukyuhai);
                mediaplayer.start();
            }
        });

        tsuukan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaplayer.stop();
                mediaplayer = MediaPlayer.create(Miki_Score.this, R.raw.miki_gameend_sukansanra);
                mediaplayer.start();
            }
        });

        wind4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaplayer.stop();
                mediaplayer = MediaPlayer.create(Miki_Score.this, R.raw.miki_gameend_sufontsurenta);
                mediaplayer.start();
            }
        });

        winner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaplayer.stop();
                mediaplayer = MediaPlayer.create(Miki_Score.this, R.raw.miki_game_top);
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
