import java.util.Scanner;
import javax.swing.JOptionPane;

public class SeleccionOrdenamiento {
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
        /* Ordenamiento por selección (de menor a mayor) */
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            if (min != i) {
                int temp = array[i];
                array[i] = array[min];
                array[min] = temp;
            }
        }
        /* Mostrar el array ordenado */
        System.out.println("Array ordenado de menor a mayor:");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        leerDatos.close();
        /*
        Para ordenar de mayor a menor, cambia 'array[j] < array[min]' por 'array[j] > array[max]'.
        Si hay dos mínimos, el algoritmo simplemente deja uno en la posición actual y el otro más adelante, no hay problema.
        */
    }
}
