import java.util.Scanner;

public class FraseInvertida {
    public static void main(String[] args) {
        Scanner leerDatos = new Scanner(System.in);
        System.out.print("Introduce una frase: ");
        String frase = leerDatos.nextLine();
        String invertida = "";
        for (int i = frase.length() - 1; i >= 0; i--) {
            invertida += frase.charAt(i);
        }
        System.out.println("Frase invertida: " + invertida);
        leerDatos.close();
    }
}
