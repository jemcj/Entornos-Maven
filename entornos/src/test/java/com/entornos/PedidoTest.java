package com.entornos;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class PedidoTest {

    private Cliente cliente;
    private Pedido pedido;

    @BeforeEach
    void setUp() {
        cliente = new Cliente("Fernando Alonso", "fnando@test.com", "Calle Mayor 1");
        pedido  = new Pedido("F001", cliente);
    }

    @ParameterizedTest(name = "precioFisico={0}, envío={1}, precioDigital={2} → total={3}")
    @DisplayName("T-03 parametrizado: precioTotal con distintas combinaciones")
    @CsvSource({
        "10.0, 2.0, 10.0, 24.10",
        "20.0, 4.0, 20.0, 48.20",
        "50.0, 5.0, 30.0, 91.30"
    })
    void T03_precioTotal_parametrizado(
            double precFis, double envio,
            double precDig, double esperado) {
        Pedido p = new Pedido("PX", cliente);
        p.agregarProducto(new ProductoFisico("F1", "Fisico", "A", precFis, 100, envio, "T1"));
        p.agregarProducto(new ProductoDigital("D1", "Digital", "A", precDig, 1, "PDF"));
        assertEquals(esperado, p.precioTotal(), 0.001);
    }

    @Test
    @DisplayName("T-04: La lista crece al añadir un producto")
    void T04_agregarProducto_aumentaLista() {
        assertEquals(0, pedido.getListaProductos().size());
        pedido.agregarProducto(new ProductoFisico("F1", "Libro", "Autor", 10.0, 100, 2.0, "TRK1"));
        assertEquals(1, pedido.getListaProductos().size());
    }

    @Test
    @DisplayName("T-07: Lanza excepción si el cliente es null")
    void T07_pedido_clienteNull_lanzaExcepcion() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Pedido("F002", null);
        });
    }

    @Test
    @DisplayName("T-09: Lanza excepción si se añade un producto null")
    void T09_agregarProducto_null_lanzaExcepcion() {
        assertThrows(IllegalArgumentException.class, () -> {
            pedido.agregarProducto(null);
        });
    }

    @Test
    @DisplayName("T-10: El resumen del pedido contiene el nombre del cliente")
    void T10_mostrarResumen_contieneNombreCliente() {
        pedido.agregarProducto(new ProductoFisico("F1", "Libro", "Autor", 20.0, 200, 4.0, "TRK1"));
        String resumen = pedido.mostrarResumen();
        assertTrue(resumen.contains("Fernando Alonso"));
    }
    
}
