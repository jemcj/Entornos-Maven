package com.entornos;

import java.time.LocalDate;

public class Factura {

    private int codigo_factura;
    private LocalDate fecha_emision;
    private double total_neto;
    private double total_IVA;
    private double total_envio;
    private double total_final;

    public Factura (int codigo_factura, LocalDate fecha_emision, double total_neto, double total_IVA, double total_envio, double total_final) {
        this.codigo_factura = codigo_factura;
        this.fecha_emision = LocalDate.now();
        this.total_neto = total_neto;
        this.total_IVA = total_IVA;
        this.total_envio = total_envio;
        this.total_final = total_final;
    }

    public int getCodigo_factura() {
        return codigo_factura;
    }

    public void setCodigo_factura(int codigo_factura) {
        this.codigo_factura = codigo_factura;
    }

    public LocalDate getFecha_emision() {
        return fecha_emision;
    }

    //No hay setFecha_emision porque no tiene sentido añadirla, si se genera automaticamente con la fecha de hoy, no hay porque cambiarla a mano mas tarde.

    public double getTotal_neto() {
        return total_neto;
    }

    public void setTotal_neto(double total_neto) {
        this.total_neto = total_neto;
    }

    public double getTotal_IVA() {
        return total_IVA;
    }

    public void setTotal_IVA(double total_IVA) {
        this.total_IVA = total_IVA;
    }

    public double getTotal_envio() {
        return total_envio;
    }

    public void setTotal_envio(double total_envio) {
        this.total_envio = total_envio;
    }

    public double getTotal_final() {
        return total_final;
    }

    public void setTotal_final(double total_final) {
        this.total_final = total_final;
    }

    @Override
    public String toString() {
        StringBuilder factura = new StringBuilder(" ---/ Factura /---" + "\n");
        factura.append("Codigo: " + this.codigo_factura + "\n");
        factura.append("Fecha: " + this.fecha_emision + "\n");
        factura.append("Precio total neto: " + this.total_neto + "\n");
        factura.append("Coste total del IVA: " + this.total_IVA + "\n");
        factura.append("Coste total del envio: " + this.total_envio + "\n" + "\n");
        factura.append("PRECIO TOTAL: " + this.total_final);
        
        return factura.toString();
    }
    
}
