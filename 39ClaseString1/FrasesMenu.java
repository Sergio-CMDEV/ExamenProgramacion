import java.util.Scanner;

public class FrasesMenu {
    public static void main(String[] args) {
        Scanner leerDatos = new Scanner(System.in);
        System.out.println("1. Mostrar la frase más corta");
        System.out.println("2. Mostrar la frase más larga");
        System.out.println("3. Comprobar si las frases son iguales");
        System.out.print("Elige una opción: ");
        int opcion = leerDatos.nextInt();
        leerDatos.nextLine(); // Limpiar salto de línea
        System.out.print("Introduce la primera frase: ");
        String frase1 = leerDatos.nextLine();
        System.out.print("Introduce la segunda frase: ");
        String frase2 = leerDatos.nextLine();
        switch (opcion) {
            case 1:
                if (frase1.length() < frase2.length()) {
                    System.out.println("La frase más corta es: " + frase1);
                } else if (frase2.length() < frase1.length()) {
                    System.out.println("La frase más corta es: " + frase2);
                } else {
                    System.out.println("Las dos frases tienen la misma longitud.");
                }
                break;
            case 2:
                if (frase1.length() > frase2.length()) {
                    System.out.println("La frase más larga es: " + frase1);
                } else if (frase2.length() > frase1.length()) {
                    System.out.println("La frase más larga es: " + frase2);
                } else {
                    System.out.println("Las dos frases tienen la misma longitud.");
                }
                break;
            case 3:
                if (frase1.equals(frase2)) {
                    System.out.println("Las frases son iguales.");
                } else {
                    System.out.println("Las frases son diferentes.");
                }
                break;
            default:
                System.out.println("Opción no válida.");
        }
        leerDatos.close();
    }
}
