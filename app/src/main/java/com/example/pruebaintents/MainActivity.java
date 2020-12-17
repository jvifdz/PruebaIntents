package com.example.pruebaintents;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    static final int CODIGO_ACTIVIDAD=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void siguiente(View view) {
        Intent i = new Intent(this, MainActivity2.class);
        startActivity(i);
    }

    public void siguiente2(View view) {

        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com")));
    }

    public void siguiente3(View view) {
        startActivity(new Intent("android.intent.action.MAIN"));


    }

    public void siguiente4(View view) {

        Intent i = new Intent(this, ActividadPasandoDatos.class);
        i.putExtra("nombre","Roberto");
        i.putExtra("edad",46);
        startActivity(i);

    }

    public void siguiente5(View view) {
        Intent i = new Intent(this, ActividadRecibiendoDatos.class);

        startActivityForResult(i, CODIGO_ACTIVIDAD);

    }
    public void onActivityResult(int requestCode,
                                 int resultCode,
                                 Intent data){
        if (requestCode== CODIGO_ACTIVIDAD && resultCode==RESULT_OK){
                if (data.hasExtra("nombre")){
                    String nombre = data.getStringExtra("nombre");
                    Toast.makeText(this,"el dato devuelto es :"+data.getExtras().getString("nombre"),
                    Toast.LENGTH_LONG).show();
                }
        }

    }
}