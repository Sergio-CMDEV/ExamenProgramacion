/* 
4. Realiza un programa que pida al usuario 2 números, 
y recorra todos los números entre ellos, cuente y 
muestre todos los números primos que hay entre ambos.
 */
import java.util.Scanner;

public class contarPrimos {
    public static void main(String[] args) {
        Scanner leerDatos = new Scanner(System.in);
        System.out.println("Introduce el primer valor");
        int n1 = leerDatos.nextInt();
        System.out.println("Introduce el segundo valor");
        int n2 = leerDatos.nextInt();

        int menor = 0;
        int mayor = 0;
        int contador = 0;
        int sumaContador = 0;

        if (n1 > n2) {
            mayor = n1;
            menor = n2;
        } else {
            mayor = n2;
            menor = n1;
        }

        for (int i = menor + 1; i < mayor; i++) {
            contador = 0;
            for (int x = 1; x <= i; x++) {
                if (i % x == 0) {
                contador++;
            }
            
        }
        if (contador == 2) {
            sumaContador++;
            System.out.println(i + " es primo");
        } 
    }
        System.out.println("Tiene un total de " + sumaContador + " numeros primos");
    }
}
