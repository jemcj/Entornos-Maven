package com.entornos;

public class ProductoDigital extends Producto {
    
    private int tamagno_descarga;
    private String tipo_formato;

    public ProductoDigital (String codigo, String nombre, String autor, double precio, int tamagno_descarga, String tipo_formato){
        super(codigo, nombre, autor, precio);
        this.tamagno_descarga = tamagno_descarga;
        this.tipo_formato = tipo_formato;
    }

    public int getTamagno_descarga() {
        return tamagno_descarga;
    }

    public void setTamagno_descarga(int tamagno_descarga) {
        this.tamagno_descarga = tamagno_descarga;
    }

    public String getTipo_formato() {
        return tipo_formato;
    }

    public void setTipo_formato(String tipo_formato) {
        this.tipo_formato = tipo_formato;
    }
    
    @Override
    public String toString(){
        String salida = super.toString();
        salida += "Tamaño de la descarga (en MB): " + this.tamagno_descarga + "\n";
        salida += "Tipo de formato: " + this.tipo_formato;

        return salida;
    }

    public double calcularPrecioFinal() {

        double precioFinal = getPrecio() + (1 + 0.21);

        return precioFinal;

    }

}
