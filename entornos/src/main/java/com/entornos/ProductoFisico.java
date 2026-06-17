package com.entornos;

public class ProductoFisico extends Producto{
    
    private int numero_paginas;
    private String codigo_seguimiento;
    private String lugar_envio;
    private int peso;

    public ProductoFisico (String codigo, String nombre, String autor, double precio, int numero_paginas, String codigo_seguimiento, String lugar_envio, int peso){
        super(codigo, nombre, autor, precio);
        this.numero_paginas = numero_paginas;
        this.codigo_seguimiento = codigo_seguimiento;
        this.lugar_envio = lugar_envio;
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

    public String getLugar_envio() {
        return lugar_envio;
    }

    public void setLugar_envio(String lugar_envio) {
        this.lugar_envio = lugar_envio;
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
        salida += "Lugar de envío: " + this.lugar_envio + "\n";
        salida += "Peso: " + this.peso;

        return salida;
    }

    public int costeEnvio(String pais){

        int coste = -1;

        if (lugar_envio.equalsIgnoreCase("España")) {

            coste = 0;

        } else if (lugar_envio.equalsIgnoreCase("Francia") || lugar_envio.equalsIgnoreCase("Italia") || lugar_envio.equalsIgnoreCase("Portugal")) {

            coste = 5;

        } else {

            coste = 10;

        }

        return coste;

    }

    public double calcularPrecioFinal() {

        Double precioFinal = getPrecioBase() + costeEnvio(lugar_envio);

        return precioFinal;

    }

}
