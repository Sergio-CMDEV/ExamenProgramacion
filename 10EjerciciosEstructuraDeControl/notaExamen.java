/* 
1. Hacer un programa que pida la nota de un examen, si ésta nota es igual o superior a 5 mostrará el mensaje
“Enhorabuena, prueba superada, eres un crack”.
 */
import java.util.Scanner;

public class notaExamen {
    public static void main(String[] args) {
        Scanner leerDatos = new Scanner(System.in);
        System.out.println("Introduce tu nota");
        int nota = leerDatos.nextInt();
        leerDatos.close();

        if (nota >= 0 && nota <= 10) {
            if (nota >= 5) {
                System.out.println("Enhorabuena, prueba superada, eres un crack");
            } else {
                System.out.println("No llegaste a la nota minima");
            }
        } else {
            System.out.println("Valor incorrecto, introduce una nota valida");
        }
    }
}
