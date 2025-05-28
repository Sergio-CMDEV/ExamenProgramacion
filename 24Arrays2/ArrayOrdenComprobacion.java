import java.util.Scanner;

public class ArrayOrdenComprobacion {
    public static void main(String[] args) {
        Scanner leerDatos = new Scanner(System.in);
        int[] numeros = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Introduce un número: ");
            numeros[i] = leerDatos.nextInt();
        }
        boolean creciente = true, decreciente = true, iguales = true;
        for (int i = 1; i < 10; i++) {
            if (numeros[i] > numeros[i-1]) {
                decreciente = false;
            } else if (numeros[i] < numeros[i-1]) {
                creciente = false;
            }
            if (numeros[i] != numeros[i-1]) {
                iguales = false;
            }
        }
        if (iguales) {
            System.out.println("Todos los elementos son iguales.");
        } else if (creciente) {
            System.out.println("El array está en orden creciente.");
        } else if (decreciente) {
            System.out.println("El array está en orden decreciente.");
        } else {
            System.out.println("El array está desordenado.");
        }
        leerDatos.close();
    }
}
