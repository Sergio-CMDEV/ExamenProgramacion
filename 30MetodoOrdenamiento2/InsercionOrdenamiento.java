import java.util.Scanner;
import javax.swing.JOptionPane;

public class InsercionOrdenamiento {
    public static void main(String[] args) {
        /* Pedir el número de elementos por ventana */
        int n = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos elementos tendrá el array?"));
        int[] array = new int[n];
        Scanner leerDatos = new Scanner(System.in);
        /* Pedir los elementos por teclado */
        for (int i = 0; i < n; i++) {
            System.out.print("Introduce el elemento " + (i+1) + ": ");
            array[i] = leerDatos.nextInt();
        }
        /* Ordenamiento por inserción (de menor a mayor) */
        for (int i = 1; i < n; i++) {
            int aux = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > aux) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = aux;
        }
        /* Mostrar el array ordenado */
        System.out.println("Array ordenado de menor a mayor:");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        leerDatos.close();
        /*
        Para ordenar de mayor a menor, cambia 'array[j] > aux' por 'array[j] < aux' en el while.
        Si hay dos números iguales, el algoritmo los deja juntos y funciona correctamente.
        */
    }
}