package com.example.pruebaintents;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class ActividadRecibiendoDatos extends AppCompatActivity {

    EditText miNombre;
    Button botonVolver;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad_recibiendo_datos);

        miNombre= findViewById(R.id.editTextTextPersonName);
        botonVolver= findViewById(R.id.buttonDevolver);
        botonVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                i.putExtra("nombre",miNombre.getText().toString());
                setResult(RESULT_OK,i);
                finish();
            }
        });

    }
}