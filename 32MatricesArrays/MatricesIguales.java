import java.util.Scanner;

public class MatricesIguales {
    public static void main(String[] args) {
        /* Pedimos dimensiones de la primera matriz */
        Scanner leerDatos = new Scanner(System.in);
        System.out.print("Introduce el número de filas de la primera matriz: ");
        int filas1 = leerDatos.nextInt();
        System.out.print("Introduce el número de columnas de la primera matriz: ");
        int columnas1 = leerDatos.nextInt();
        int[][] matriz1 = new int[filas1][columnas1];
        /* Pedimos los valores de la primera matriz */
        for (int i = 0; i < filas1; i++) {
            for (int j = 0; j < columnas1; j++) {
                System.out.print("Matriz1 [" + i + "][" + j + "]: ");
                matriz1[i][j] = leerDatos.nextInt();
            }
        }
        /* Pedimos dimensiones de la segunda matriz */
        System.out.print("Introduce el número de filas de la segunda matriz: ");
        int filas2 = leerDatos.nextInt();
        System.out.print("Introduce el número de columnas de la segunda matriz: ");
        int columnas2 = leerDatos.nextInt();
        int[][] matriz2 = new int[filas2][columnas2];
        /* Pedimos los valores de la segunda matriz */
        for (int i = 0; i < filas2; i++) {
            for (int j = 0; j < columnas2; j++) {
                System.out.print("Matriz2 [" + i + "][" + j + "]: ");
                matriz2[i][j] = leerDatos.nextInt();
            }
        }
        /* Comprobamos si las matrices tienen las mismas dimensiones */
        boolean iguales = true;
        if (filas1 != filas2 || columnas1 != columnas2) {
            iguales = false;
        } else {
            /* Comprobamos si todos los elementos son iguales */
            for (int i = 0; i < filas1 && iguales; i++) {
                for (int j = 0; j < columnas1 && iguales; j++) {
                    if (matriz1[i][j] != matriz2[i][j]) {
                        iguales = false;
                    }
                }
            }
        }
        /* Mostramos el resultado */
        if (iguales) {
            System.out.println("Las matrices son iguales.");
        } else {
            System.out.println("Las matrices NO son iguales.");
        }
        leerDatos.close();
    }
}
