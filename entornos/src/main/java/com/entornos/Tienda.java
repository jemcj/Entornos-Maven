package com.entornos;

public class Tienda {

    private Cliente cliente;
    private Pedido pedido;

    public Tienda (Cliente cliente, Pedido pedido) {
        this.cliente = cliente;
        this.pedido = pedido;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Factura realizarVenta (Cliente c, Pedido p) {

        double total_neto = 0;
        double total_IVA = 0;
        double total_envio = 0;
        double total_final = 0;

        //Poner todos los precios en orden
        total_neto = p.precioTotalSinAgnadidos();
        total_IVA = p.calculoTotalIVA();
        total_envio = p.calculoTotalEnvio();
        total_final = p.precioTotal();

        Factura factura = new Factura(0, null, total_neto, total_IVA, total_envio, total_final);
        return factura;

    }
    
}
