package com.example.minecraftvoices;

import androidx.appcompat.app.AppCompatActivity;

import android.media.DrmInitData;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10, btn11, btn12, btn13, btn14;
    MediaPlayer mp;

    {
        mp = null;
    }

    TextView txt;
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // ids:
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btn10 = findViewById(R.id.btn10);
        btn11 = findViewById(R.id.btn11);
        btn12 = findViewById(R.id.btn12);
        btn13 = findViewById(R.id.btn13);
        btn14 = findViewById(R.id.btn14);

        // others
        txt = (TextView)findViewById(R.id.textView);
        img = (ImageView)findViewById(R.id.imageView);

        // events
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btn10.setOnClickListener(this);
        btn11.setOnClickListener(this);
        btn12.setOnClickListener(this);
        btn13.setOnClickListener(this);
        btn14.setOnClickListener(this);
    }

    // method
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn1:
                if (mp != null) {
                    mp.stop();
                    mp.release();
                    mp = null;
                }
                mp = MediaPlayer.create(MainActivity.this, R.raw.music_thirteen);
                mp.start();
                txt.setText("C418 - Thirteen");
                img.setImageResource(R.drawable.art_thirteen);
                break;
            case R.id.btn2:
                if (mp != null) {
                    mp.stop();
                    mp.release();
                    mp = null;
                }
                mp = MediaPlayer.create(MainActivity.this, R.raw.music_cat);
                mp.start();
                txt.setText("C418 - Cat");
                img.setImageResource(R.drawable.art_cat);
                break;
            case R.id.btn3:
                if (mp != null) {
                    mp.stop();
                    mp.release();
                    mp = null;
                }
                mp = MediaPlayer.create(MainActivity.this, R.raw.music_blocks);
                mp.start();
                txt.setText("C418 - Blocks");
                img.setImageResource(R.drawable.art_blocks);
                break;
            case R.id.btn4:
                if (mp != null) {
                    mp.stop();
                    mp.release();
                    mp = null;
                }
                mp = MediaPlayer.create(MainActivity.this, R.raw.music_chirp);
                mp.start();
                txt.setText("C418 - Chirp");
                img.setImageResource(R.drawable.art_chirp);
                break;
            case R.id.btn5:
                if (mp != null) {
                    mp.stop();
                    mp.release();
                    mp = null;
                }
                mp = MediaPlayer.create(MainActivity.this, R.raw.music_far);
                mp.start();
                txt.setText("C418 - Far");
                img.setImageResource(R.drawable.art_far);
                break;
            case R.id.btn6:
                if (mp != null) {
                    mp.stop();
                    mp.release();
                    mp = null;
                }
                mp = MediaPlayer.create(MainActivity.this, R.raw.music_mall);
                mp.start();
                txt.setText("C418 - Mall");
                img.setImageResource(R.drawable.art_mall);
                break;
            case R.id.btn7:
                if (mp != null) {
                    mp.stop();
                    mp.release();
                    mp = null;
                }
                mp = MediaPlayer.create(MainActivity.this, R.raw.music_mellohi);
                mp.start();
                txt.setText("C418 - Mellohi");
                img.setImageResource(R.drawable.art_mellohi);
                break;
            case R.id.btn8:
                if (mp != null) {
                    mp.stop();
                    mp.release();
                    mp = null;
                }
                mp = MediaPlayer.create(MainActivity.this, R.raw.music_stal);
                mp.start();
                txt.setText("C418 - Stal");
                img.setImageResource(R.drawable.art_stal);
                break;
            case R.id.btn9:
                if (mp != null) {
                    mp.stop();
                    mp.release();
                    mp = null;
                }
                mp = MediaPlayer.create(MainActivity.this, R.raw.music_strad);
                mp.start();
                txt.setText("C418 - Strad");
                img.setImageResource(R.drawable.art_strad);
                break;
            case R.id.btn10:
                if (mp != null) {
                    mp.stop();
                    mp.release();
                    mp = null;
                }
                mp = MediaPlayer.create(MainActivity.this, R.raw.music_ward);
                mp.start();
                txt.setText("C418 - Ward");
                img.setImageResource(R.drawable.art_ward);
                break;
            case R.id.btn11:
                if (mp != null) {
                    mp.stop();
                    mp.release();
                    mp = null;
                }
                mp = MediaPlayer.create(MainActivity.this, R.raw.music_eleven);
                mp.start();
                txt.setText("C418 - Eleven");
                img.setImageResource(R.drawable.art_eleven);
                break;
            case R.id.btn12:
                if (mp != null) {
                    mp.stop();
                    mp.release();
                    mp = null;
                }
                mp = MediaPlayer.create(MainActivity.this, R.raw.music_wait);
                mp.start();
                txt.setText("C418 - Wait");
                img.setImageResource(R.drawable.art_wait);
                break;
            case R.id.btn13:
                if (mp != null) {
                    mp.stop();
                    mp.release();
                    mp = null;
                }
                mp = MediaPlayer.create(MainActivity.this, R.raw.music_pigstep);
                mp.start();
                txt.setText("C418 - Pigstep");
                img.setImageResource(R.drawable.art_pigstep);
                break;
            case R.id.btn14:
                if (mp != null) {
                    mp.stop();
                    mp.release();
                    mp = null;
                }
                mp = MediaPlayer.create(MainActivity.this, R.raw.music_otherside);
                mp.start();
                txt.setText("C418 - Otherside");
                img.setImageResource(R.drawable.art_otherside);
                break;
        }
    }
}