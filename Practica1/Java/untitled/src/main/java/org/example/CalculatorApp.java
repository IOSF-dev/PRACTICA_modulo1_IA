package org.example;

// src/CalculatorApp.java
import java.util.Scanner;

public class CalculatorApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Calculadora básica (+, -, *, /, ^)");

        System.out.print("Operación: ");
        String op = sc.nextLine();

        System.out.print("Primer número: ");
        double a = getDoubleInput(sc);

        System.out.print("Segundo número: ");
        double b = getDoubleInput(sc);

        try {
            double resultado = Calculator.calcular(op, a, b);
            System.out.println("✅ Resultado: " + resultado);
        } catch (Exception e) {
            System.out.println("❌ Error: " + e.getMessage());
        }

        sc.close();
    }

    private static double getDoubleInput(Scanner sc) {
        while (true) {
            try {
                return Double.parseDouble(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.print("❌ Entrada no válida. Intenta de nuevo: ");
            }
        }
    }
}
