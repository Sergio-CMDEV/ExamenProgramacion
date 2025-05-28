/*
14. Crea un programa que pida dos números de tipo byte al usuario y cree a una variable "menor", que tenga
el valor del menor de esos dos números. Hazlo primero con un "if" y luego con un "operador condicional"(?).
 */
import java.util.Scanner;

public class Operador {
    public static void main(String[] args) {
        Scanner leerDatos = new Scanner(System.in);
        System.out.println("Introduce el primer byte");
        byte n1 = leerDatos.nextByte();

        System.out.println("Introduce el segundo byte");
        byte n2 = leerDatos.nextByte();

        byte menor;

        if (n1 < n2) {
            menor = n1;
            System.out.println("El menor es " + menor);
        } else if (n2 < n1) {
            menor = n2;
            System.out.println("El menor es " + menor);
        } else {
            System.out.println("Los dos valores son iguales");
        }
    }
}
