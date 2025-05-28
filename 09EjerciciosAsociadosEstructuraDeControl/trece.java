/* 3. Crea un programa que pida al usuario que introduzca el número 13. 
Después debe decirle si lo ha hecho correctamente o no. */
import java.util.Scanner;

public class trece {
    public static void main (String [] args) {
        Scanner leerDatos = new Scanner(System.in);
        System.out.println("Introduce el número 13 porfavor");
        int n1 = leerDatos.nextInt();

        if (n1 == 13) {
            System.out.println("Bien hecho");
        } else {
            System.out.println("Mentiroso");
        }
    }
}
