import java.util.Scanner;

public class ArrayBuscarRepetidos {
    public static void main(String[] args) {
        Scanner leerDatos = new Scanner(System.in);
        int[] numeros = new int[10];
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Introduce un número: ");
            numeros[i] = leerDatos.nextInt();
        }
        System.out.print("¿Qué número quieres buscar?: ");
        int buscar = leerDatos.nextInt();
        int contador = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == buscar) {
                contador++;
            }
        }
        System.out.println("El número " + buscar + " aparece " + contador + " veces en el array.");
        leerDatos.close();
    }
}
