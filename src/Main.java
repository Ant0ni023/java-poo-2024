import java.util.Scanner;

public class Main{

    // Elimina los espacios en blanco de la cadena de texto.
    public static String eliminarEspacios(String cadena){
        return cadena.replaceAll(" ", "");
    }

    // Convierte todas las letras de la cadena a minúsculas.
    public static String convertidorAMinusculas(String cadena){
        return cadena.toLowerCase();    
    }

    // Elimina todas las puntuaciones de la cadena de texto.
    public static String eliminarPuntuaciones(String cadena){
        return cadena.replaceAll("\\p{Punct}", "");
    }

    // Limpia la cadena de entrada llamando a los métodos para eliminar espacios, puntuaciones y convertir a minúsculas.
    public static String limpiarCadena(String cadena){
        cadena = eliminarEspacios(cadena);
        cadena = eliminarPuntuaciones(cadena);
        cadena = convertidorAMinusculas(cadena);
        return cadena;
    }

    // Invierte el orden de los caracteres de la cadena de texto.
    public static String invertirCadena(String cadena){
        return new StringBuilder(cadena).reverse().toString();
    }

    // Solicita la entrada al usuario.
    public static void solicitarEntrada(){
        System.out.println("Ingrese una cadena de texto");
    }

    // Obtiene la entrada desde la consola.
    public static String obtenerEntrada(){
        Scanner scanner = new Scanner(System.in);
        String entrada = scanner.nextLine();
        scanner.close();
        return entrada;
    }

    // Compara si la cadena limpia y la cadena invertida son iguales.
    public static boolean esPalindromo(String cadenaLimpia, String cadenaInvertida){
        return cadenaLimpia.equals(cadenaInvertida);
    }

    // Imprime el resultado de si la cadena es o no un palíndromo.
    public static void imprimirResultado(boolean esPalindromo){
        if(esPalindromo){
            System.out.println("Es un palíndromo.");
        } else {
            System.out.println("No es un palíndromo.");
        }
    }

    // Verifica si la cadena ingresada por el usuario es un palíndromo.
    public static void verificarPalindromo(String inputUsuario){
        String cadenaLimpia = limpiarCadena(inputUsuario);
        String cadenaInvertida = invertirCadena(cadenaLimpia);
        boolean resultado = esPalindromo(cadenaLimpia, cadenaInvertida);
        imprimirResultado(resultado);
    }

    // Procesa la entrada del usuario.
    public static String procesarEntrada(){
        solicitarEntrada();
        return obtenerEntrada();
    }

    // Ejecuta la verificación del palíndromo.
    public static void ejecutarVerificacion(String entradaUsuario){
        verificarPalindromo(entradaUsuario);
    }

    // Ejecuta la aplicación llamando a los métodos necesarios para procesar la entrada y verificar el palíndromo.
    public static void main(String[] args){
        String entradaUsuario = procesarEntrada();
        ejecutarVerificacion(entradaUsuario);
    }
}
