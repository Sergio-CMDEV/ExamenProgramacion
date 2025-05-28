/* 3. Realiza un programa que pida un número 
al usuario y le diga si es primo o no. */
import java.util.Scanner;

public class primo {
    public static void main(String[] args) {
        Scanner leerDatos = new Scanner(System.in);
        System.out.println("Introduce un valor");
        int n1 = leerDatos.nextInt();
        int contador = 0;

        for (int i = 1; i <= n1; i++) {
            if (n1 % i == 0) {
                contador++;
            }
        }
        if (contador == 2) {
            System.out.println("Es primo");
        } else {
            System.out.println("No es primo");
        }
    }
}
