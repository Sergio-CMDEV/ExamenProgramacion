/* 7. Escribe un programa que solicite al usuario dos números reales y haga lo siguiente:
• Encuentre y muestre el número mayor entre ellos utilizando Math.max().
• Encuentre y muestre el número menor utilizando Math.min().
• Redondee ambos números al entero más cercano utilizando Math.round() y muestre los resultados. */
import java.util.Scanner;

public class numerosReales {
    public static void main(String [] args) {
        Scanner leerDatos = new Scanner(System.in);
        System.out.println("Introduce el primer número");
        double n1 = leerDatos.nextDouble();

        System.out.println("Introduce el segundo número");
        double n2 = leerDatos.nextDouble();

        double mayor = Math.max(n1,n2);
        double menor = Math.min(n1,n2);
        
        System.out.println("El mayor es: " + mayor + " \nEl menor: " + menor + " \nRedondeando sería: " + Math.round(mayor) + " | " + Math.round(menor));
        leerDatos.close();
    }
}
