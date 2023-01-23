package com.devdroid.videoplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {
    VideoView videoView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        videoView = findViewById(R.id.videoPlayer);

        // Path
        String videoPath = "android.resource://"+getPackageName()+"/raw/strange";

        Uri videoURI = Uri.parse(videoPath);

        //videoView.setVideoPath(videoPath);
        videoView.setVideoURI(videoURI);
        videoView.start();

        MediaController controller = new MediaController(this);
        videoView.setMediaController(controller);
        controller.setAnchorView(videoView);
    }
}