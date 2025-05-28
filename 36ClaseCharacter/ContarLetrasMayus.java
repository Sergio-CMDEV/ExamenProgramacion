import java.util.Scanner;

public class ContarLetrasMayus {
    public static void main(String[] args) {
        Scanner leerDatos = new Scanner(System.in);
        char[] letrasMayus = new char[10];
        int contadorLetras = 0;
        for (int i = 0; i < 10; i++) {
            System.out.print("Introduce un carácter: ");
            char c = leerDatos.next().charAt(0);
            if (Character.isLetter(c)) {
                letrasMayus[contadorLetras] = Character.toUpperCase(c);
                contadorLetras++;
            }
        }
        System.out.println("Se han introducido " + contadorLetras + " letras.");
        System.out.print("Letras en mayúsculas: ");
        for (int i = 0; i < contadorLetras; i++) {
            System.out.print(letrasMayus[i] + " ");
        }
        System.out.println();
        leerDatos.close();
    }
}
