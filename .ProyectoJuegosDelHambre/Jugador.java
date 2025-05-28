public class Jugador {

    /* Atributo que guarda el nombre del jugador */
    private String nombre;

    /* Indica si el jugador está vivo (true) o muerto (false) */
    private boolean vivo;

    /* Constructor: recibe el nombre por parámetro y marca al jugador como vivo */
    public Jugador(String nombre) {
        this.nombre = nombre;
        this.vivo = true;
    }

    /* Devuelve el nombre del jugador */
    public String getNombre() {
        return this.nombre;
    }

    /* Devuelve true si el jugador está vivo */
    public boolean estaVivo() {
        return this.vivo;
    }

    /* Cambia el estado del jugador a muerto */
    public void morir() {
        this.vivo = false;
    }
}

/* Hice parte con chatgpt para simplificar el proceso usando los this.
estos se utilizan dentro de la clase Jugador para hacer referencia al 
propio objeto que se está instanciando.
*/