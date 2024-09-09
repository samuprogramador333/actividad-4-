package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingresa el valor de la cuenta (incluyendo IVA): ");
        double valorCuenta = scanner.nextDouble();
        
        System.out.print("Ingresa el porcentaje de propina que deseas dejar: ");
        int porcentajePropina = scanner.nextInt();
        
        double valorPropina = valorCuenta * (porcentajePropina / 100.0);
        
        double valorTotal = valorCuenta + valorPropina;
        
        System.out.println("Valor de la cuenta: $" + String.format("%.2f", valorCuenta));
        System.out.println("Porcentaje de propina: " + porcentajePropina + "%");
        System.out.println("Valor de la propina: $" + String.format("%.2f", valorPropina));
        System.out.println("Valor total a pagar: $" + String.format("%.2f", valorTotal));
        
        scanner.close();
    }
}