import java.util.InputMismatchException;
import java.util.Scanner;

public class Cilindro {
    public static void main(String[] args) {
    Scanner leerDatos = new Scanner(System.in);
    boolean continuar = true;
    while (continuar) {    
        try {
            double pi = 3.1416;
            System.out.println("Introduce el diametro del cilindro ");
            double diametro = leerDatos.nextDouble();
            System.out.println("Ahora introduce la altura del cilindro ");
            double altura = leerDatos.nextDouble();
            double radio = diametro/2;
            if (altura > 0 && diametro > 0) {
                System.out.println("Su área es: " + (2 * pi * radio * (radio + altura)));
                System.out.println("Su volumen es: " + (pi * Math.pow(radio, 2) * altura));   
            } else {
                System.out.println("El valor debe ser mayor a 0!");
            }
            System.out.println("¿Desea realizar otro cálculo? (s/n)");
            String respuesta = leerDatos.next();
            if (!respuesta.equalsIgnoreCase("s")) {
                continuar = false;
            }
        } catch (InputMismatchException e) {
            System.out.println("Error, valor incorrecto");
            leerDatos.next(); 
        }
    }
    leerDatos.close();
    }
}