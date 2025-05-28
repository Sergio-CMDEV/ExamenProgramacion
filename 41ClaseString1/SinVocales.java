import java.util.Scanner;

public class SinVocales {
    public static void main(String[] args) {
        Scanner leerDatos = new Scanner(System.in);
        /* Pedimos el nombre completo */
        System.out.print("Introduce tu nombre completo: ");
        String nombre = leerDatos.nextLine();
        String sinVocales = "";
        /* Recorremos la cadena y eliminamos las vocales */
        for (int i = 0; i < nombre.length(); i++) {
            char c = nombre.charAt(i);
            if (!esVocal(c)) {
                sinVocales += c;
            }
        }
        System.out.println("Sin vocales: " + sinVocales);
        leerDatos.close();
    }
    static boolean esVocal(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
