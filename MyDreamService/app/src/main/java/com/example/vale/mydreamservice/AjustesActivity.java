package com.example.vale.mydreamservice;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class AjustesActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        try {

            Log.d(getClass().getCanonicalName(), "iniciando Ajusetes activity");

            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

        } catch (Throwable t)
        {
            Log.e(getClass().getCanonicalName(), "Error", t);
        }

    }

    public void botonSel (View radio_tocado)
    {
        Log.d(getClass().getCanonicalName(), "Radio buton tocado !");

        int id_view = radio_tocado.getId();

        switch (id_view)
        {
            case R.id.radio_bsk:
                Log.d(getClass().getCanonicalName(), "Ha tocado el boton del Freska");
                //TODO Alamcenar en SharedPreferences la opción elegida, para poder leerla en el servicio
                break;
            case R.id.radio_ZARA:
                Log.d(getClass().getCanonicalName(), "Ha tocado el boton del Zara");
                break;
            case R.id.mango_rdas:
                Log.d(getClass().getCanonicalName(), "Ha tocado el boton de Violeta");
                break;

        }
    }
}
