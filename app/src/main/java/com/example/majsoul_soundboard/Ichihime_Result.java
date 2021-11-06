package com.example.majsoul_soundboard;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;

public class Ichihime_Result extends Activity {

    MediaPlayer mediaplayer;
    Button riichi;
    Button ippatsu;
    Button driichi;
    Button pinfu;
    Button east;
    Button south;
    Button west;
    Button north;
    Button deast;
    Button dsouth;
    Button dwest;
    Button dnorth;
    Button white;
    Button shoot;
    Button center;
    Button tanyao;
    Button iipeikou;
    Button haitei;
    Button houtei;
    Button tsumo;
    Button rinshan;
    Button chankan;
    Button chiitoitsu;
    Button toitoi;
    Button sanshokudojun;
    Button sanshokudoukou;
    Button sanankou;
    Button sankantsu;
    Button ittsu;
    Button chanta;
    Button shousangen;
    Button honroutou;
    Button ryanpeikou;
    Button junchan;
    Button honiisou;
    Button chinitsu;
    Button nagashi;
    Button tenhou;
    Button chiihou;
    Button kokushi;
    Button kokushi13;
    Button suuankou;
    Button suuankou1;
    Button chuuren;
    Button chuuren9;
    Button ryuuiisou;
    Button tsuuiisou;
    Button daisangen;
    Button shousuushii;
    Button daisuushii;
    Button suukantsu;
    Button chinroutou;
    Button dora01;
    Button dora02;
    Button dora03;
    Button dora04;
    Button dora05;
    Button dora06;
    Button dora07;
    Button dora08;
    Button dora09;
    Button dora10;
    Button dora11;
    Button dora12;
    Button dora13;
    Button back;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ichihime_result);
        riichi = (Button) findViewById(R.id.riichi);
        ippatsu = (Button) findViewById(R.id.ippatsu);
        driichi = (Button) findViewById(R.id.doublerichi);
        pinfu = (Button) findViewById(R.id.pinfu);
        east = (Button) findViewById(R.id.east);
        south = (Button) findViewById(R.id.south);
        west = (Button) findViewById(R.id.west);
        north = (Button) findViewById(R.id.north);
        deast = (Button) findViewById(R.id.deast);
        dsouth = (Button) findViewById(R.id.dsouth);
        dwest = (Button) findViewById(R.id.dwest);
        dnorth = (Button) findViewById(R.id.dnorth);
        white = (Button) findViewById(R.id.haku);
        shoot = (Button) findViewById(R.id.patsu);
        center = (Button) findViewById(R.id.chuu);
        tanyao = (Button) findViewById(R.id.tanyao);
        iipeikou = (Button) findViewById(R.id.iipeikou);
        haitei = (Button) findViewById(R.id.haitei);
        houtei = (Button) findViewById(R.id.houtei);
        tsumo = (Button) findViewById(R.id.tsumo);
        rinshan = (Button) findViewById(R.id.rinshan);
        chankan = (Button) findViewById(R.id.chankan);
        chiitoitsu = (Button) findViewById(R.id.chiitoi);
        toitoi = (Button) findViewById(R.id.toitoi);
        sanshokudojun = (Button) findViewById(R.id.sanshoku);
        sanshokudoukou = (Button) findViewById(R.id.sanshoku_doukou);
        sanankou = (Button) findViewById(R.id.sanankou);
        sankantsu = (Button) findViewById(R.id.sankantsu);
        ittsu = (Button) findViewById(R.id.ittsu);
        chanta = (Button) findViewById(R.id.chanta);
        shousangen = (Button) findViewById(R.id.shousangen);
        honroutou = (Button) findViewById(R.id.honroutou);
        ryanpeikou = (Button) findViewById(R.id.ryanpeikou);
        junchan = (Button) findViewById(R.id.junchan);
        honiisou = (Button) findViewById(R.id.honiisou);
        chinitsu = (Button) findViewById(R.id.chinitsu);
        nagashi = (Button) findViewById(R.id.nagashi);
        tenhou = (Button) findViewById(R.id.tenhou);
        chiihou = (Button) findViewById(R.id.chiihou);
        kokushi = (Button) findViewById(R.id.kokushi);
        kokushi13 = (Button) findViewById(R.id.kokushi13);
        suuankou = (Button) findViewById(R.id.suuankou);
        suuankou1 = (Button) findViewById(R.id.suuankou1men);
        chuuren = (Button) findViewById(R.id.chuuren);
        chuuren9 = (Button) findViewById(R.id.chuuren9men);
        ryuuiisou = (Button) findViewById(R.id.ryuuiisou);
        tsuuiisou = (Button) findViewById(R.id.tsuuiisou);
        daisangen = (Button) findViewById(R.id.daisangen);
        shousuushii = (Button) findViewById(R.id.shousuushii);
        daisuushii = (Button) findViewById(R.id.daisuushii);
        suukantsu = (Button) findViewById(R.id.suukan);
        chinroutou = (Button) findViewById(R.id.chinroutou);
        west = (Button) findViewById(R.id.west);
        dora01 = (Button) findViewById(R.id.dora01);
        dora02 = (Button) findViewById(R.id.dora02);
        dora03 = (Button) findViewById(R.id.dora03);
        dora04 = (Button) findViewById(R.id.dora04);
        dora05 = (Button) findViewById(R.id.dora05);
        dora06 = (Button) findViewById(R.id.dora06);
        dora07 = (Button) findViewById(R.id.dora07);
        dora08 = (Button) findViewById(R.id.dora08);
        dora09 = (Button) findViewById(R.id.dora09);
        dora10 = (Button) findViewById(R.id.dora10);
        dora11 = (Button) findViewById(R.id.dora11);
        dora12 = (Button) findViewById(R.id.dora12);
        dora13 = (Button) findViewById(R.id.dora13);
        back = (Button) findViewById(R.id.back);

        mediaplayer = MediaPlayer.create(Ichihime_Result.this, R.raw.ichi_act_ron);

        riichi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaplayer.stop();
                mediaplayer = MediaPlayer.create(Ichihime_Result.this, R.raw.ichi_fan_riichi);
                mediaplayer.start();
            }
        });

        ippatsu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaplayer.stop();
                mediaplayer = MediaPlayer.create(Ichihime_Result.this, R.raw.ichi_fan_ippatsu);
                mediaplayer.start();
            }
        });

        driichi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaplayer.stop();
                mediaplayer = MediaPlayer.create(Ichihime_Result.this, R.raw.ichi_fan_drich);
                mediaplayer.start();
            }
        });

        pinfu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaplayer.stop();
                mediaplayer = MediaPlayer.create(Ichihime_Result.this, R.raw.ichi_fan_pinfu);
                mediaplayer.start();
            }
        });

        east.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaplayer.stop();
                mediaplayer = MediaPlayer.create(Ichihime_Result.this, R.raw.ichi_fan_east);
                mediaplayer.start();
            }
        });

        south.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaplayer.stop();
                mediaplayer = MediaPlayer.create(Ichihime_Result.this, R.raw.ichi_fan_south);
                mediaplayer.start();
            }
        });

        west.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaplayer.stop();
                mediaplayer = MediaPlayer.create(Ichihime_Result.this, R.raw.ichi_fan_west);
                mediaplayer.start();
            }
        });

        north.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaplayer.stop();
                mediaplayer = MediaPlayer.create(Ichihime_Result.this, R.raw.ichi_fan_north);
                mediaplayer.start();
            }
        });

        deast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaplayer.stop();
                mediaplayer = MediaPlayer.create(Ichihime_Result.this, R.raw.ichi_fan_deast);
                mediaplayer.start();
            }
        });

        dsouth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaplayer.stop();
                mediaplayer = MediaPlayer.create(Ichihime_Result.this, R.raw.ichi_fan_dsouth);
                mediaplayer.start();
            }
        });

        dwest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaplayer.stop();
                mediaplayer = MediaPlayer.create(Ichihime_Result.this, R.raw.ichi_fan_dwest);
                mediaplayer.start();
            }
        });

        dnorth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaplayer.stop();
                mediaplayer = MediaPlayer.create(Ichihime_Result.this, R.raw.ichi_fan_dnorth);
                mediaplayer.start();
            }
        });

        white.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaplayer.stop();
                mediaplayer = MediaPlayer.create(Ichihime_Result.this, R.raw.ichi_fan_white);
                mediaplayer.start();
            }
        });

        shoot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaplayer.stop();
                mediaplayer = MediaPlayer.create(Ichihime_Result.this, R.raw.ichi_fan_shoot);
                mediaplayer.start();
            }
        });

        center.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaplayer.stop();
                mediaplayer = MediaPlayer.create(Ichihime_Result.this, R.raw.ichi_fan_center);
                mediaplayer.start();
            }
        });

        tanyao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaplayer.stop();
                mediaplayer = MediaPlayer.create(Ichihime_Result.this, R.raw.ichi_fan_tanyao);
                mediaplayer.start();
            }
        });

        iipeikou.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaplayer.stop();
                mediaplayer = MediaPlayer.create(Ichihime_Result.this, R.raw.ichi_fan_iipeikou);
                mediaplayer.start();
            }
        });

        haitei.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaplayer.stop();
                mediaplayer = MediaPlayer.create(Ichihime_Result.this, R.raw.ichi_fan_haitei);
                mediaplayer.start();
            }
        });

        houtei.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaplayer.stop();
                mediaplayer = MediaPlayer.create(Ichihime_Result.this, R.raw.ichi_fan_houtei);
                mediaplayer.start();
            }
        });

        tsumo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaplayer.stop();
                mediaplayer = MediaPlayer.create(Ichihime_Result.this, R.raw.ichi_fan_tsumo);
                mediaplayer.start();
            }
        });

        rinshan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaplayer.stop();
                mediaplayer = MediaPlayer.create(Ichihime_Result.this, R.raw.ichi_fan_rinshan);
                mediaplayer.start();
            }
        });

        chankan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaplayer.stop();
                mediaplayer = MediaPlayer.create(Ichihime_Result.this, R.raw.ichi_fan_chankan);
                mediaplayer.start();
            }
        });

        chiitoitsu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaplayer.stop();
                mediaplayer = MediaPlayer.create(Ichihime_Result.this, R.raw.ichi_fan_chiitoitsu);
                mediaplayer.start();
            }
        });

        toitoi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaplayer.stop();
                mediaplayer = MediaPlayer.create(Ichihime_Result.this, R.raw.ichi_fan_toitoi);
                mediaplayer.start();
            }
        });

        sanshokudojun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaplayer.stop();
                mediaplayer = MediaPlayer.create(Ichihime_Result.this, R.raw.ichi_fan_sanshokudoujun);
                mediaplayer.start();
            }
        });

        sanshokudoukou.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaplayer.stop();
                mediaplayer = MediaPlayer.create(Ichihime_Result.this, R.raw.ichi_fan_sanshokudoukou);
                mediaplayer.start();
            }
        });

        sanankou.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaplayer.stop();
                mediaplayer = MediaPlayer.create(Ichihime_Result.this, R.raw.ichi_fan_sanankou);
                mediaplayer.start();
            }
        });

        sankantsu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaplayer.stop();
                mediaplayer = MediaPlayer.create(Ichihime_Result.this, R.raw.ichi_fan_sankantsu);
                mediaplayer.start();
            }
        });

        ittsu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaplayer.stop();
                mediaplayer = MediaPlayer.create(Ichihime_Result.this, R.raw.ichi_fan_itsuu);
                mediaplayer.start();
            }
        });

        chanta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaplayer.stop();
                mediaplayer = MediaPlayer.create(Ichihime_Result.this, R.raw.ichi_fan_chanta);
                mediaplayer.start();
            }
        });

        shousangen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaplayer.stop();
                mediaplayer = MediaPlayer.create(Ichihime_Result.this, R.raw.ichi_fan_shousangen);
                mediaplayer.start();
            }
        });

        honroutou.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaplayer.stop();
                mediaplayer = MediaPlayer.create(Ichihime_Result.this, R.raw.ichi_fan_honroutou);
                mediaplayer.start();
            }
        });

        ryanpeikou.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaplayer.stop();
                mediaplayer = MediaPlayer.create(Ichihime_Result.this, R.raw.ichi_fan_ryanpeikou);
                mediaplayer.start();
            }
        });

        junchan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaplayer.stop();
                mediaplayer = MediaPlayer.create(Ichihime_Result.this, R.raw.ichi_fan_junchan);
                mediaplayer.start();
            }
        });

        honiisou.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaplayer.stop();
                mediaplayer = MediaPlayer.create(Ichihime_Result.this, R.raw.ichi_fan_honitsu);
                mediaplayer.start();
            }
        });

        chinitsu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaplayer.stop();
                mediaplayer = MediaPlayer.create(Ichihime_Result.this, R.raw.ichi_fan_chinitsu);
                mediaplayer.start();
            }
        });

        nagashi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaplayer.stop();
                mediaplayer = MediaPlayer.create(Ichihime_Result.this, R.raw.ichi_fan_nagashi);
                mediaplayer.start();
            }
        });

        tenhou.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaplayer.stop();
                mediaplayer = MediaPlayer.create(Ichihime_Result.this, R.raw.ichi_fan_tenhou);
                mediaplayer.start();
            }
        });

        chiihou.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaplayer.stop();
                mediaplayer = MediaPlayer.create(Ichihime_Result.this, R.raw.ichi_fan_chiihou);
                mediaplayer.start();
            }
        });

        kokushi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaplayer.stop();
                mediaplayer = MediaPlayer.create(Ichihime_Result.this, R.raw.ichi_fan_kokushimusou);
                mediaplayer.start();
            }
        });

        kokushi13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaplayer.stop();
                mediaplayer = MediaPlayer.create(Ichihime_Result.this, R.raw.ichi_fan_kokushimusou13);
                mediaplayer.start();
            }
        });

        suuankou.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaplayer.stop();
                mediaplayer = MediaPlayer.create(Ichihime_Result.this, R.raw.ichi_fan_suuankou);
                mediaplayer.start();
            }
        });

        suuankou1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaplayer.stop();
                mediaplayer = MediaPlayer.create(Ichihime_Result.this, R.raw.ichi_fan_suuankoutanki);
                mediaplayer.start();
            }
        });

        chuuren.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaplayer.stop();
                mediaplayer = MediaPlayer.create(Ichihime_Result.this, R.raw.ichi_fan_chuuren);
                mediaplayer.start();
            }
        });

        chuuren9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaplayer.stop();
                mediaplayer = MediaPlayer.create(Ichihime_Result.this, R.raw.ichi_fan_chuuren9);
                mediaplayer.start();
            }
        });

        ryuuiisou.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaplayer.stop();
                mediaplayer = MediaPlayer.create(Ichihime_Result.this, R.raw.ichi_fan_ryuuiisou);
                mediaplayer.start();
            }
        });

        tsuuiisou.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaplayer.stop();
                mediaplayer = MediaPlayer.create(Ichihime_Result.this, R.raw.ichi_fan_tsuuiisou);
                mediaplayer.start();
            }
        });

        daisangen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaplayer.stop();
                mediaplayer = MediaPlayer.create(Ichihime_Result.this, R.raw.ichi_fan_daisangen);
                mediaplayer.start();
            }
        });


        shousuushii.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaplayer.stop();
                mediaplayer = MediaPlayer.create(Ichihime_Result.this, R.raw.ichi_fan_shousuushii);
                mediaplayer.start();
            }
        });

        daisuushii.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaplayer.stop();
                mediaplayer = MediaPlayer.create(Ichihime_Result.this, R.raw.ichi_fan_daisuushii);
                mediaplayer.start();
            }
        });

        suukantsu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaplayer.stop();
                mediaplayer = MediaPlayer.create(Ichihime_Result.this, R.raw.ichi_fan_suukantsu);
                mediaplayer.start();
            }
        });

        chinroutou.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaplayer.stop();
                mediaplayer = MediaPlayer.create(Ichihime_Result.this, R.raw.ichi_fan_chinroutou);
                mediaplayer.start();
            }
        });


        dora01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaplayer.stop();
                mediaplayer = MediaPlayer.create(Ichihime_Result.this, R.raw.ichi_fan_dora01);
                mediaplayer.start();
            }
        });

        dora02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaplayer.stop();
                mediaplayer = MediaPlayer.create(Ichihime_Result.this, R.raw.ichi_fan_dora02);
                mediaplayer.start();
            }
        });

        dora03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaplayer.stop();
                mediaplayer = MediaPlayer.create(Ichihime_Result.this, R.raw.ichi_fan_dora03);
                mediaplayer.start();
            }
        });

        dora04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaplayer.stop();
                mediaplayer = MediaPlayer.create(Ichihime_Result.this, R.raw.ichi_fan_dora04);
                mediaplayer.start();
            }
        });

        dora05.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaplayer.stop();
                mediaplayer = MediaPlayer.create(Ichihime_Result.this, R.raw.ichi_fan_dora05);
                mediaplayer.start();
            }
        });

        dora06.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaplayer.stop();
                mediaplayer = MediaPlayer.create(Ichihime_Result.this, R.raw.ichi_fan_dora06);
                mediaplayer.start();
            }
        });

        dora07.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaplayer.stop();
                mediaplayer = MediaPlayer.create(Ichihime_Result.this, R.raw.ichi_fan_dora07);
                mediaplayer.start();
            }
        });

        dora08.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaplayer.stop();
                mediaplayer = MediaPlayer.create(Ichihime_Result.this, R.raw.ichi_fan_dora08);
                mediaplayer.start();
            }
        });

        dora09.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaplayer.stop();
                mediaplayer = MediaPlayer.create(Ichihime_Result.this, R.raw.ichi_fan_dora09);
                mediaplayer.start();
            }
        });

        dora10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaplayer.stop();
                mediaplayer = MediaPlayer.create(Ichihime_Result.this, R.raw.ichi_fan_dora10);
                mediaplayer.start();
            }
        });

        dora11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaplayer.stop();
                mediaplayer = MediaPlayer.create(Ichihime_Result.this, R.raw.ichi_fan_dora11);
                mediaplayer.start();
            }
        });

        dora12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaplayer.stop();
                mediaplayer = MediaPlayer.create(Ichihime_Result.this, R.raw.ichi_fan_dora12);
                mediaplayer.start();
            }
        });

        dora13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaplayer.stop();
                mediaplayer = MediaPlayer.create(Ichihime_Result.this, R.raw.ichi_fan_dora13);
                mediaplayer.start();
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });



    }
}
