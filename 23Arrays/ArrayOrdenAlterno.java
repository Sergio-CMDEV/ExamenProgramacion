import java.util.Scanner;

public class ArrayOrdenAlterno {
    public static void main(String[] args) {
        Scanner leerDatos = new Scanner(System.in);
        int[] numeros = new int[10];
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Introduce un número: ");
            numeros[i] = leerDatos.nextInt();
        }
        System.out.println("Orden solicitado:");
        int inicio = 0, fin = numeros.length - 1;
        while (inicio < fin) {
            System.out.print(numeros[inicio] + ", ");
            System.out.print(numeros[fin] + (inicio + 1 == fin ? "\n" : ", "));
            inicio++;
            fin--;
        }
        if (inicio == fin) {
            System.out.println(numeros[inicio]);
        }
        leerDatos.close();
    }
}
