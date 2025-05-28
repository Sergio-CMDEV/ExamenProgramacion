import java.util.Scanner;

public class FraseMasCorta {
    public static void main(String[] args) {
        Scanner leerDatos = new Scanner(System.in);
        System.out.print("Introduce la primera frase: ");
        String frase1 = leerDatos.nextLine();
        System.out.print("Introduce la segunda frase: ");
        String frase2 = leerDatos.nextLine();
        if (frase1.length() < frase2.length()) {
            System.out.println("La frase más corta es: " + frase1);
        } else if (frase2.length() < frase1.length()) {
            System.out.println("La frase más corta es: " + frase2);
        } else {
            System.out.println("Las dos frases tienen la misma longitud.");
        }
        leerDatos.close();
    }
}
