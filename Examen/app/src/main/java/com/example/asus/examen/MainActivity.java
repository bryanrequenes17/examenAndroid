package com.example.asus.examen;

import android.app.Dialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.asus.examen.helper.RecintoHelper;
import com.example.asus.examen.modelo.Recinto;

import java.io.BufferedReader;

public class MainActivity extends AppCompatActivity {
    Button boton1, boton2;
    RecintoHelper recintoHelper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        boton1 = (Button)findViewById(R.id.btnIngresar);
        boton2 = (Button)findViewById(R.id.btnConsultar);
        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( MainActivity.this, Ingresar.class);
                startActivity(intent);
            }
        });
        boton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( MainActivity.this, Buscar.class);
                startActivity(intent);
            }
        });



    }



    }

