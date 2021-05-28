package com.example.attempt3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class MainActivity2 extends YouTubeBaseActivity {
    YouTubePlayerView mYoutubePlayerView;
    YouTubePlayer.OnInitializedListener mOnInitializedListner;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        mYoutubePlayerView = findViewById(R.id.view);

        Intent intent = getIntent();
        String url = intent.getStringExtra("url");






        mOnInitializedListner = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                youTubePlayer.loadVideo(url);
            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

            }
        };

                mYoutubePlayerView.initialize(YoutubeConfig.getApiKey(),mOnInitializedListner);






    }


}