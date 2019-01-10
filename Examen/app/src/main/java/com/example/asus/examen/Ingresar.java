package com.example.asus.examen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.asus.examen.helper.RecintoHelper;
import com.example.asus.examen.modelo.Recinto;

public class Ingresar extends AppCompatActivity {

    EditText cedula,nombre,recinto,junta,direccion,provincia,canton,parroquia,zona;
    Button crear;
    RecintoHelper recintoHelper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingresar);

          cedula = (EditText)findViewById(R.id.txtCedula);
         nombre = (EditText) findViewById(R.id.txtNombre);
         recinto = (EditText)findViewById(R.id.txtRecinto);
         junta= (EditText) findViewById(R.id.txtJunta);
         direccion = (EditText)findViewById(R.id.txtDireccion);
         provincia = (EditText)findViewById(R.id.txtProvincia);
         canton = (EditText) findViewById(R.id.txtCanton);
         parroquia = (EditText)findViewById(R.id.txtParroquia);
         zona = (EditText) findViewById(R.id.txtZona);
         crear = (Button)findViewById(R.id.btnCrear);
         crear.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Recinto r = new Recinto();
                 r.setCedula(cedula.getText().toString());
                 r.setNombre(nombre.getText().toString());
                 r.setRelectoral(recinto.getText().toString());
                 r.setJunta(junta.getText().toString());
                 r.setDireccion(direccion.getText().toString());
                 r.setProvincia(provincia.getText().toString());
                 r.setCanton(canton.getText().toString());
                 r.setParroquia(parroquia.getText().toString());
                 r.setZona(zona.getText().toString());

                 recintoHelper.insertar(r);



             }
         });

    }
}
