/* 5.
Una compañía de venta de coches le paga a sus empleados 1000 € mensuales, 
además de una comisión de 50 € por vehículo vendido, más el 5 % del valor 
total del vehículo vendido. Hacer un programa que calcule e imprima el 
salario mensual de un vendedor. */
import java.util.Scanner;

public class compañiaCoches {
    public static void main(String[] args) {
        Scanner leerDatos = new Scanner(System.in);
        System.out.println("Introduce la cantidad de coches vendidos");
        int ventas = leerDatos.nextInt();

        int comision = ventas * 50;
        double total = comision * 1.05;

        if (ventas >= 1) {
            System.out.println("Ha ganado de base 1000€ y se le suma: \nCoches vendidos: " + ventas + 
            "\nComisión con los coches: " + comision + " \nTotal: " + total);
        } else {
            System.out.println("Gana 1000€ mensuales");
        }
    }
}
