package com.entornos;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    
    private String id_pedido;
    private Cliente cliente;
    private List<Producto> listaProductos;
    private int cantidades;

    public Pedido (String codigo_factura, Cliente cliente, int cantidades){
        if (cliente ==  null) {
            throw new IllegalArgumentException("El cliente no puede ser null");
        }
        
        this.id_pedido = codigo_factura;
        this.cliente = cliente;
        this.listaProductos = new ArrayList<Producto>();
        this.cantidades = cantidades;
    }

    public String getId_pedido() {
        return id_pedido;
    }

    public void setId_pedido(String id_pedido) {
        this.id_pedido = id_pedido;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(List<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }

    public int getCantidades() {
        return cantidades;
    }

    public void setCantidades(int cantidades) {
        this.cantidades = cantidades;
    }

    public void agregarProducto(Producto producto){
        if (producto == null) {
            throw new IllegalArgumentException("El producto no puede ser null");
        }
        this.listaProductos.add(producto);
    }

    public void eliminarProducto(String borrado){
        for (Producto p : listaProductos) {
            if (p.getId().equals(borrado) || p.getNombre().equals(borrado)) {
                listaProductos.remove(p);
            }
        }
    }

    public double precioTotal(){
        double total = 0;
        for(Producto p : listaProductos){
            total += p.calcularPrecioFinal(cliente);
        }
        return total;
    }

    public double precioTotalSinAgnadidos(){
        double total = 0;
        for(Producto p : listaProductos){
            total += p.getPrecioBase();
        }
        return total;
    }

    public double calculoTotalIVA(){
        double total = 0;

        for(Producto p : listaProductos){

            if (p instanceof ProductoDigital pd) {

                total += pd.aplicarIVA(cliente.setTipoIVA());
                
            }

        }

        return total;
    }

    public double calculoTotalEnvio(){
        double total = 0;

        for(Producto p : listaProductos){

            if (p instanceof ProductoFisico pf) {

               total += pf.costeEnvio(cliente.getPais());
               
            }

        }

        return total;
    }

}
