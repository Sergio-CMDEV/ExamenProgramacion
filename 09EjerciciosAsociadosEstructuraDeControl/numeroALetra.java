/*
 * Crea un programa que escriba como texto cualquier número del 1 al 10 que introduzca el usuario. Por
ejemplo, si el usuario introduce 3, deberá escribir "tres".
 */
import java.util.Scanner;

public class numeroALetra {
    public static void main(String[] args) {
        Scanner leerDatos = new Scanner(System.in);
        System.out.println("Introduce un número del 0 al 10");
        int n1 = leerDatos.nextInt();

        if (n1 >= 0 && n1 <= 10) {
            switch (n1) {
                case 0:
                System.out.println("Cero");
                break;
                case 1:
                System.out.println("Uno");
                break;
                case 2:
                System.out.println("Dos");
                break;
                case 3:
                System.out.println("Tres");
                break;
                case 4:
                System.out.println("Cuatro");
                break;
                case 5:
                System.out.println("Cinco");
                break;
                case 6:
                System.out.println("Seis");
                break;
                case 7:
                System.out.println("Siete");
                break;
                case 8:
                System.out.println("Ocho");
                break;
                case 9:
                System.out.println("Nueve");
                break;
                case 10:
                System.out.println("Diez");
                break;
            } 
        } else {
            System.out.println("Número no valido");
        }
    }
}
