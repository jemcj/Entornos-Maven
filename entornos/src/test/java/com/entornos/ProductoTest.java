package com.entornos;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class ProductoTest {

    //@ParameterizedTest(name = "precio={0}, envío={1} → esperado={2}")
    //@DisplayName("T-01 parametrizado: precio final físico con distintos valores")
    //@CsvSource({
    //    "10.0, 2.0, 12.0",
    //    "20.0, 4.0, 24.0",
    //    "50.0, 5.0, 55.0",
    //    "15.0, 0.0, 15.0",
    //    "9.99, 1.01, 11.0"
    //})
    //void T01_calcularPrecioFinal_fisico_parametrizado(
    //        double precio, double envio, double esperado) {
    //    ProductoFisico p = new ProductoFisico("PX", "Test", "Autor", precio, 100, envio, "TX");
    //    assertEquals(esperado, p.calcularPrecioFinal(), 0.001);
    //}
//
    //@ParameterizedTest(name = "precio base = {0}")
    //@DisplayName("T-02 parametrizado: IVA 21% aplicado a distintos precios")
    //@ValueSource(doubles = {10.0, 20.0, 50.0, 100.0})
    //void T02_calcularPrecioFinal_digital_parametrizado(double precio) {
    //    ProductoDigital p = new ProductoDigital("DX", "Test", "Autor", precio, 1, "PDF");
    //    assertEquals(precio * 1.21, p.calcularPrecioFinal(), 0.001);
    //}
//
    //@Test
    //@DisplayName("T-06: Lanza excepción si el precio es negativo")
    //void T06_constructor_precioNegativo_lanzaExcepcion() {
    //    assertThrows(IllegalArgumentException.class, () -> {
    //        new ProductoFisico("F001", "Libro", "Autor", -5.0, 100, 2.0, "TRK1");
    //    });
    //}
    
}
