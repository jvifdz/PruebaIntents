package com.example.pruebaintents;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

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

        
    }
}