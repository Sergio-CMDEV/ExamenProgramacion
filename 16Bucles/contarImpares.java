/* 2. Hacer un programa que muestre la suma de los primeros 200 números impares. */

public class contarImpares {
    public static void main(String[] args) {
        int maximo = 0;

    int impar = 1;
    int count = 0;
    int suma = 0;
    while(count < 200){
    suma += impar; // suma = suma +impar (0+1)-> (1+3)...
    impar +=2; //impar sumamos 2 que seria 3
    count ++;
    System.out.println("La suma nº " + count + " con numero impar... " + suma);
    }
/* Este no lo entendia y lo cogi de Marian */
    }
}
