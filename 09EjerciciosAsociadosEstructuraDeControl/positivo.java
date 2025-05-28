/* 1. Crea un programa que pida un número al usuario y diga si es positivo (mayor que cero)
 * 
 * 2. Crea un programa que pida un número entero al usuario y diga si es positivo (mayor que cero) o si, por el
contrario, no lo es (usando "else") (Es el mismo ejercicio)
 */
import java.util.Scanner;

public class positivo {
    public static void main (String [] args) {
        Scanner leerDatos = new Scanner(System.in);
        System.out.println("Escribe un número");
        int n1 = leerDatos.nextInt();
        if (n1 > 0) {
            System.out.println("El número " + n1 + " es positivo");
        } else if (n1 < 0) {
            System.out.println("El número " + n1 + " es negativo");
        } else {
            System.out.println("0 no es ni positivo ni negativo");
        }
    }
}
