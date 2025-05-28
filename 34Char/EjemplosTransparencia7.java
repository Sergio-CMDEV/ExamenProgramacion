public class EjemplosTransparencia7 {
    public static void main(String[] args) {
        /* Ejemplos básicos de manipulación de char y String */
        char letra = 'A';
        System.out.println("Letra: " + letra);
        String texto = "Hola mundo";
        System.out.println("Texto: " + texto);
        /* Concatenación */
        String saludo = texto + "!";
        System.out.println("Concatenación: " + saludo);
        /* Longitud de un String */
        System.out.println("Longitud: " + texto.length());
        /* Acceso a un carácter */
        System.out.println("Primer carácter: " + texto.charAt(0));
        /* Substring */
        System.out.println("Subcadena: " + texto.substring(0, 4));
        /* Conversión a mayúsculas y minúsculas */
        System.out.println("Mayúsculas: " + texto.toUpperCase());
        System.out.println("Minúsculas: " + texto.toLowerCase());
        /* Comparación de cadenas */
        System.out.println("¿Es igual a 'Hola mundo'? " + texto.equals("Hola mundo"));
        System.out.println("¿Empieza por 'Ho'? " + texto.startsWith("Ho"));
        System.out.println("¿Termina en 'do'? " + texto.endsWith("do"));
    }
}
