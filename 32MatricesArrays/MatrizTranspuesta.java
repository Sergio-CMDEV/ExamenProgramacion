import java.util.Scanner;

public class MatrizTranspuesta {
    public static void main(String[] args) {
        /* Pedimos dimensiones de la matriz */
        Scanner leerDatos = new Scanner(System.in);
        System.out.print("Introduce el número de filas: ");
        int filas = leerDatos.nextInt();
        System.out.print("Introduce el número de columnas: ");
        int columnas = leerDatos.nextInt();
        int[][] matriz = new int[filas][columnas];
        /* Pedimos los valores de la matriz */
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Matriz [" + i + "][" + j + "]: ");
                matriz[i][j] = leerDatos.nextInt();
            }
        }
        /* Creamos la matriz transpuesta */
        int[][] transpuesta = new int[columnas][filas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                transpuesta[j][i] = matriz[i][j];
            }
        }
        /* Mostramos la matriz transpuesta */
        System.out.println("Matriz transpuesta:");
        for (int i = 0; i < columnas; i++) {
            for (int j = 0; j < filas; j++) {
                System.out.print(transpuesta[i][j] + " ");
            }
            System.out.println();
        }
        leerDatos.close();
    }
}
