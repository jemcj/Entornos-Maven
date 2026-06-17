package com.entornos;

public class ProductoDigital extends Producto {

    public static final double IVAGENERAL = 0.21;
    public static final double IVAREDUCIDO = 0.1;
    public static final double IVASUPER = 0.04;
    
    private int tamagno_descarga;
    private String tipo_formato;
    private String tipo_IVA;

    public ProductoDigital (String codigo, String nombre, String autor, double precio, int tamagno_descarga, String tipo_formato, String tipo_IVA){
        super(codigo, nombre, autor, precio);
        if (!tipo_IVA.equalsIgnoreCase("GENERAL") && !tipo_IVA.equalsIgnoreCase("REDUCIDO") && !tipo_IVA.equalsIgnoreCase("SUPER")) {
            throw new IllegalArgumentException("El tipo de IVA no es válido");
        }
        this.tamagno_descarga = tamagno_descarga;
        this.tipo_formato = tipo_formato;
        this.tipo_IVA = tipo_IVA;
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

    public String getTipo_IVA() {
        return tipo_IVA;
    }

    public void setTipo_IVA(String tipo_IVA) {
        this.tipo_IVA = tipo_IVA;
    }
    
    @Override
    public String toString(){
        String salida = super.toString();
        salida += "Tamaño de la descarga (en MB): " + this.tamagno_descarga + "\n";
        salida += "Tipo de formato: " + this.tipo_formato;

        return salida;
    }

    public double aplicarIVA(String tipoIva){

        Double cantidadIVA = 0.0;

        if (tipoIva.equalsIgnoreCase("GENERAL")) {

            cantidadIVA = getPrecioBase() * IVAGENERAL;
            
        } else if (tipoIva.equalsIgnoreCase("REDUCIDO")) {

            cantidadIVA = getPrecioBase() * IVAREDUCIDO;
            
        } else {

            cantidadIVA = getPrecioBase() * IVASUPER;

        }

        return cantidadIVA;

    }

    public double calcularPrecioFinal() {

        double precioFinal = getPrecioBase() + aplicarIVA(tipo_IVA);

        return precioFinal;

    }

}
