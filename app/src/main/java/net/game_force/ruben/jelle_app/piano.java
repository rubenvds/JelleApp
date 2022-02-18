package net.game_force.ruben.jelle_app;

import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.app.Activity;



public class piano extends AppCompatActivity {

    MediaPlayer mPlayer;
    int x = 1;
    int currentPos = 0;
    MediaPlayer player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.piano);
        startMusic();

        Button button27 = findViewById(R.id.button27);
        button27.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (mPlayer != null) {
                    mPlayer.release();
                    mPlayer = null;
                }
                mPlayer = MediaPlayer.create(piano.this, R.raw.ezel);
                mPlayer.start();
            }
        });

        Button button17 = findViewById(R.id.button17);
        button17.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (mPlayer != null) {
                    mPlayer.release();
                    mPlayer = null;
                }
                mPlayer = MediaPlayer.create(piano.this, R.raw.eend);
                mPlayer.start();
            }
        });

        Button button21 = findViewById(R.id.button21);
        button21.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (mPlayer != null) {
                    mPlayer.release();
                    mPlayer = null;
                }
                mPlayer = MediaPlayer.create(piano.this, R.raw.kikker);
                mPlayer.start();
            }
        });


        Button button26 = findViewById(R.id.button26);
        button26.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (mPlayer != null) {
                    mPlayer.release();
                    mPlayer = null;
                }
                mPlayer = MediaPlayer.create(piano.this, R.raw.geit);
                mPlayer.start();
            }
        });

        Button button25 = findViewById(R.id.button25);
        button25.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (mPlayer != null) {
                    mPlayer.release();
                    mPlayer = null;
                }
                mPlayer = MediaPlayer.create(piano.this, R.raw.aap);
                mPlayer.start();
            }
        });

        Button button23 = findViewById(R.id.button23);
        button23.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (mPlayer != null) {
                    mPlayer.release();
                    mPlayer = null;
                }
                mPlayer = MediaPlayer.create(piano.this, R.raw.paard);
                mPlayer.start();
            }
        });

        Button button24 = findViewById(R.id.button24);
        button24.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (mPlayer != null) {
                    mPlayer.release();
                    mPlayer = null;
                }
                mPlayer = MediaPlayer.create(piano.this, R.raw.hond);
                mPlayer.start();
            }
        });
        Button button22 = findViewById(R.id.button22);
        button22.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (mPlayer != null) {
                    mPlayer.release();
                    mPlayer = null;
                }
                mPlayer = MediaPlayer.create(piano.this, R.raw.olifant);
                mPlayer.start();
            }
        });
        Button button28 = findViewById(R.id.button28);
        button28.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (mPlayer != null) {
                    mPlayer.release();
                    mPlayer = null;
                }
                mPlayer = MediaPlayer.create(piano.this, R.raw.leeuw);
                mPlayer.start();
            }
        });

        final ImageButton button = findViewById(R.id.imageButton);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ImageButton Imagebutton = findViewById(R.id.imageButton);
                if (x == 0) {
                    x = 1;
                    button.setImageResource(android.R.drawable.ic_media_pause);
                    startMusic();

                }else{
                    x = 0;
                    //player.pause();
                    button.setImageResource(android.R.drawable.ic_media_play);
                    stopMusic();
                }
            }
        });


        final SharedPreferences sharedPref = this.getSharedPreferences("data", getApplicationContext().MODE_PRIVATE);
        final String WHB = sharedPref.getString("WHB", "");
        ImageView imgvraagteken = findViewById(R.id.imageView12);
        ImageView imgcadeau = findViewById(R.id.imageView13);
        if (WHB == ""){
            imgcadeau.setVisibility(View.VISIBLE);
            imgvraagteken.setVisibility(View.INVISIBLE);
        }else{
            imgcadeau.setVisibility(View.INVISIBLE);
            imgvraagteken.setVisibility(View.VISIBLE);
        }
        Button button29 = findViewById(R.id.button29);
        button29.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (WHB == ""){
                    ImageView imgvraagteken = findViewById(R.id.imageView12);
                    ImageView imgcadeau = findViewById(R.id.imageView13);
                    SharedPreferences.Editor editor = sharedPref.edit();
                    editor.putString("WHB", "True");
                    boolean callback = editor.commit();
                    imgcadeau.setVisibility(View.INVISIBLE);
                    imgvraagteken.setVisibility(View.VISIBLE);
                    stopMusic();
                    Intent start = new Intent(getApplicationContext(), package_opening.class);
                    startActivity(start);
                }else{
                    Uri uriUrl = Uri.parse("https://pornhub.com/users/schapenneuken69");
                    Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                    startActivity(launchBrowser);
                }
            }
        });
    }

    public void startMusic() {
        player = MediaPlayer.create(this, R.raw.disco);
        player.setLooping(true); // Set looping
        player.setVolume(70, 70);
        player.seekTo(currentPos);
        player.start();
    }

    public void stopMusic() {
        currentPos = player.getCurrentPosition();
        player.pause();
    }
}