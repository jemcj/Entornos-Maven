package com.entornos;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    
    private String codigo_factura;
    private Cliente clientePedido;
    private List<Producto> listaProductos;

    public Pedido (String codigo_factura, Cliente cliente){
        this.codigo_factura = codigo_factura;
        this.clientePedido = cliente;
        this.listaProductos = new ArrayList<Producto>();
    }

    public String getCodigo_factura() {
        return codigo_factura;
    }

    public void setCodigo_factura(String codigo_factura) {
        this.codigo_factura = codigo_factura;
    }

    public Cliente getClientePedido() {
        return clientePedido;
    }

    public void setClientePedido(Cliente clientePedido) {
        this.clientePedido = clientePedido;
    }

    public List<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(List<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }

    public void agregarProducto(Producto producto){
        this.listaProductos.add(producto);
    }

    public double precioTotal(){
        double total = 0;
        for(Producto p : listaProductos){
            total += p.calcularPrecioFinal();
        }
        return total;
    }

    public String mostrarResumen() {

        StringBuilder resumen = new StringBuilder("Resumen del Pedido" + "\n");

        resumen.append("---------------------------------------------------------------" + "\n");
        resumen.append("Codigo del pedido: " + codigo_factura + "\n");
        resumen.append("----------------------------------------" + "\n");
        resumen.append("Datos del cliente" + "\n");
        resumen.append(codigo_factura);
        resumen.append("----------------------------------------" + "\n");
        resumen.append("Productos");
        
        int contador = 1;

        for (Producto p : listaProductos) {
            resumen.append("Producto " + contador + ":" + "\n");
            resumen.append(p);
            resumen.append("Precio: " + p.calcularPrecioFinal() + "\n");
        }

        resumen.append("Total de precio del pedido: " + precioTotal());

        String sResumen = resumen.toString();

        return sResumen;

    }

}
