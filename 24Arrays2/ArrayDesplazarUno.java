import java.util.Scanner;

public class ArrayDesplazarUno {
    public static void main(String[] args) {
        Scanner leerDatos = new Scanner(System.in);
        int[] numeros = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Introduce un número: ");
            numeros[i] = leerDatos.nextInt();
        }
        int ultimo = numeros[9];
        for (int i = 9; i > 0; i--) {
            numeros[i] = numeros[i-1];
        }
        numeros[0] = ultimo;
        System.out.println("Array desplazado una posición:");
        for (int i = 0; i < 10; i++) {
            System.out.print(numeros[i]);
            if (i < 9) System.out.print(", ");
        }
        System.out.println();
        leerDatos.close();
    }
}
