/* 
3. Escriba un programa que solicite al usuario una cantidad en 
segundos y la convierta a días, horas, minutos y segundos.
*/

import java.util.Scanner;

public class Conversor {
    public static void main (String [] args) {
        Scanner leerDatos = new Scanner (System.in);
        System.out.println("Introduce los segundos que quieras convertir");
        long segundos = leerDatos.nextLong();

        long restoMinutos = segundos / 60;
        System.out.println("Minutos " + restoMinutos);

        long restoHoras = restoMinutos / 60;
        System.out.println("Horas: " + restoHoras);

        long restoDias = restoHoras / 60;
        System.out.println("Dias: " + restoDias);
        
        leerDatos.close();
    }
}