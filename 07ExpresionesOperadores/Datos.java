/* 
4. Hacer un programa que le pregunte al usuario:
● Su nombre y apellidos.
● Edad.
● Dirección.
● Muestrale un mensaje que le diga lo joven qué es.
 */
import java.util.Scanner;

public class Datos {
    public static void main(String[] args) {
        try (Scanner leerDatos = new Scanner(System.in)) {

            System.out.println("Introduce tu nombre: ");
            String nombre = leerDatos.nextLine();
            System.out.println("Ahora introduce tus apellidos");
            String apellidos = leerDatos.nextLine();
            System.out.println("Ahora tu edad");
            int edad = leerDatos.nextInt();
            leerDatos.nextLine(); 
            System.out.println("Por ultimo, tu dirección");
            String direccion = leerDatos.nextLine();

            if (edad <= 18) {
                System.out.println("Encantado " + nombre + " " + apellidos + "\nTienes unicamente " + edad + " años, aun eres joven. \nAdemas vives en " + direccion);
            } else {
                System.out.println("Encantado " + nombre + " " + apellidos + "\nTienes " + edad + " años, ya eres mayor de edad. \nAdemas vives en " + direccion);
            }
            leerDatos.close();
        }
    }
}
