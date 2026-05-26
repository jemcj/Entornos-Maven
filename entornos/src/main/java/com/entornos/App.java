package com.entornos;

public class App {

    public static void main(String[] args) {
        //--------------------------------------------------------------------------------------------------------------------------------------------------------
        System.out.println("- Cliente:");
        cliente c1 = new cliente("Fernando Alonso", "elnano@gmail,com", "Calle Desengaño, 33");
        System.out.println("-------------------------------------");
        System.out.println(c1);
        System.out.println("-------------------------------------" + "\n");
        //--------------------------------------------------------------------------------------------------------------------------------------------------------
        System.out.println("- Cesta de la compra:");
        productoFisico pr1 = new productoFisico("1993XJ220", "F1: Anatomia de una pasion", "Victor Abad", 19.95, 239, 4, "98JS9684DH4");
        System.out.println("Producto 1");
        System.out.println("-------------------------------------");
        System.out.println(pr1);
        System.out.println("-------------------------------------" + "\n");

        productoDigital pr2 = new productoDigital("2010RB600", "Como hacer un coche", "Adrian Newey", 27.50, 6, "PDF");
        System.out.println("Producto 2");
        System.out.println("-------------------------------------");
        System.out.println(pr2);
        System.out.println("-------------------------------------" + "\n");

        productoDigital pr3 = new productoDigital("1988MP404", "Los Juegos del Hambre", "Suzanne Collins", 12.30, 4, "PDF");
        System.out.println("Producto 3");
        System.out.println("-------------------------------------");
        System.out.println(pr3);
        System.out.println("-------------------------------------" + "\n");
        //--------------------------------------------------------------------------------------------------------------------------------------------------------
        pedido pe1 = new pedido("F01I91U10M88", c1);
        pe1.agregarProducto(pr1);
        pe1.agregarProducto(pr2);
        pe1.agregarProducto(pr3);
        System.out.println("- Pedido:");
        System.out.println("Codigo de pedido: " + pe1.getCodigo_factura());
        System.out.println("Resumen: ");
        System.out.println("Productos pedidos: " + pr1.getNombre() + " - " + pr1.getPrecio() + " | " + pr2.getNombre() + " - " + pr2.getPrecio() + " | " + pr3.getNombre() + " - " + pr3.getPrecio() );
        System.out.println("Precio total: " + pe1.precioTotal());

    }

}



