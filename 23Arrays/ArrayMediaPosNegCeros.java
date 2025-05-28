import java.util.Scanner;

public class ArrayMediaPosNegCeros {
    public static void main(String[] args) {
        Scanner leerDatos = new Scanner(System.in);
        int[] numeros = new int[10];
        int sumaPos = 0, sumaNeg = 0, contPos = 0, contNeg = 0, ceros = 0;
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Introduce un número: ");
            numeros[i] = leerDatos.nextInt();
            if (numeros[i] > 0) {
                sumaPos += numeros[i];
                contPos++;
            } else if (numeros[i] < 0) {
                sumaNeg += numeros[i];
                contNeg++;
            } else {
                ceros++;
            }
        }
        if (contPos > 0) {
            System.out.println("Media de positivos: " + (double)sumaPos / contPos);
        } else {
            System.out.println("No hay números positivos.");
        }
        if (contNeg > 0) {
            System.out.println("Media de negativos: " + (double)sumaNeg / contNeg);
        } else {
            System.out.println("No hay números negativos.");
        }
        System.out.println("Cantidad de ceros: " + ceros);
        leerDatos.close();
    }
}
