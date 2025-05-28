import java.util.Scanner;

public class ArrayIntercalar3en3 {
    public static void main(String[] args) {
        Scanner leerDatos = new Scanner(System.in);
        int[] array1 = new int[12];
        int[] array2 = new int[12];
        int[] array3 = new int[24];
        System.out.println("Introduce los 12 números del primer array:");
        for (int i = 0; i < 12; i++) {
            System.out.print("Array 1, posición " + (i+1) + ": ");
            array1[i] = leerDatos.nextInt();
        }
        System.out.println("Introduce los 12 números del segundo array:");
        for (int i = 0; i < 12; i++) {
            System.out.print("Array 2, posición " + (i+1) + ": ");
            array2[i] = leerDatos.nextInt();
        }
        int j = 0;
        for (int i = 0; i < 12; i += 3) {
            for (int k = 0; k < 3; k++) {
                array3[j++] = array1[i + k];
            }
            for (int k = 0; k < 3; k++) {
                array3[j++] = array2[i + k];
            }
        }
        System.out.println("Array intercalado de 3 en 3:");
        for (int i = 0; i < 24; i++) {
            System.out.print(array3[i]);
            if (i < 23) System.out.print(", ");
        }
        System.out.println();
        leerDatos.close();
    }
}
