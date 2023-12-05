package com.example.examen_lvaronistalguerrero;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MenuDeInicio extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menudeinicio);
    }
    public void irMainActivity(View v) {
        Intent i = new Intent(this, MainActivity.class);    // Intent se usa para hacer un salto de actividad
        startActivity(i);
    }
    public void salir(View v) {
        finish();
    }
}
