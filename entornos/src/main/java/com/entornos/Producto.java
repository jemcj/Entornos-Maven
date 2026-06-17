package com.entornos;

public abstract class Producto {
    
    private String id;
    private String nombre;
    private String autor;
    private double precioBase;

    public Producto (String codigo, String nombre, String autor, double precio){
        if (precio < 0) {
            throw new IllegalArgumentException("El precio no puede ser negativo");
        }
        this.id = codigo;
        this.nombre = nombre;
        this.autor = autor;
        this.precioBase = precio;
    }

    public String getId() {
        return id;
    }

    public void setId(String codigo) {
        this.id = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    @Override
    public String toString(){
        String salida = "Codigo: " + this.id + "\n";
        salida += "Nombre: " + this.nombre + "\n";
        salida += "Autor: " + this.autor + "\n";
        salida += "Precio: " + this.precioBase + "\n";

        return salida;
    }

    public abstract double calcularPrecioFinal();

}
