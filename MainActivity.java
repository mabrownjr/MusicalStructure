package com.example.android.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button nowPlayingButton = (Button) findViewById(R.id.nowPlaying);
        final Button artistsButton = (Button) findViewById(R.id.artists);
        final Button songsButton = (Button) findViewById(R.id.songs);
        final Button playlistsButton = (Button) findViewById(R.id.playlists);
        final Button lyricsButton = (Button) findViewById(R.id.lyrics);

        nowPlayingButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent nowPlayingIntent = new Intent(MainActivity.this, NowPlayingActivity.class);
                startActivity(nowPlayingIntent);
            }

        });
        artistsButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent artistsIntent = new Intent(MainActivity.this, ArtistsActivity.class);
                startActivity(artistsIntent);
            }

        });
        songsButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent songsIntent = new Intent(MainActivity.this, SongsActivity.class);
                startActivity(songsIntent);
            }

        });
        playlistsButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent playlistsIntent = new Intent(MainActivity.this, PlaylistActivity.class);
                startActivity(playlistsIntent);
            }

        });
        lyricsButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent lyricsIntent = new Intent(MainActivity.this, LyricsActivity.class);
                startActivity(lyricsIntent);
            }

        });


    }
}
