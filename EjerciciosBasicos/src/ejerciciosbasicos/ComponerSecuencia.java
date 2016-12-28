/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosbasicos;

/**
 *
 * @author PCCasa
 */
public class ComponerSecuencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      //Imprimimos la secuencia deseada por la consola.
       componerSecuencia();
    }
    
    /*
     Método que imprime por pantalla la secuencia 3,6,9,...99
    */
    public static void componerSecuencia(){
    
    for(int i=1;i<=99/3;i++){
        int secuenciai=i*3;
        System.out.println(secuenciai);
    }
   
}
}
