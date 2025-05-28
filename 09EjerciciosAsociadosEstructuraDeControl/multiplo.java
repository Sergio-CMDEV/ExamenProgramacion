/* 6. Crea un programa que pida al usuario y diga si ese número es múltiplo de 3. */
import java.util.Scanner;

public class multiplo {
    public static void main (String [] args) {
        Scanner leerDatos = new Scanner(System.in);
        System.out.println("Introduce el número ");
        int n1 = leerDatos.nextInt();

        if ((n1 % 3) == 0) {
            System.out.println(n1 + " es múltiplo de 3");
        } else {
            System.out.println(n1 + " no es múltiplo de 3");
        }
    }
}
