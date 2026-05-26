package com.entornos;

public class App {

    public static void main(String[] args) {
        //--------------------------------------------------------------------------------------------------------------------------------------------------------
        System.out.println("- Cliente:");
        Cliente c1 = new Cliente("Fernando Alonso", "elnano@gmail,com", "Calle Desengaño, 33");
        System.out.println("-------------------------------------");
        System.out.println(c1);
        System.out.println("-------------------------------------" + "\n");
        //--------------------------------------------------------------------------------------------------------------------------------------------------------
        System.out.println("- Cesta de la compra:");
        ProductoFisico pr1 = new ProductoFisico("1993XJ220", "F1: Anatomia de una pasion", "Victor Abad", 19.95, 239, 4, "98JS9684DH4");
        System.out.println("Producto 1");
        System.out.println("-------------------------------------");
        System.out.println(pr1);
        System.out.println("-------------------------------------" + "\n");

        ProductoDigital pr2 = new ProductoDigital("2010RB600", "Como hacer un coche", "Adrian Newey", 27.50, 6, "PDF");
        System.out.println("Producto 2");
        System.out.println("-------------------------------------");
        System.out.println(pr2);
        System.out.println("-------------------------------------" + "\n");

        ProductoDigital pr3 = new ProductoDigital("1988MP404", "Los Juegos del Hambre", "Suzanne Collins", 12.30, 4, "PDF");
        System.out.println("Producto 3");
        System.out.println("-------------------------------------");
        System.out.println(pr3);
        System.out.println("-------------------------------------" + "\n");
        //--------------------------------------------------------------------------------------------------------------------------------------------------------
        Pedido pe1 = new Pedido("F01I91U10M88", c1);
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



