package com.example.majsoul_soundboard;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;

public class Ichihime_Score extends Activity {
    MediaPlayer mediaPlayer;
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




    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ichihime_score);
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

        mediaPlayer = MediaPlayer.create(Ichihime_Score.this, R.raw.ichi_act_chi);

        tenpai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(Ichihime_Score.this, R.raw.ichi_gameend_tenpai);

            }
        });

        noten.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(Ichihime_Score.this, R.raw.ichi_gameend_noten);

            }
        });

        mangan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(Ichihime_Score.this, R.raw.ichi_gameend_mangan);

            }
        });

        haneman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(Ichihime_Score.this, R.raw.ichi_gameend_haneman);

            }
        });

        baiman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(Ichihime_Score.this, R.raw.ichi_gameend_baiman);

            }
        });

        sanbaiman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(Ichihime_Score.this, R.raw.ichi_gameend_sanbaiman);

            }
        });

        kazoe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(Ichihime_Score.this, R.raw.ichi_gameend_kazoe_yakuman);

            }
        });

        yakuman1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(Ichihime_Score.this, R.raw.ichi_gameend_yakuman1);

            }
        });

        yakuman2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(Ichihime_Score.this, R.raw.ichi_gameend_yakuman2);

            }
        });

        yakuman3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(Ichihime_Score.this, R.raw.ichi_gameend_yakuman3);

            }
        });

        yakuman4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(Ichihime_Score.this, R.raw.ichi_gameend_yakuman4);

            }
        });

        yakuman5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(Ichihime_Score.this, R.raw.ichi_gameend_yakuman5);

            }
        });

        yakuman6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(Ichihime_Score.this, R.raw.ichi_gameend_yakuman6);

            }
        });

        kyusyu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(Ichihime_Score.this, R.raw.ichi_gameend_kyushukyuhai);

            }
        });

        tsuukan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(Ichihime_Score.this, R.raw.ichi_gameend_sukansanra);

            }
        });

        wind4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(Ichihime_Score.this, R.raw.ichi_gameend_sufontsurenta);

            }
        });

        winner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(Ichihime_Score.this, R.raw.ichi_game_top);

            }
        });




    }
}
