
package ejerciciosbasicos;

import java.util.Scanner;

/**
 *
 * @author PCCasa
 */
public class ComparaCaracterCadena {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creamos el scanner para pedir los datos por consola.
        Scanner sc= new Scanner(System.in);
        //Introducimos el String a comparar.
        System.out.println("Introduce la cadena a comparar");
        System.out.println("******************");
        String cadena=sc.next();
        //Introducimos el caracter a comparar.
        System.out.println("Introduce el caracter a comparar");
        System.out.println("******************");
        String caracter=sc.next();
        //Convetirmos el String a tipo char.
        char caracterFormateado=caracter.charAt(0);
        //Comparamos los datos introducidos.
        boolean resultado=comparaCadenaCaracter(caracterFormateado,cadena);
        if(resultado){
            System.out.println("El carácter "+caracterFormateado+" está en la cadena "+cadena);
            
        }else{
             System.out.println("El carácter "+caracterFormateado+" no está en la cadena "+cadena);
        }
    }
    /*
    Método que mira si el caracter forma parte de la cadena introducida
    @param char caracter Caracter a comparar.
    @param String cadena String a comparar.
    @return boolean resultado Resultado de la comparación.
    */
    public static boolean comparaCadenaCaracter(char caracter,String cadena){
        boolean resultado=false;
        
        //Recorremos la cadena para mirar caracter a caracter;
        
        for(int i=0;i<cadena.length();i++){
            //Obtenemos el caracter en la posición i.
            char caracterCadena=cadena.charAt(i);
            //Comparamos el caracter de la posición i con el introducido por el usuario.
            if(caracter==caracterCadena){
                resultado=true;
            }
        }
        
        return resultado;
        
    }
    
}
