
public class PruebaMetodosString {
    public static void main(String[] args) {
        /* Pruebas de métodos básicos de String */
        String ejemplo = "Hola mundo cruel";
        System.out.println("Original: " + ejemplo);
        System.out.println("toUpperCase: " + ejemplo.toUpperCase());
        System.out.println("toLowerCase: " + ejemplo.toLowerCase());
        System.out.println("length: " + ejemplo.length());
        System.out.println("charAt(5): " + ejemplo.charAt(5));
        System.out.println("substring(5, 10): " + ejemplo.substring(5, 10));
        System.out.println("replace('o', 'a'): " + ejemplo.replace('o', 'a'));
        System.out.println("indexOf('mundo'): " + ejemplo.indexOf("mundo"));
        System.out.println("lastIndexOf('o'): " + ejemplo.lastIndexOf('o'));
        System.out.println("startsWith('Hola'): " + ejemplo.startsWith("Hola"));
        System.out.println("endsWith('cruel'): " + ejemplo.endsWith("cruel"));
        System.out.println("contains('mun'): " + ejemplo.contains("mun"));
        /* Ejemplo propio: buscar la última aparición de una letra de derecha a izquierda */
        String texto = "abracadabra";
        char letra = 'a';
        int ultima = texto.lastIndexOf(letra);
        System.out.println("La última 'a' en '" + texto + "' está en la posición: " + ultima);
        /* Otro ejemplo propio: invertir una cadena usando StringBuilder */
        StringBuilder sb = new StringBuilder(ejemplo);
        System.out.println("Invertido: " + sb.reverse());
        /* Ejemplo: buscar la última aparición de una palabra */
        String frase = "el perro corre y el perro salta";
        int ultimaPalabra = frase.lastIndexOf("perro");
        System.out.println("La última aparición de 'perro' está en la posición: " + ultimaPalabra);
        /* Ejemplo: buscar desde una posición hacia atrás */
        int desde = 10;
        int pos = texto.lastIndexOf('a', desde);
        System.out.println("La última 'a' antes de la posición 10 está en: " + pos);
    }
}
