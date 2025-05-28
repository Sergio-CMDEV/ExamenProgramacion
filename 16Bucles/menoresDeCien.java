/* 3. Hacer un programa que muestre los múltiplos de 7 menores de 100. */
public class menoresDeCien {
    public static void main (String [] args) {
        int n1 = 7;

        for (int i = 0; n1 < 100 ; n1 = n1 + 7) {
            System.out.print(n1 + " ");
        }
    }
}
