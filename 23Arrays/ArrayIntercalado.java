import java.util.Scanner;

public class ArrayIntercalado {
    public static void main(String[] args) {
        Scanner leerDatos = new Scanner(System.in);
        int[] array1 = new int[10];
        int[] array2 = new int[10];
        int[] array3 = new int[20];
        System.out.println("Introduce los 10 números del primer array:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Array 1, posición " + (i+1) + ": ");
            array1[i] = leerDatos.nextInt();
        }
        System.out.println("Introduce los 10 números del segundo array:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Array 2, posición " + (i+1) + ": ");
            array2[i] = leerDatos.nextInt();
        }
        for (int i = 0, j = 0; i < 10; i++) {
            array3[j++] = array1[i];
            array3[j++] = array2[i];
        }
        System.out.println("Array intercalado:");
        for (int i = 0; i < 20; i++) {
            System.out.print(array3[i]);
            if (i < 19) System.out.print(", ");
        }
        System.out.println();
        leerDatos.close();
    }
}
