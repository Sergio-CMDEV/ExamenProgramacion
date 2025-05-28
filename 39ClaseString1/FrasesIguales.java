import java.util.Scanner;

public class FrasesIguales {
    public static void main(String[] args) {
        Scanner leerDatos = new Scanner(System.in);
        System.out.print("Introduce la primera frase: ");
        String frase1 = leerDatos.nextLine();
        System.out.print("Introduce la segunda frase: ");
        String frase2 = leerDatos.nextLine();
        if (frase1.equals(frase2)) {
            System.out.println("Las frases son iguales.");
        } else {
            System.out.println("Las frases son diferentes.");
        }
        leerDatos.close();
    }
}
