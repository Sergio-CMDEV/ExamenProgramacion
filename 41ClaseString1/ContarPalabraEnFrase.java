import java.util.Scanner;

public class ContarPalabraEnFrase {
    public static void main(String[] args) {
        Scanner leerDatos = new Scanner(System.in);
        /* Pedimos la frase y la palabra a buscar */
        System.out.print("Introduce una frase: ");
        String frase = leerDatos.nextLine();
        System.out.print("Introduce la palabra a buscar: ");
        String palabra = leerDatos.nextLine();
        int contador = 0;
        int pos = 0;
        /* Buscamos la palabra en la frase */
        while ((pos = frase.indexOf(palabra, pos)) != -1) {
            contador++;
            pos += palabra.length();
        }
        System.out.println("La palabra '" + palabra + "' aparece " + contador + " veces en la frase.");
        leerDatos.close();
    }
}
