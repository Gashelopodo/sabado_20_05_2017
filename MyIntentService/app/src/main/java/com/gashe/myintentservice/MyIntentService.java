package com.gashe.myintentservice;

import android.app.IntentService;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;


/**
 * An {@link IntentService} subclass for handling asynchronous task requests in
 * a service on a separate handler thread.
 * <p>
 * TODO: Customize class - update intent actions and extra parameters.
 */
public class MyIntentService extends IntentService {
    // TODO: Rename actions, choose action names that describe tasks that this


    public MyIntentService() {
        super("MyIntentService");
    }

    private Bitmap getBitmap (String url){
        Bitmap bitmap = null;
        InputStream inputStream = null;
        HttpURLConnection httpURLConnection = null;
        URL url_net = null;
        int response = -1;

        try{
            url_net = new URL(url);
            httpURLConnection = (HttpURLConnection)url_net.openConnection();

            response = httpURLConnection.getResponseCode();
            if(response == HttpURLConnection.HTTP_OK){
                inputStream = httpURLConnection.getInputStream();
                bitmap = BitmapFactory.decodeStream(inputStream);
                inputStream.close();
            }
        }catch (Exception e){
            Log.e(getClass().getCanonicalName(), "ERROR", e);
        }finally {
            if(httpURLConnection != null) httpURLConnection.disconnect();
        }

        return bitmap;
    }

    public Bitmap bitmapCompress(Bitmap bitmap, int alto, int ancho){
        Bitmap bitmap_compress = null;
        bitmap_compress = Bitmap.createScaledBitmap(bitmap, alto, ancho, true);
        return bitmap_compress;
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        // aquí iniciamos el servicio
        Log.d(getClass().getCanonicalName(), "INICIADO INTENT SERVICE");

        //TODO: hago el servicio

        Bitmap bitmap = getBitmap("http://oferplan.lavozdigital.es/images/escudo1.jpg");

        Bitmap bitmap_compress = bitmapCompress(bitmap, 300, 300);

        Intent intentfin = new Intent("IS_END");
        intentfin.putExtra("imagen", bitmap);
        sendBroadcast(intentfin);

    }


}
