/* 11.Crea un programa que pida tres números enteros largos al usuario y diga cuál es el mayor de los tres. */
import java.util.Scanner;

public class numerosLargos {
    public static void main(String[] args) {
        Scanner leerDatos = new Scanner(System.in);

        System.out.println("Introduce el primer valor (1/3)");
        int n1 = leerDatos.nextInt();
        System.out.println("Introduce el segundo valor (2/3)");
        int n2 = leerDatos.nextInt();
        System.out.println("Introduce el tercer valor (3/3)");
        int n3 = leerDatos.nextInt();

        if (n1 > n2) {
            if (n1 > n3) {
                System.out.println(n1 + " es mayor que " + n2 + " y " + n3);
            }
        }
        if (n2 > n1) {
            if (n2 > n3) {
                System.out.println(n2 + " es mayor que " + n1 + " y " + n3);
            }
        }
        if (n3 > n2) {
            if (n3 > n1) {
                System.out.println(n3 + " es mayor que " + n2 + " y " + n1);
            }
        }
        leerDatos.close();
    }
}
