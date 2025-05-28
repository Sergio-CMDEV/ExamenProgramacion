/*
2. Hacer un programa que pida la nota de un examen, si ésta nota, mostrando los resultados según:
Entre 0 y 1, mostrará “No has pegado palo al agua, COBARDE, PECADOORRR,...”
Entre 1 y 3, mostrará “Es lo que pasa cuando te preparas el examen con el móvil al lado”
Entre 3 y 4, mostrará “Que poquito ha faltado, tal vez con un trabajo, un jamón, ...”
Entre 4 y 5, mostrará “Hace media, ánimo estas en el camino”
Entre 5 y 6, mostrará “Prueba superada, pero no te descuides”.
Entre 6 y 7, mostrará “Dominas el tema, pero sin tirar cohetes”.
Entre 7 y 8, mostrará “Olé y olé, esto va sobre ruedas”.
Entre 9 y 10, mostrará “Fenómeno, eres un FENÓMENO...”
 */
import java.util.Scanner;

public class NotaCompleta {
    public static void main(String[] args) {
        Scanner leerDatos = new Scanner(System.in);
        System.out.println("introduce tu nota");
        double nota = leerDatos.nextDouble();

        if (nota >= 0 && nota < 1) {
            System.out.println("No has pegado palo al agua, COBARDE, PECADOORRR,...");
        } else if (nota >= 1 && nota < 3) {
            System.out.println("Es lo que pasa cuando te preparas el examen con el móvil al lado");
        } else if (nota >= 3 && nota < 4) {
            System.out.println("Que poquito ha faltado, tal vez con un trabajo, un jamón, ...");
        } else if (nota >= 4 && nota < 5) {
            System.out.println("Hace media, ánimo estas en el camino");
        } else if (nota >= 5 && nota < 6) {
            System.out.println("Prueba superada, pero no te descuides");
        } else if (nota >= 6 && nota < 7) {
            System.out.println("Dominas el tema, pero sin tirar cohetes");
        } else if (nota >= 7 && nota < 8) {
            System.out.println("Olé y olé, esto va sobre ruedas");
        } else if (nota >= 8 && nota < 9) {
            System.out.println("Muy bien, sigue así");
        } else if (nota >= 9 && nota <= 10) {
            System.out.println("Fenómeno, eres un FENÓMENO...");
        } else {
            System.out.println("Nota no valida");
        }
    }
}
