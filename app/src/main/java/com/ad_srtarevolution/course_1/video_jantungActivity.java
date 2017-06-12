package com.ad_srtarevolution.course_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.net.Uri;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.VideoView;
import android.widget.MediaController;
import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayer.ErrorReason;
import com.google.android.youtube.player.YouTubePlayer.PlaybackEventListener;
import com.google.android.youtube.player.YouTubePlayer.PlayerStateChangeListener;
import com.google.android.youtube.player.YouTubePlayer.Provider;
import com.google.android.youtube.player.YouTubePlayerFragment;
import com.google.android.youtube.player.YouTubePlayerView;

import java.util.ArrayList;
import java.util.List;

public class video_jantungActivity extends YouTubeBaseActivity
{
    private  static  final String TAG="video_jantungActivity";
    YouTubePlayerView mYoutubePlayerView;

    YouTubePlayer.OnInitializedListener mOnInitialListener;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_jantung);
        /** inisialisasi YouTube Player View **/
        Log.d(TAG, "onCreate: Starting.");

        mYoutubePlayerView = (YouTubePlayerView) findViewById(R.id.view);

        // Log.d(TAG,"onClick: Initializing Youtube Player.");

        mOnInitialListener = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                Bundle mBundle=getIntent().getExtras();
                Log.d(TAG, "onClick: Done Initializing .");
//                List<String> videoList=new ArrayList<>();
//                videoList.add("W4hTJybfU7s");
//                videoList.add("Be5EYyd_OH8");
                youTubePlayer.loadVideo(mBundle.getString("video"));
                //youTubePlayer.loadPlaylist("https://youtu.be/W4hTJybfU7s");
            }

            @Override
            public void onInitializationFailure(Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
                Log.d(TAG, "onClick: Failed to Initializing .");
            }
        };
        mYoutubePlayerView.initialize(YoutubeConfig.getApiKey(), mOnInitialListener);
    }
}