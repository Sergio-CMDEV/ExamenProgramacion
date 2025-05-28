public class MostrarUnicode {
    public static void main(String[] args) {
        /* Muestra todos los caracteres Unicode entre \u0000 y \uFFFF */
        for (int i = 0; i <= 0xFFFF; i++) {
            System.out.print((char)i);
            if (i % 100 == 0) System.out.println(); // Salto de línea cada 100 caracteres
        }
    }
}
