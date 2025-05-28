import javax.swing.JOptionPane;

public class BusquedaBinaria {
    public static void main(String[] args) {
        /* Declaración de un array ordenado */
        int[] array = { 3, 45, 47, 49, 53, 55, 62, 64, 75, 100, 150, 4096 };
        /* Pedir al usuario el elemento a buscar */
        int buscar = Integer.parseInt(JOptionPane.showInputDialog("¿Qué número quieres buscar en el array?"));
        int inicio = 0;
        int fin = array.length - 1;
        boolean encontrado = false;
        /* Búsqueda binaria */
        while (inicio <= fin && !encontrado) {
            int mitad = (inicio + fin) / 2;
            if (array[mitad] == buscar) {
                encontrado = true;
            } else if (buscar < array[mitad]) {
                fin = mitad - 1;
            } else {
                inicio = mitad + 1;
            }
        }
        if (encontrado) {
            System.out.println("El número " + buscar + " SÍ está en el array.");
        } else {
            System.out.println("El número " + buscar + " NO está en el array.");
        }
        /*
        La búsqueda binaria aprovecha que el array está ordenado para descartar la mitad de los elementos en cada paso.
        */
    }
}
