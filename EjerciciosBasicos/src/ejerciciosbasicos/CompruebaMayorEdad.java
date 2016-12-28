
package ejerciciosbasicos;

import java.util.Scanner;

/**
 *
 * @author PCCasa
 */
public class CompruebaMayorEdad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      //Creamos el scanner para pedir los datos por consola.
        Scanner sc= new Scanner(System.in);
        //Introducimos la edad del usuario a comparar.
        System.out.println("Introduce tu edad");
        System.out.println("******************");
        int edad=sc.nextInt();
        boolean resultado=esMayorEdad(edad);
        if(resultado){
            System.out.println("El usuario es mayor de edad");
        }else{
            System.out.println("El usuario es menor de edad");
        }
    }
    /*
    Método que comprueba si la edad del usuario es mayor de 18
    @param int edad Edad a verificar
    @return boolean resultado Devuelve el resultado de la comparación.
    */
    public static boolean esMayorEdad(int edad){
        boolean resultado=false;
        //Comprobamos si la edad del usuario es mayor o igual de 18 años.
        if(edad>=18){
            resultado=true;
        }
        return resultado;
    }
}
