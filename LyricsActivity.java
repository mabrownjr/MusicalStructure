package com.example.android.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class LyricsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lyrics);

        final Button lyrics1Button = (Button) findViewById(R.id.lyric_1);
        final Button lyrics2Button = (Button) findViewById(R.id.lyric_2);

        lyrics1Button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent nowPlayingIntent = new Intent(LyricsActivity.this, LyricsListActivity.class);
                startActivity(nowPlayingIntent);
            }

        });
        lyrics2Button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent nowPlayingIntent = new Intent(LyricsActivity.this, LyricsListActivity.class);
                startActivity(nowPlayingIntent);
            }

        });
    }
}
