import java.util.ArrayList;
import java.util.Scanner;

public class JuegosDelHambre {
    public static void main(String[] args) {
        Scanner leerDatos = new Scanner(System.in);
        int maxJugadores = 20;
        ArrayList<Jugador> jugadores = new ArrayList<>(); /* Lista de jugadores que participan en el juego */
        ArrayList<String> nombresUsados = new ArrayList<>(); /* Lista para controlar qué nombres aleatorios ya han sido usados */

        /* Nombres posibles para asignar */
        String[] nombresDisponibles = {
            "Carlos", "María", "Antonio", "Lucía", "Manuel", "Carmen", "Javier", "Laura",
            "Francisco", "Ana", "David", "Isabel", "José", "Elena", "Juan", "Sara",
            "Pedro", "Sofía", "Miguel", "Paula"
        };


        /* Pregunta inicial donde el usuario decide si meter nombres o dejar que se generen automáticamente */
        System.out.println("¿Quieres introducir los nombres? (s/n): ");
        String respuesta = leerDatos.nextLine();

        /* Si el usuario elige meter nombres manualmente */
        if (respuesta == "s") { 
            int cantidad;
            /* Pedimos cuántos nombres quiere introducir y lo validamos */
            do { /* Usamos el do while porque no sabemos exactamente cuantos numeros necesitamos
                y aunque se puede hacer con un for y un if para limiter, queria usar lo aprendido en clase */
                System.out.println("¿Cuántos nombres quieres introducir? (1-" + maxJugadores + "): ");
                cantidad = leerDatos.nextInt();
                leerDatos.nextLine(); /* Saltos de linea (porque a veces el programa me salta ciertos procedimientos) */
            } while (cantidad < 1 && cantidad > maxJugadores);

            /* Guardamos los nombres manualmente */
            for (int i = 0; i < cantidad; i++) {
                System.out.println("Nombre del jugador " + (i + 1) + ": ");
                String nombre = leerDatos.nextLine(); /* Guardamos el nombre en la variable nombre */
                jugadores.add(new Jugador(nombre)); /* Creamos un nuevo objeto de la clase Jugador */
                nombresUsados.add(nombre); /* Lo guardamos para evitar que se repitan */
            }

            /* Rellenamos el resto con nombres aleatorios, sin repetir */
            for (int i = cantidad; i < maxJugadores; i++) {
                String nombre;
                do {
                    int index = (int)(Math.random() * nombresDisponibles.length);
                    nombre = nombresDisponibles[index];
                } while (nombresUsados.contains(nombre));
                nombresUsados.add(nombre);
                jugadores.add(new Jugador(nombre));
            }

        } else {
            /* Si no quiere meter nombres, se generan todos aleatoriamente sin repetir */
            for (int i = 0; i < maxJugadores; i++) {
                String nombre;
                do {
                    int index = (int)(Math.random() * nombresDisponibles.length);
                    nombre = nombresDisponibles[index];
                } while (nombresUsados.contains(nombre));
                nombresUsados.add(nombre);
                jugadores.add(new Jugador(nombre));
            }
        }

        /* Comienza el juego: los días se repiten hasta que quede 1 solo vivo */
        int dia = 0;

        while (contarVivos(jugadores) > 1) {
            dia++;
            System.out.println("\n--- Día " + dia + " --- Pulsa ENTER para continuar.");
            leerDatos.nextLine();

            /* Determinamos cuántos mueren hoy: entre 1 y 3 normalmente, entre 3 y 5 si es múltiplo de 5 */
            int muertes = (dia % 5 == 0) ?
                3 + (int)(Math.random() * 3) :
                1 + (int)(Math.random() * 3);

            ejecutarMuertes(jugadores, muertes);
            mostrarEstado(jugadores);
        }

        /* Cuando termina, mostramos quién ha ganado */
        for (Jugador j : jugadores) {
            if (j.estaVivo()) {
                System.out.println("\nEl ganador es: " + j.getNombre());
                break;
            }
        }
    }

    /* Función para contar cuántos jugadores siguen vivos */
    static int contarVivos(ArrayList<Jugador> jugadores) {
        int vivos = 0;
        for (Jugador j : jugadores) {
            if (j.estaVivo()) {
                vivos++;
            }
        }
        return vivos;
    }

    /* Función que elimina aleatoriamente a X jugadores que estén vivos */
    static void ejecutarMuertes(ArrayList<Jugador> jugadores, int muertes) {
        int realizadas = 0;

        while (realizadas < muertes && contarVivos(jugadores) > 1) {
            Jugador victima;
            int a;

            /* Buscamos una víctima que aún esté viva */
            do {
                a = (int)(Math.random() * jugadores.size());
                victima = jugadores.get(a);
            } while (!victima.estaVivo());

            /* Matamos al jugador */
            victima.morir();
            realizadas++;
        }
    }

    /* Función que muestra los nombres de los jugadores vivos actualmente */
    static void mostrarEstado(ArrayList<Jugador> jugadores) {
        System.out.println("Vivos:");
        for (Jugador j : jugadores) {
            if (j.estaVivo()) {
                System.out.println("- " + j.getNombre());
            }
        }
    }
}
