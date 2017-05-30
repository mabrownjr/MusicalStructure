package com.example.android.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class ArtistsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artists);

        final Button artist1Button = (Button) findViewById(R.id.artist_1);
        final Button artist2Button = (Button) findViewById(R.id.artist_2);

        artist1Button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent songsIntent = new Intent(ArtistsActivity.this, SongsActivity.class);
                startActivity(songsIntent);
            }

        });
        artist2Button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent songsIntent = new Intent(ArtistsActivity.this, SongsActivity.class);
                startActivity(songsIntent);
            }

        });
    }
}
