import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EjemplosExpresionesRegulares {
    public static void main(String[] args) {
        /* Ejemplo 1: Validar un email */
        String email = "usuario@dominio.com";
        boolean esEmail = email.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}");
        System.out.println("¿Es un email válido? " + esEmail);

        /* Ejemplo 2: Buscar números en un texto */
        String texto = "Hay 3 gatos y 12 perros.";
        Pattern patron = Pattern.compile("\\d+");
        Matcher matcher = patron.matcher(texto);
        System.out.print("Números encontrados: ");
        while (matcher.find()) {
            System.out.print(matcher.group() + " ");
        }
        System.out.println();

        /* Ejemplo 3: Reemplazar todas las vocales por * */
        String frase = "Hola mundo";
        String resultado = frase.replaceAll("[aeiouAEIOU]", "*");
        System.out.println("Frase sin vocales: " + resultado);

        /* Ejemplo 4: Validar un número de teléfono español */
        String telefono = "612345678";
        boolean esTelefono = telefono.matches("[6-9][0-9]{8}");
        System.out.println("¿Es un teléfono español válido? " + esTelefono);
    }
}
