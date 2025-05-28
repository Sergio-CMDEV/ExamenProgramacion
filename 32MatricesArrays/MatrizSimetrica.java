import java.util.Scanner;

public class MatrizSimetrica {
    public static void main(String[] args) {
        /* Pedimos la dimensión de la matriz cuadrada */
        Scanner leerDatos = new Scanner(System.in);
        System.out.print("Introduce el tamaño de la matriz cuadrada: ");
        int n = leerDatos.nextInt();
        int[][] matriz = new int[n][n];
        /* Pedimos los valores de la matriz */
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Matriz [" + i + "][" + j + "]: ");
                matriz[i][j] = leerDatos.nextInt();
            }
        }
        /* Comprobamos si la matriz es simétrica */
        boolean simetrica = true;
        for (int i = 0; i < n && simetrica; i++) {
            for (int j = 0; j < n && simetrica; j++) {
                if (matriz[i][j] != matriz[j][i]) {
                    simetrica = false;
                }
            }
        }
        /* Mostramos el resultado */
        if (simetrica) {
            System.out.println("La matriz es simétrica.");
        } else {
            System.out.println("La matriz NO es simétrica.");
        }
        leerDatos.close();
    }
}
