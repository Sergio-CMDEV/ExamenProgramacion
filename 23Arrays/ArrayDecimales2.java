import java.util.Scanner;

public class ArrayDecimales2 {
    public static void main(String[] args) {
        Scanner leerDatos = new Scanner(System.in);
        double[] numeros = new double[6];
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Introduce un número decimal: ");
            numeros[i] = leerDatos.nextDouble();
        }
        System.out.println("Números en orden inverso:");
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.println(numeros[i]);
        }
        leerDatos.close();
    }
}
