/* Vamos a realizar un programa que simule el funcionamiento de una calculadora 
sencilla. Cuando ejecutemos el programa nos mostrará un menú parecido a:
“Bienvenido a la calculadora”
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Resto
6. Potencia (el primer número se considerará la base y el segundo 
el exponente) o preferís averiguar potencias de 2.
7. Número aleatorio
8. ¿¿Cálculos de porcentajes??
Añadir una opción de salida, será la última, nos mostrará un 
“Gracias por usar la calculadora, nos vemos…”
 */
import java.util.Scanner;

public class Calculadora {
public static void main (String [] args) {
    Scanner leerDatos = new Scanner(System.in);
    int opcion;
    do {
        System.out.println("Bienvenido a la calculadora!");
        System.out.println("\n1. Sumar \n2. Restar \n3. Multiplicar \n4. Dividir \n5. Resto \n6. Potencia \n7. Número aleatorio \n8. Calculo de porcentaje \n9. Salir");
        opcion = leerDatos.nextInt();

        if (opcion == 9) {
            System.out.println("Gracias por usar la calculadora, nos vemos...");
            break;
        }

        System.out.println("Introduce el primer número: ");
        int a = leerDatos.nextInt();
        System.out.println("Introduce el segundo número: ");
        int b = leerDatos.nextInt();
        
        switch (opcion) {
            case 1:
                int resultadoSuma = sumar(a, b);
                System.out.println("La suma es: " + resultadoSuma);
            break;
            case 2:
                int resultadoResta = restar(a, b);
                System.out.println("La resta es: " + resultadoResta);
            break;
            case 3:
                int resultadoMultiplicacion = multiplicacion(a, b);
                System.out.println("La multiplicación es: " + resultadoMultiplicacion);
            break;
            case 4:
                int resultadoDividir = dividir(a, b);
                System.out.println("La división es: " + resultadoDividir);
            break;
            case 5:
                int resultadoResto = resto(a, b);
                System.out.println("El resto es: " + resultadoResto);
            break;
            case 6:
                int resultadoPotencia = potencia(a, b);
                System.out.println("La potencia es: " + resultadoPotencia);
            break;
            case 7:
                int resultadoRandom = random(a, b);
                System.out.println("El número random es: " + resultadoRandom);
            break;
            case 8:
                double resultadoPorcentaje = calcularPorcentajes(a, b);
                System.out.println(b + "% de " + a + " es: " + resultadoPorcentaje);
            break;
            default:
                System.out.println("Opción no válida.");
            break;
        } 
    } while (opcion != 9);
}

    /* funciones */

    public static int sumar(int n1, int n2) {
        return n1 + n2;
    }
    
    public static int restar(int n1, int n2) {
        return n1 - n2;
    }
    public static int multiplicacion(int n1, int n2) {
        return n1 * n2;
    }
    public static int dividir(int n1, int n2) {
        return n1 / n2;
    }
    public static int resto(int n1, int n2) {
        return n1 % n2;
    }
    public static int potencia(int n1, int n2) {
        return (int) Math.pow(n1, n2);
    }
    public static int random(int n1, int n2) {
        return n1 + (int)(Math.random() * ((n2 - n1) + 1));
    }
    public static double calcularPorcentajes(int base, int porcentaje) {
        return (base * porcentaje) / 100.0;
    }
}