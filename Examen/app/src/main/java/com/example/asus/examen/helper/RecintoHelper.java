package com.example.asus.examen.helper;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.asus.examen.modelo.Recinto;

import java.util.ArrayList;
import java.util.List;

public class RecintoHelper extends SQLiteOpenHelper {
    public RecintoHelper( Context context, String name,  SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE recinto (ID INTEGER PRIMARY KEY AUTOINCREMENT,cedula VARCHAR(10) NOT NULL,nombre VARCHAR(100) NOT NULL, relectoral VARCHAR(100), junta VARCHAR(100),direccion VARCHAR(100),provincia VARCHAR(100),canton VARCHAR(100),parroquia VARCHAR(100),zona VARCHAR(100))");
    }
    public  void insertar(Recinto recinto) {
        ContentValues valores = new ContentValues();
        valores.put("cedula", recinto.getCedula());
        valores.put("nombre", recinto.getNombre());
        valores.put("relectoral", recinto.getRelectoral());
        valores.put("junta", recinto.getJunta());
        valores.put("direccion", recinto.getDireccion());
        valores.put("provincia", recinto.getProvincia());
        valores.put("canton", recinto.getCanton());
        valores.put("parroquia", recinto.getParroquia());
        valores.put("zona", recinto.getZona());
        this.getWritableDatabase().insert("recinto", null, valores);
    }
    public String buscar(String c) {
        Cursor cursor = this.getReadableDatabase().rawQuery("select *from recinto where cedula ="+ c , null);
        String consulta = "";
        if (cursor.moveToFirst()) {
            do {
                String cedula = cursor.getString(cursor.getColumnIndex("cedula"));
                String nombre = cursor.getString(cursor.getColumnIndex("nombre"));
                String relectoral = cursor.getString(cursor.getColumnIndex("relectoral"));
                String junta = cursor.getString(cursor.getColumnIndex("junta"));
                String direccion = cursor.getString(cursor.getColumnIndex("direccion"));
                String provincia = cursor.getString(cursor.getColumnIndex("provincia"));
                String canton = cursor.getString(cursor.getColumnIndex("canton"));
                String parroquia = cursor.getString(cursor.getColumnIndex("parroquia"));
                String zona = cursor.getString(cursor.getColumnIndex("zona"));

                consulta = "Nombre: " + nombre + "\n" + "Recinto: " + relectoral + "\n" + "Junta:" + junta + "\n" + "Direccion" + direccion + "\n" +"Provincia: "+ provincia+ "\n" +"Canton: " +canton+ "\n" + "Parroquia: " +parroquia + "\n" + "Zona" + zona;

            } while (cursor.moveToNext());
        }
        return consulta;
    }
    public List<Recinto> leerTodos(){
        List<Recinto> lista = new ArrayList<>();
        Cursor cursor = this.getReadableDatabase().rawQuery("SELECT *FROM RECINTO", null);
        if (cursor.moveToFirst()){
            do {
                String cedula = cursor.getString(cursor.getColumnIndex("cedula"));
                String nombre = cursor.getString(cursor.getColumnIndex("nombre"));
                String relectoral = cursor.getString(cursor.getColumnIndex("relectoral"));
                String junta = cursor.getString(cursor.getColumnIndex("junta"));
                String direccion = cursor.getString(cursor.getColumnIndex("direccion"));
                String provincia = cursor.getString(cursor.getColumnIndex("provincia"));
                String canton = cursor.getString(cursor.getColumnIndex("canton"));
                String parroquia = cursor.getString(cursor.getColumnIndex("parroquia"));
                String zona = cursor.getString(cursor.getColumnIndex("zona"));


                Recinto recinto = new Recinto();
                recinto.setCedula(cedula);
                recinto.setNombre(nombre);
                recinto.setRelectoral(relectoral);
                recinto.setJunta(junta);
                recinto.setDireccion(direccion);
                recinto.setProvincia(provincia);
                recinto.setCanton(canton);
                recinto.setParroquia(parroquia);
                recinto.setZona(zona);
                lista.add(recinto);
            }while(cursor.moveToNext());
        }
        return lista;
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
