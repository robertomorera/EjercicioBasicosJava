
package ejerciciosbasicos;

import java.util.Scanner;

/**
 *
 * @author PCCasa
 */
public class DarVueltaCadena {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         //Creamos el scanner para pedir los datos por consola.
        Scanner sc= new Scanner(System.in);
        //Introducimos el String a comparar.
        System.out.println("Introduce la cadena");
        System.out.println("******************");
        String cadena=sc.next();
        //Damos la vuelta al mensaje introducido por el usuario.
        String cadenaVolteada=darVuelta(cadena);
        System.out.println("El resultado del procesado de la cadena es: "+cadenaVolteada);
    }
    /*
     Método que da la vuelta a un mensaje.
    @param String cadena. Cadena a dar la vuelta.
    @return String cadenaFormateada.
    */
    public static String darVuelta(String cadena){
        String cadenaFormateada="";
        for(int i=cadena.length()-1;i>=0;i--){
           cadenaFormateada=cadenaFormateada+cadena.charAt(i);
        }
        return cadenaFormateada;
    }
    
    
}
