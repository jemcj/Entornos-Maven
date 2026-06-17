package com.entornos;

public class Cliente {
    
    private String id;
    private String nombre;
    private String correo;
    private String pais;
    private String direccion;
    private int agnos_antiguedad;
    private boolean esVip;

    public Cliente (String id, String nombre, String correo, String pais, String direccion, int agnos_antiguedad, boolean esVip){
        if (direccion == null || direccion.isEmpty()) {
            throw new IllegalArgumentException("La dirección no puede estar vacía");
        }
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.pais = pais;
        this.direccion = direccion;
        this.agnos_antiguedad = agnos_antiguedad;
        this.esVip = esVip;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getAgnos_antiguedad() {
        return agnos_antiguedad;
    }

    public void setAgnos_antiguedad(int agnos_antiguedad) {
        this.agnos_antiguedad = agnos_antiguedad;
    }

    public boolean isEsVip() {
        return esVip;
    }

    public void setEsVip(boolean esVip) {
        this.esVip = esVip;
    }

    @Override
    public String toString(){
        String salida = "ID: " + this.id + "\n";
        salida += "Nombre: " + this.nombre + "\n";
        salida += "Correo: " + this.correo + "\n";
        salida += "Pais: " + this.pais + "\n";
        salida += "Direccion: " + this.direccion + "\n";
        salida += "Años de antiguedad: " + this.agnos_antiguedad + "\n";
        salida += "Es VIP: " + this.esVip + "\n";

        return salida;
    }

    public String setTipoIVA () {

        String tipo = "";

        if (esVip == true || agnos_antiguedad >= 10) {

            tipo = "SUPER";
            return tipo;

        } else if (agnos_antiguedad >= 5) {

            tipo = "REDUCIDO";
            return tipo;

        } else {

            tipo = "GENERAL";
            return tipo;

        }

    }

}
