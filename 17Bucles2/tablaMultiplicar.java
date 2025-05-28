/*2. Hacer un programa que pida a un usuario un número 
del 0 al 50 (deberéis comprobar que es así), una vez 
comprobado nos mostrará la tabla de multiplicar de ese 
número del 1 al 10. */
import java.util.Scanner;

public class tablaMultiplicar {
    public static void main (String [] args) {
        Scanner leerDatos = new Scanner (System.in);
        System.out.println("Introduce un valor del 0 al 50");
        int n1 = leerDatos.nextInt();
        if (n1 <=50 && n1 >= 0) {
            for (int i = 0; i <= 10; i++) {
                int multiplicacion = n1 * i;
                System.out.println(multiplicacion);
            }
        } else {
            System.out.println("Valor incorrecto");
        }
    }
}
