package com.example.asus.examen.modelo;

public class Recinto {
    private String cedula;
    private String nombre;
    private String relectoral;
    private String junta;
    private String direccion;
    private String provincia;
    private String canton;
    private String parroquia;
    private String zona;

    public Recinto() {
    }

    public Recinto(String cedula, String nombre, String relectoral, String junta, String direccion, String provincia, String canton, String parroquia, String zona) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.relectoral = relectoral;
        this.junta = junta;
        this.direccion = direccion;
        this.provincia = provincia;
        this.canton = canton;
        this.parroquia = parroquia;
        this.zona = zona;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRelectoral() {
        return relectoral;
    }

    public void setRelectoral(String relectoral) {
        this.relectoral = relectoral;
    }

    public String getJunta() {
        return junta;
    }

    public void setJunta(String junta) {
        this.junta = junta;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getCanton() {
        return canton;
    }

    public void setCanton(String canton) {
        this.canton = canton;
    }

    public String getParroquia() {
        return parroquia;
    }

    public void setParroquia(String parroquia) {
        this.parroquia = parroquia;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }
}
