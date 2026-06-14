package com.entornos;

public abstract class Producto {
    
    private String codigo;
    private String nombre;
    private String autor;
    private double precio;

    public Producto (String codigo, String nombre, String autor, double precio){
        if (precio < 0) {
            throw new IllegalArgumentException("El precio no puede ser negativo");
        }
        this.codigo = codigo;
        this.nombre = nombre;
        this.autor = autor;
        this.precio = precio;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
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

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString(){
        String salida = "Codigo: " + this.codigo + "\n";
        salida += "Nombre: " + this.nombre + "\n";
        salida += "Autor: " + this.autor + "\n";
        salida += "Precio: " + this.precio + "\n";

        return salida;
    }

    public abstract double calcularPrecioFinal();

}
