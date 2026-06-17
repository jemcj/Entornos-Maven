package com.entornos;

public class App {

    public static void main(String[] args) {
        
        Cliente c1 = new Cliente("ID0118TYT2126MRMRFMAAM", "Fernando Alonso", "fa14@gmail.com", "España", "Calle Desengaño, 33", 23, true);
        ProductoFisico pr1 = new ProductoFisico("1993XJ220", "F1: Anatomia de una pasion", "Victor Abad", 19.95, 239, "98JS9684DH4", 1);
        ProductoDigital pr2 = new ProductoDigital("2010RB600", "Como hacer un coche", "Adrian Newey", 27.50, 6, "PDF");
        ProductoDigital pr3 = new ProductoDigital("1988MP404", "Los Juegos del Hambre", "Suzanne Collins", 12.30, 4, "PDF");
        ProductoFisico pr4 = new ProductoFisico("1991JO191", "Cero a Cien: Numero 18", "Varios Autores", 16.95, 160, "26TY2325FE3", 1);


        Pedido pe1 = new Pedido("null", c1, 4);
        pe1.agregarProducto(pr1);
        pe1.agregarProducto(pr2);
        pe1.agregarProducto(pr3);
        pe1.agregarProducto(pr4);

        Tienda t1 = new Tienda(c1, pe1);
        Factura factura = t1.realizarVenta(c1, pe1);

        
        System.out.println(factura);

    }

}



