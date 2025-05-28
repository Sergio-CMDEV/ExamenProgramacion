/* 8. Hacer un programa que calcule ax2+bx+c=0. *  */ 
import java.util.Scanner;

public class raizCuadrada {
    public static void main(String[] args) {
        Scanner leerDatos = new Scanner(System.in);
        System.out.println("Introduce el valor de a");
        int a = leerDatos.nextInt();

        System.out.println("Introduce el valor de b");
        int b = leerDatos.nextInt();

        System.out.println("Introduce el valor de c");
        int c = leerDatos.nextInt();

        double discriminante = Math.pow(b, 2) - 4 * a * c;

        if (discriminante < 0) {
            System.out.println("No existen soluciones reales.");
        } else {
            double raiz = Math.sqrt(discriminante);
            double x1 = (-b + raiz) / (2.0 * a);
            double x2 = (-b - raiz) / (2.0 * a);

            System.out.println("Resultado de x1 es: " + x1);
            System.out.println("Resultado de x2 es: " + x2);
        }

        leerDatos.close();
    }
}