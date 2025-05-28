import java.util.Scanner;
import javax.swing.JOptionPane;

public class BurbujaOrdenamiento {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos elementos tendrá el array?"));
        int[] array = new int[n];
        Scanner leerDatos = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("Introduce el elemento " + (i+1) + ": ");
            array[i] = leerDatos.nextInt();
        }
        // Ordenamiento burbuja (menor a mayor)
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        System.out.println("Array ordenado de menor a mayor:");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        leerDatos.close();
        // Para ordenar de mayor a menor, cambia 'array[j] > array[j+1]' por 'array[j] < array[j+1]'.
        // Si hay dos números iguales, no pasa nada: se quedan juntos y el algoritmo sigue funcionando correctamente.
    }
}
