package com.utec.ja.pi2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Profesor(View view){
        Intent i = new Intent(this, profesor.class);
        startActivity(i);
    }
    public void Estudiante(View view){
        Intent i = new Intent(this, alumno.class);
        startActivity(i);
    }
    public void onClick(View view){
        Intent i = new Intent(this, alumno.class);
        Intent e = new Intent(this, profesor.class);
        switch (view.getId()) {
            case R.id.btnProfe:
                startActivity(i);
                break;
            case R.id.btnAlumno:
                startActivity(e);
                break;
        }
    }

}