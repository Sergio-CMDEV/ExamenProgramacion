/* 10. Crea un programa que pida al usuario dos números enteros y cuántos de ellos son pares. */
import java.util.Scanner;

public class cuantosPares {
    public static void main(String[] args) {
        Scanner leerDatos = new Scanner(System.in);
        System.out.println("Introduce el primer valor");
        int n1 = leerDatos.nextInt();
        System.out.println("Introduce el segundo valor");
        int n2 = leerDatos.nextInt();
        int contador = 0;

        if ((n1 % 2) == 0) {
            contador++;
        }
        if ((n2 % 2) == 0) {
            contador++;
        }
        System.out.println("Hay en total " + contador + " numeros pares");
        leerDatos.close();
    }
}
