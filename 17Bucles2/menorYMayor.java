/*
1. Hacer un programa que pida dos números al usuario, después de 
averiguar cual es menor y mayor. Devolverá la suma de los números 
que hay entre ellos, así como un contador de números divisibles entre 3.
 */
import java.util.Scanner;

public class menorYMayor {
    public static void main (String [] args) {
        Scanner leerDatos = new Scanner(System.in);
        System.out.println("Introduce el primer valor");
        int n1 = leerDatos.nextInt();
        System.out.println("Introduce el segundo valor");
        int n2 = leerDatos.nextInt();

        int mayor, menor;
        if (n1 < n2) {
            mayor = n2;
            menor = n1;
        } else {
            mayor = n1;
            menor = n2;
        }

        int sumatotal = 0;
        for (int i = menor; i <= mayor; i++) {
            sumatotal += i;
            System.out.println(i);
        } 
        System.out.println(sumatotal);
    }
}
