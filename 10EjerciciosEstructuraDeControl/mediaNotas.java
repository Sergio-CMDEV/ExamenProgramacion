/* 5. Realiza un programa que calcule la media de tres notas. */
import java.util.Scanner;

public class mediaNotas {
    public static void main(String[] args) {
        Scanner leerDatos = new Scanner(System.in);
        System.out.println("Introduce las 3 notas, una despues de otra");
        int n1 = leerDatos.nextInt();
        int n2 = leerDatos.nextInt();
        int n3 = leerDatos.nextInt();

        int media = (n1 + n2 + n3) / 3;
        System.out.println("La media de las 3 notas es: " + media);
    }
}
