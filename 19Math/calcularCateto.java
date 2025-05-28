/* 6. Escribe un programa que solicite al usuario las longitudes de los dos catetos 
de un triángulo rectángulo y calcule la longitud de la hipotenusa utilizando el teorema 
de Pitágoras. Usa el método Math.sqrt() para calcular la raíz cuadrada. */
import java.util.Scanner;

public class calcularCateto {
    public static void main (String [] args) {
        Scanner leerDatos = new Scanner(System.in);
        System.out.println("Introduce el primer cateto");
        int n1 = leerDatos.nextInt();
        System.out.println("Introduce el segundo cateto");
        int n2 = leerDatos.nextInt();

        double n3 = Math.sqrt(Math.pow(n1,2) + Math.pow(n1, 2));
        System.out.println("La longitud de la hipotenusa es: " + n3);
    }
}
