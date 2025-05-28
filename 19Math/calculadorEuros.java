/*
4.
Calcula la cantidad de euros que tienen 3 amigos, si Paco tiene 
N (este valor lo pediremos al usuario), Bartolo tiene la mitad que 
Paco, y Lucía tiene la mitad de lo que tiene Paco y Bartolo juntos.
 */
import java.util.Scanner;

public class calculadorEuros {
    public static void main(String[] args) {
        Scanner leerDatos = new Scanner(System.in);
        System.out.println("Introduce el valor");
        double n1 = leerDatos.nextDouble();

        double bartolo = n1 / 2.0;
        double lucia = (n1 + bartolo) / 2;
        System.out.println("Paco tiene " + n1 + " Bartolo tiene " + Math.round(bartolo * 100)/100 + " y lucia " + Math.round(lucia*100)/100);
    }
}
