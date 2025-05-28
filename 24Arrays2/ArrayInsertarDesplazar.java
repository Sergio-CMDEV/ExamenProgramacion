import java.util.Scanner;

public class ArrayInsertarDesplazar {
    public static void main(String[] args) {
        Scanner leerDatos = new Scanner(System.in);
        int[] numeros = new int[10];
        System.out.println("Introduce 9 números:");
        for (int i = 0; i < 9; i++) {
            System.out.print("Posición " + (i+1) + ": ");
            numeros[i] = leerDatos.nextInt();
        }
        System.out.print("Introduce el número a insertar: ");
        int nuevo = leerDatos.nextInt();
        int pos;
        do {
            System.out.print("Introduce la posición (1-9): ");
            pos = leerDatos.nextInt();
        } while (pos < 1 || pos > 9);
        for (int i = 9; i > pos - 1; i--) {
            numeros[i] = numeros[i-1];
        }
        numeros[pos-1] = nuevo;
        System.out.println("Array resultante:");
        for (int i = 0; i < 10; i++) {
            System.out.print(numeros[i]);
            if (i < 9) System.out.print(", ");
        }
        System.out.println();
        leerDatos.close();
    }
}
