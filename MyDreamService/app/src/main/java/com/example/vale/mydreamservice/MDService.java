package com.example.vale.mydreamservice;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.service.dreams.DreamService;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.Menu;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class MDService extends DreamService {


    private final static int[] array_img = {  R.drawable.pic2, R.drawable.pic1  };


    private void lapso ()
    {
        for (long i = 0; i < 50000 ; i ++) {
            for (long z = 0; z < 5000 ; z ++) {

            }
        }
    }
    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setInteractive(false);
        // Hide system UI
        setFullscreen(true);
        // Set the dream layout


        Log.d(getClass().getCanonicalName(), "On attached window...");
        setContentView(R.layout.dream);
/**
 *
 * preparamos el tema de la animación, asociándolo
 */
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.lay_padre);

        Animation animation = AnimationUtils.loadAnimation(this, R.anim.animacion_sogni);
        animation.reset();

        linearLayout.startAnimation(animation);


    }
    @Override
    public void onDreamingStarted() {

        super.onDreamingStarted();

    }


}
