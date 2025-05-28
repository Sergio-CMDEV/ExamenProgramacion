/* 3. Realiza un programa que pida una hora por teclado y que muestre luego buenos días, buenas tardes o
buenas noches según la hora. Se utilizarán los tramos de 6 a 12, de 13 a 20 y de 21 a 5, respectivamente.
Sólo se tienen en cuenta las horas, los minutos no se deben introducir por teclado. */
import java.util.Scanner;

public class Saludar {
    public static void main(String[] args) {
        Scanner leerDatos = new Scanner(System.in);
        System.out.println("Introduce la hora"); 
        int horas = leerDatos.nextInt();
        System.out.println("Introduce los minutos");
        int minutos = leerDatos.nextInt();

        if (minutos >= 60 && minutos <= 119) {
            horas++;
        } else {
            System.out.println("Los minutos no se contarán, son demasiados");
        }

        if (horas >= 6 && horas <= 12) {
            System.out.println("Buenos dias!");
        } else if (horas >= 13 && horas <= 20) {
            System.out.println("Buenas tardes!");
        } else if (horas >= 21 && horas <= 5) {
            System.out.println("Buenas noches!");
        }
    }
}
