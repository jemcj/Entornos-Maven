package com.entornos;

public class ProductoFisico extends Producto{
    
    private int numero_paginas;
    private double coste_envio;
    private String codigo_seguimiento;

    public ProductoFisico (String codigo, String nombre, String autor, double precio, int numero_paginas, double coste_envio, String codigo_seguimiento){
        super(codigo, nombre, autor, precio);
        this.numero_paginas = numero_paginas;
        this.coste_envio = coste_envio;
        this.codigo_seguimiento = codigo_seguimiento;
    }

    public int getNumero_paginas() {
        return numero_paginas;
    }

    public void setNumero_paginas(int numero_paginas) {
        this.numero_paginas = numero_paginas;
    }

    public double getCoste_envio() {
        return coste_envio;
    }

    public void setCoste_envio(double coste_envio) {
        this.coste_envio = coste_envio;
    }

    public String getCodigo_seguimiento() {
        return codigo_seguimiento;
    }

    public void setCodigo_seguimiento(String codigo_seguimiento) {
        this.codigo_seguimiento = codigo_seguimiento;
    }

    @Override
    public String toString(){
        String salida = super.toString();
        salida += "Numero de paginas: " + this.numero_paginas + "\n";
        salida += "Coste de envio: " + this.coste_envio + "\n";
        salida += "Codigo de seguimiento: " + this.codigo_seguimiento;

        return salida;
    }

    public double calcularPrecioFinal() {

        Double precioFinal = getPrecio() + coste_envio;

        return precioFinal;

    }

}
