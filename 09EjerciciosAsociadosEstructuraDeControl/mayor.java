/* 5. Crea un programa que pida dos números reales al usuario y diga cuál es el mayor de ellos. */
import java.util.Scanner;

public class mayor {
    public static void main (String [] args) {
        Scanner leerDatos = new Scanner(System.in);
        System.out.println("Introduce el primer número");
        int n1 = leerDatos.nextInt();
        System.out.println("Introduce el segundo número");
        int n2 = leerDatos.nextInt();

        if (n1 > n2) {
            System.out.println(n1 + " es mayor que " + n2);
        } else if (n2 > n1) {
            System.out.println(n2 + " es mayor que " + n1);
        } else {
            System.out.println(n1 + " y " + n1 + " son el mismo número");
        }
    }
}
