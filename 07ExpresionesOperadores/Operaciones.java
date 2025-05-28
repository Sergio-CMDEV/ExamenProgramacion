/* EJERCICIO 1
1. Realiza un programa que defina dos variables “enteras” para describir las longitudes de los lados de un
rectángulo. El programa debe calcular y escribir por pantalla las longitudes de los lados, el perímetro y el área
del rectángulo. 
*/

import java.util.Scanner;

public class Operaciones {
public static void main (String [] args) {
    Scanner leerDatos = new Scanner(System.in);
    System.out.println("Escribe el primer lado (en cm)");
    int lado1 = leerDatos.nextInt();
    System.out.println("Escribe el segundo lado (en cm)");
    int lado2 = leerDatos.nextInt();
    if (lado1 >= 0 && lado2 >= 0) {
        System.out.println(
        "El primer lado son " + lado1 + " cm y el segundo " + lado2 +
        "\nEl área del rectángulo es: " + (lado1 * lado2) + " cm " +
        "\nEl perímetro del rectángulo es: " + (lado1 + lado2) + " cm");
    } else {
        System.out.println("El valor no puede ser menor que 0!");
    }
    leerDatos.close();
} 
}