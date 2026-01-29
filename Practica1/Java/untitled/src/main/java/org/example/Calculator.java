package org.example;

import java.util.Scanner;

// src/Calculator.java
public class Calculator {

    public static double calcular(String op, double a, double b) {
        switch (op) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                if (b == 0) throw new ArithmeticException("División por cero");
                return a / b;
            case "^":
                return Math.pow(a, b);
            default:
                throw new IllegalArgumentException("Operación no válida: " + op);
        }
    }
}
