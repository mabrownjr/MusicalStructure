package com.example.android.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class PlaylistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlist);

        final Button playlist1Button = (Button) findViewById(R.id.playlist_1);
        final Button playlist2Button = (Button) findViewById(R.id.playlist_2);

        playlist1Button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent songsIntent = new Intent(PlaylistActivity.this, SongsActivity.class);
                startActivity(songsIntent);
            }

        });

        playlist2Button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent songsIntent = new Intent(PlaylistActivity.this, SongsActivity.class);
                startActivity(songsIntent);
            }

        });


    }
}
