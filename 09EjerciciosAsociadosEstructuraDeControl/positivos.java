/* 8. Crea un programa que pida al usuario dos números enteros y 
diga si los dos son positivos (el primero Y el segundo). */

import java.util.Scanner;

public class positivos {
    public static void main(String [] args) {
        Scanner leerDatos = new Scanner(System.in);
        System.out.println("Dame el primer número");
        int n1 = leerDatos.nextInt();
        System.out.println("Dame el segundo número");
        int n2 = leerDatos.nextInt();

        /*if (n1 >= 0 && n2 >= 0) { --Solución facil
            System.out.println("Son positivos");
        } else {
            System.out.println("Almenos 1 de ellos no es positivo");
        }*/
        if (n1 >= 0 && n2 >= 0) {
            System.out.println(n1 + " y " + n2 + " son positivos");
        } else if (n1 < 0 && n2 >= 0) {
            System.out.println(n1 + " es negativo mientras " + n2 + " es positivo");
        } else if (n1 >= 0 && n2 < 0) {
            System.out.println(n2 + " es negativo mientras " + n1 + " es positivo");
        } else {
            System.out.println(n1 + " y " + n2 + " son negativos");
        }
    }
}
