import java.util.Scanner;

public class MatrizMultiplicacion {
    public static void main(String[] args) {
        /* Pedimos las dimensiones de la matriz */
        Scanner leerDatos = new Scanner(System.in);
        System.out.print("Introduce el número de filas: ");
        int filas = leerDatos.nextInt();
        System.out.print("Introduce el número de columnas: ");
        int columnas = leerDatos.nextInt();
        int[][] matriz = new int[filas][columnas];
        /* Pedimos los valores de la matriz */
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Introduce el valor para la posición [" + i + "][" + j + "]: ");
                matriz[i][j] = leerDatos.nextInt();
            }
        }
        /* Pedimos el número para multiplicar la matriz */
        System.out.print("Introduce el número para multiplicar la matriz: ");
        int num = leerDatos.nextInt();
        /* Mostramos la matriz resultante */
        System.out.println("Matriz resultante:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print((matriz[i][j] * num) + " ");
            }
            System.out.println();
        }
        leerDatos.close();
    }
}
