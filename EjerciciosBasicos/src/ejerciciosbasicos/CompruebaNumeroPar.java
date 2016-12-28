package ejerciciosbasicos;


import java.util.Scanner;


/**
 *
 * @author PCCasa
 */
public class CompruebaNumeroPar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creamos el scanner para pedir los datos por consola.
        Scanner sc= new Scanner(System.in);
        //Introducimos el número a comparar.
        System.out.println("Introduce el número a verificar");
        System.out.println("******************");
        int numero=sc.nextInt();
        boolean esPar=esPar(numero);
        if(esPar){
          System.out.println("El número "+numero+" es par");  
        }else{
          System.out.println("El número "+numero+" es impar");    
        }
    }
    /*
     Método que comprueba si el número es par.
     @param int numero Número a comparar.
     @return boolean resultado Devuelve el resultado
     de la comparación
    */
    public static boolean esPar(int numero){
      //Comprobamos si el número es par.
      boolean resultado=false;
      if(numero%2==0){
          resultado=true;
      }
      return resultado;
    }
    
}
