package com.gashe.myintentservice;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.util.Log;
import android.widget.ImageView;

public class DescargaReceiver extends BroadcastReceiver {

    private Context contexto;

    public DescargaReceiver(Context contexto) {
        this.contexto = contexto;
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO: This method is called when the BroadcastReceiver is receiving
        // an Intent broadcast.
        Log.d(getClass().getCanonicalName(), "SERVICIO FINALIZADO");

        Bitmap bitmap = (Bitmap) intent.getParcelableExtra("imagen");

        MainActivity activity = (MainActivity) contexto;
        activity.setEscudo(bitmap);

    }
}
