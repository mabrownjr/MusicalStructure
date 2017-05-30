package com.example.android.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class SongsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);

        final Button song1Button = (Button) findViewById(R.id.song_1);
        final Button song2Button = (Button) findViewById(R.id.song_2);

        song1Button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent nowPlayingIntent = new Intent(SongsActivity.this, NowPlayingActivity.class);
                startActivity(nowPlayingIntent);
            }

        });

        song2Button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent nowPlayingIntent = new Intent(SongsActivity.this, NowPlayingActivity.class);
                startActivity(nowPlayingIntent);
            }

        });
    }
}
