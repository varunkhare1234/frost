package com.studentsearch.xoodle.studentsearch;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

/**
 * Created by aryan on 7/6/17.
 */

public class SplashActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.splashscreen);
    Animation anim1 = AnimationUtils.loadAnimation(this,R.anim.anim_down);
    ImageView img =(ImageView)findViewById(R.id.imageView);
    img.setAnimation(anim1);

//    mprogressBar = (ProgressBar) findViewById(R.id.progressBar);
//    ObjectAnimator anim = ObjectAnimator.ofInt(mprogressBar, "progress", 0, 100);
//    anim.setDuration(2000);
//    anim.setInterpolator(new DecelerateInterpolator());
//    anim.start();

    Handler handler = new Handler();

    handler.postDelayed(new Runnable() {
      @Override
      public void run() {

        startActivity(new Intent(SplashActivity.this,MainActivity.class));
        finish();

      }
    },2000);
  }
}