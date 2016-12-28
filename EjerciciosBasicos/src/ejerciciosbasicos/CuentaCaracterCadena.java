
package ejerciciosbasicos;

import java.util.Scanner;

/**
 *
 * @author PCCasa
 */
public class CuentaCaracterCadena {

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
        //Introducimos el caracter a comparar.
        System.out.println("Introduce el caracter a contar");
        System.out.println("******************");
        String caracter=sc.next();
        //Convetirmos el String a tipo char.
        char caracterFormateado=caracter.charAt(0);
        int contador=cuentaCaracterCadena(cadena, caracterFormateado);
        System.out.println("El caracter "+caracterFormateado+" aparecer en la cadena "+cadena+" "+contador+ " veces");
    }
    
    /*
    Método que cuenta el número de veces que el caracter forma parte de la cadena introducida
    @param char caracter Caracter a comparar.
    @param String cadena String a comparar.
    @return boolean resultado Resultado de la comparación.
    */
    public static int cuentaCaracterCadena(String cadena,char caracter){
        //Inicializamos el contador.
        int contador=0;
        for(int i=0;i<cadena.length();i++){
            //Obtenemos el caracter en la posición i.
            char caracterCadena=cadena.charAt(i);
            //Comparamos el caracter de la posición i con el introducido por el usuario.
            if(caracter==caracterCadena){
                //Incrementamos el contador;
                contador++;
            }
        }
        return contador;
    }
    
}
