import java.util.Scanner;

public class ContarEspacios {
    public static void main(String[] args) {
        Scanner leerDatos = new Scanner(System.in);
        System.out.print("Introduce una frase: ");
        String frase = leerDatos.nextLine();
        int espacios = 0;
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == ' ') {
                espacios++;
            }
        }
        System.out.println("La frase tiene " + espacios + " espacios en blanco.");
        leerDatos.close();
    }
}
