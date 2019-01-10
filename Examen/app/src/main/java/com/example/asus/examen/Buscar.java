package com.example.asus.examen;

import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.asus.examen.helper.RecintoHelper;

public class Buscar extends AppCompatActivity {

    Button boton;
    EditText caja;
    RecintoHelper recintoHelper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buscar);
        boton = (Button)findViewById(R.id.btnBuscar);
        caja = (EditText)findViewById(R.id.txtCedulaC);


        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog dialogResultado = new Dialog(Buscar.this);
                dialogResultado.setContentView(R.layout.dlg_resultado);
                TextView re = (TextView)dialogResultado.findViewById(R.id.txtresultado);

                re.setText(recintoHelper.buscar(caja.getText().toString()));
            }
        });
    }
}
