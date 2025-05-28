/* 4. Hacer un programa que nos calcule el factorial 
de un número pedido al usuario */
import java.util.Scanner;

public class factorial {
    public static void main (String [] args) {
        Scanner leerDatos = new Scanner(System.in);
        System.out.println("Introduce el valor para calcular su factorial");
        int n1 = leerDatos.nextInt();
        int resultado = 1;
        for (int i = 1; i <= n1 ; i++) {
            resultado = resultado * i;
        }
        System.out.println("El factorial de " + n1 + " es " + resultado);
    }
}