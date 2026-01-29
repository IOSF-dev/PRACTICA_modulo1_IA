package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class CalculatorTest {

    @Test
    public void testSuma() {
        assertEquals(5, Calculator.calcular("+", 2, 3), 0.0001);
    }

    @Test
    public void testResta() {
        assertEquals(2.0, Calculator.calcular("-", 5, 3), 0.0001);
    }

    @Test
    public void testMultiplicacion() {
        assertEquals(12.0, Calculator.calcular("*", 4, 3), 0.0001);
    }

    @Test
    public void testDivision() {
        assertEquals(2.0, Calculator.calcular("/", 6, 3), 0.0001);
    }

    @Test
    public void testPotencia() {
        assertEquals(27.0, Calculator.calcular("^", 3, 3), 0.0001);
    }

    @Test
    public void testDivisionPorCero() {
        assertThrows(ArithmeticException.class, () -> Calculator.calcular("/", 1, 0));
    }

    @Test
    public void testOperacionInvalida() {
        assertThrows(IllegalArgumentException.class, () -> Calculator.calcular("?", 2, 2));
    }
}
