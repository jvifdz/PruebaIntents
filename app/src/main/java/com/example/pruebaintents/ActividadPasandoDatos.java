package com.example.pruebaintents;

import android.content.Intent;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class ActividadPasandoDatos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad_pasando_datos);
        Intent i = getIntent();
        if (i!=null){
            String nombre= i.getStringExtra("nombre");
            int edad= i.getIntExtra("edad",0);
            if (nombre!=null){
            Toast.makeText(this,"nombre: "+nombre+" edad: "+edad,Toast.LENGTH_LONG).show();}
        }

    }
}