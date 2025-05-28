/* 15.Crea un programa que pida 3 números reales y los muestre de menor a mayor. */
import java.util.Scanner;

public class menorAMayor {
    public static void main(String[] args) {
        Scanner leerDatos = new Scanner(System.in);
        System.out.println("Introduce el primer número");
        int n1 = leerDatos.nextInt();

        System.out.println("Introduce el segundo número");
        int n2 = leerDatos.nextInt();

        System.out.println("introduce el tercer número");
        int n3 = leerDatos.nextInt();

        if (n1 > n2) {
            if (n1 > n3) {
                if (n2 > n3) {
                    System.out.println("El orden es: " + n1 + " " + n2 + " " + n3);
                } else {
                    System.out.println("El orden es: " + n1 + " " + n3 + " " + n2);
                }
            }
        }
        if (n2 > n1) {
            if (n2 > n3) {
                if (n1 > n3) {
                    System.out.println("El orden es: " + n2 + " " + n1 + " " + n3);
                } else {
                    System.out.println("El orden es: " + n2 + " " + n3 + " " + n1);
                }
            }
        }
        if (n3 > n1) {
            if (n3 > n2) {
                if (n1 > n2) {
                    System.out.println("El orden es: " + n3 + " " + n1 + " " + n2);
                } else {
                    System.out.println("El orden es: " + n3 + " " + n2 + " " + n1);
                }
            }
        }
    }
}
