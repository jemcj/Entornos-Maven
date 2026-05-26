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
            total += p.getPrecio();
            if (p instanceof ProductoFisico) {
                ProductoFisico pf = (ProductoFisico) p; 
                total += pf.getCoste_envio();
            }
        }
        return total;
    }

}
