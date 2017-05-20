package com.gashe.propertyanimationapp;

import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView textView = (TextView)findViewById(R.id.myText);

        //ANIMATION PROPERTY OBJECT ANIMATION
        /*ValueAnimator valueAnimator = (ValueAnimator) android.animation.AnimatorInflater.loadAnimator(this, R.animator.animation_property_object);
        valueAnimator.setTarget(textView);
        valueAnimator.start();


        //ANIMATION PROPERTY ANIMATOR
        /*ValueAnimator va1 = (ValueAnimator)AnimatorInflater.loadAnimator(this, R.animator.animation_propery_animator);
        va1.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animation) {
                float animated_value = (float) animation.getAnimatedValue();
                textView.setTranslationY(animated_value);
            }
        });
        va1.start();*/

        //ANIMATION PROPERTY SET
        AnimatorSet animatorSet = (AnimatorSet) AnimatorInflater.loadAnimator(this, R.animator.animation_property_set);
        animatorSet.setTarget(textView);
        animatorSet.start();

    }
}
