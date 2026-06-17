package com.entornos;

public class ProductoFisico extends Producto{
    
    private int numero_paginas;
    private String codigo_seguimiento;
    private int peso;

    public ProductoFisico (String codigo, String nombre, String autor, double precio, int numero_paginas, String codigo_seguimiento, int peso){
        super(codigo, nombre, autor, precio);
        this.numero_paginas = numero_paginas;
        this.codigo_seguimiento = codigo_seguimiento;
        this.peso = peso;
    }

    public int getNumero_paginas() {
        return numero_paginas;
    }

    public void setNumero_paginas(int numero_paginas) {
        this.numero_paginas = numero_paginas;
    }

    public String getCodigo_seguimiento() {
        return codigo_seguimiento;
    }

    public void setCodigo_seguimiento(String codigo_seguimiento) {
        this.codigo_seguimiento = codigo_seguimiento;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public String toString(){
        String salida = super.toString();
        salida += "Numero de paginas: " + this.numero_paginas + "\n";
        salida += "Codigo de seguimiento: " + this.codigo_seguimiento + "\n";
        salida += "Peso: " + this.peso;

        return salida;
    }

    public int costeEnvio(String pais){

        int coste = -1;

        if (pais.equalsIgnoreCase("España")) {

            coste = 0;

        } else if (pais.equalsIgnoreCase("Francia") || pais.equalsIgnoreCase("Italia") || pais.equalsIgnoreCase("Portugal")) {

            coste = 5;

        } else {

            coste = 10;

        }

        return coste;

    }

    public double calcularPrecioFinal(Cliente c) {

        Double precioFinal = getPrecioBase() + costeEnvio(c.getPais());

        return precioFinal;

    }

}
