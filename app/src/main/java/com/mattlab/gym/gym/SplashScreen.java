package com.mattlab.gym.gym;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.ProgressBar;

/**
 * Created by EXT on 2016. 03. 23..
 */
public class SplashScreen extends AppCompatActivity {

    private ImageView mImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.splashscreen);


        mImageView = (ImageView) findViewById(R.id.splashimage);
        Animation animation1=new TranslateAnimation(0.0f, -200.0f, 0.0f, 0.0f);
        animation1.setDuration(15000);
        mImageView.startAnimation(animation1);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent i=new Intent(SplashScreen.this,MainActivity.class);
                startActivity(i);
            }
        }, 1000);

    }
}