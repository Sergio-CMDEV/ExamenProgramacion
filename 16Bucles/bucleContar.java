/* 1. Hace un programa para contar. Pediremos un número cualquiera “n” y nos mostrará todos los números
desde el 1 hasta el n. */
import java.util.Scanner;

public class bucleContar {
    public static void main(String[] args) {
        System.out.println("Hasta que número quieres que contemos");
        Scanner leerDatos = new Scanner(System.in);
        int n2 = leerDatos.nextInt();

        for (int n1=1; n1 <= n2; n1++) {
            System.out.println(n1);
        }
    }
}
