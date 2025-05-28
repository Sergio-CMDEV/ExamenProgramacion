import javax.swing.JOptionPane;

public class BorrarElementoArray {
    public static void main(String[] args) {
        /* Inicializar el array con valores */
        int[] array = {5, 8, 12, 7, 3, 9, 15, 2, 6, 10};
        /* Pedir el elemento a borrar por ventana */
        int borrar = Integer.parseInt(JOptionPane.showInputDialog("¿Qué número quieres borrar del array?"));
        boolean encontrado = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == borrar) {
                /* Desplazar a la izquierda los elementos siguientes */
                for (int j = i; j < array.length - 1; j++) {
                    array[j] = array[j + 1];
                }
                array[array.length - 1] = 0; /* Opcional: poner a 0 el último */
                encontrado = true;
                break;
            }
        }
        if (encontrado) {
            System.out.println("Array tras borrar el elemento:");
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
        } else {
            System.out.println("El número no está en el array.");
        }
        /*
        Si el número aparece varias veces, solo borra la primera aparición.
        Si quieres borrar todas, elimina el 'break' del bucle.
        */
    }
}
