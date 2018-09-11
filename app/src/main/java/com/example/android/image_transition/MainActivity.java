package com.example.android.image_transition;

import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {
ImageView imageView3,imageView4,imageView5;
RelativeLayout linearLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView3= (ImageView)findViewById(R.id.imageView3);

        linearLayout  =findViewById(R.id.linearLayout);

        TranslateAnimation animation = new TranslateAnimation(-1150.0f, 1150.0f, 0.0f, 0.0f);
        animation.setDuration(3000);
        animation.setRepeatCount(5);
        animation.setRepeatMode(1);
        linearLayout.startAnimation(animation);

        imageView4= (ImageView)findViewById(R.id.imageView4);
        imageView5= (ImageView)findViewById(R.id.imageView5);

        AnimatorSet wheelSet = (AnimatorSet) AnimatorInflater.loadAnimator(this, R.animator.wheel_spin);
        wheelSet.setTarget(imageView4);
        wheelSet.start();
        AnimatorSet wheelSet1 = (AnimatorSet) AnimatorInflater.loadAnimator(this, R.animator.wheel_spin);
        wheelSet1.setTarget(imageView5);
        wheelSet1.start();

    }
}
