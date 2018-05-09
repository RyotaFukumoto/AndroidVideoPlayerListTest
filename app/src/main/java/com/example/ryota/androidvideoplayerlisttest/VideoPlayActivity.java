package com.example.ryota.androidvideoplayerlisttest;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;
import android.widget.VideoView;


public class VideoPlayActivity extends AppCompatActivity {
    private VideoView videoView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        videoView = findViewById(R.id.videoView);
        TextView textView = findViewById(R.id.textView);
        Intent intent = getIntent();

        String path = intent.getStringExtra("text");
        videoView = new VideoView(this);
        setContentView(videoView);
        Log.d("test12",""+ path);
        videoView.setVideoPath("android.resource://" + this.getPackageName() + '/' + path);
        videoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                videoView.start();

            }
        });

    }
}