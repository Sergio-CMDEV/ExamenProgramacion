/* 9.Hacer un programa que genere 50 números de forma aleatoria con valores comprendidos entre 0 y 10. 
Deberá mostrar cuántos pares y cuántos impares ha generado */

public class numerosAleatorios {
    public static void main(String[] args) {
        int pares = 0;
        int impares = 0;

        for (int i = 1; i <= 50; i++) {
            int random = (int)(Math.random() * 11); 
            System.out.println("Numero: " + random + " vuelta: (" + i + ")");
            if (random % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }
        System.out.println("Cantidad de pares: " + pares);
        System.out.println("Cantidad de impares: " + impares);
    }
}
