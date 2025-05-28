/* 7. Crea un programa que diga si el número introducido por el usuario es impar o no lo es. */
import java.util.Scanner;

public class impar {
    public static void main(String[] args) {
        Scanner leerDatos = new Scanner(System.in);
        System.out.println("Introduce un valor");
        int n1 = leerDatos.nextInt();

        if ((n1 % 2) == 0 || n1 == 0) {
            System.out.println("No, " + n1 + " no es impar");
        } else {
            System.out.println("Si, " + n1 + " es impar");
        }
    }
}
