import java.util.Arrays;
import java.util.Scanner;

public class Anagramas {
    public static void main(String[] args) {
        Scanner leerDatos = new Scanner(System.in);
        /* Pedimos dos palabras al usuario */
        System.out.print("Introduce la primera palabra: ");
        String palabra1 = leerDatos.nextLine().replaceAll("\\s+", "").toLowerCase();
        System.out.print("Introduce la segunda palabra: ");
        String palabra2 = leerDatos.nextLine().replaceAll("\\s+", "").toLowerCase();
        /* Comprobamos si son anagramas */
        boolean sonAnagramas = sonAnagramas(palabra1, palabra2);
        if (sonAnagramas) {
            System.out.println("Son anagramas.");
        } else {
            System.out.println("No son anagramas.");
        }
        leerDatos.close();
    }
    /* Función para comprobar si dos palabras son anagramas */
    static boolean sonAnagramas(String p1, String p2) {
        if (p1.length() != p2.length()) return false;
        char[] arr1 = p1.toCharArray();
        char[] arr2 = p2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }
}
