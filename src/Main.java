import java.util.Scanner;


public class Main{

//Declaracion de metodo encargado de eliminar los espacios en la cadena de texto ingresada.
public static String eliminarEspacios(String cadena){
return cadena.replaceAll(" ", "");
}


public static String convertidorAMinusculas(String cadena){
return cadena.toLowerCase();    
}


public static String eliminarPuntuaciones(String cadena){
return cadena.replaceAll("\\p{Punct}", "");
}


public static String limpiarCadena(String cadena){
cadena=eliminarEspacios(cadena);
cadena=eliminarPuntuaciones(cadena);
cadena=convertidorAMinusculas(cadena);
return cadena;
}


public static String invertirCadena(String cadena){
    return new StringBuilder(cadena).reverse().toString();
}


public static String obtenerEntradaUsuario(){
Scanner scanner= new Scanner(System.in);
System.out.println("Ingrese una cadena de texto");
String entrada=scanner.nextLine();
scanner.close();//No es recomendable cerrar el scanner si fueramos a pedirle mas de una vez al usuario que ingrese datos
return entrada;
}


public static boolean esPalindromo(String cadenaLimpia, String cadenaInvertida){
    return cadenaLimpia.equals(cadenaInvertida);
}


public static void verificarPalindromo(String inputUsuario){
String cadenaLimpia=limpiarCadena(inputUsuario);
String cadenaInvertida=invertirCadena(cadenaLimpia);
boolean resultado=esPalindromo(cadenaLimpia, cadenaInvertida);

if(resultado){
    System.out.println("es un palindromo");
} else{
    System.out.println("no es un palindromo");
}
}

public static void main(String[] args){
String entradaUsuario=obtenerEntradaUsuario();
verificarPalindromo(entradaUsuario);
}


}
