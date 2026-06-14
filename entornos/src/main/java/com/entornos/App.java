package com.entornos;

public class App {

    public static void main(String[] args) {
        System.out.println("- Cliente:");
        Cliente c1 = new Cliente("Fernando Alonso", "elnano@gmail,com", "Calle Desengaño, 33");
        ProductoFisico pr1 = new ProductoFisico("1993XJ220", "F1: Anatomia de una pasion", "Victor Abad", 19.95, 239, 4, "98JS9684DH4");
        ProductoDigital pr2 = new ProductoDigital("2010RB600", "Como hacer un coche", "Adrian Newey", 27.50, 6, "PDF");
        ProductoDigital pr3 = new ProductoDigital("1988MP404", "Los Juegos del Hambre", "Suzanne Collins", 12.30, 4, "PDF");

        Pedido pe1 = new Pedido("F01I91U10M88", c1);
        pe1.agregarProducto(pr1);
        pe1.agregarProducto(pr2);
        pe1.agregarProducto(pr3);

        String resumen = pe1.mostrarResumen();
        System.out.println(resumen);

    }

}



