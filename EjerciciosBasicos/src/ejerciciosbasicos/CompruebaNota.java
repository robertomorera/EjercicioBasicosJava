/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosbasicos;

import java.util.Scanner;

/**
 *
 * @author PCCasa
 */
public class CompruebaNota {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     //Pedir la nota al usuario
     Scanner sc = new Scanner(System.in);
     System.out.println("Introduce la nota");
     System.out.println("******************");
     int nota = sc.nextInt();
     //Mostramos la nota del usuario.
     compruebaNota(nota);
    }
    /*
    Método que muestra la nota del usuario por pantalla.
    @param nota del usuario.
    */
    public static void compruebaNota(int nota){
     switch(nota){
         case 0:System.out.println("Insuficiente"); break;
         case 1:System.out.println("Insuficiente"); break;
         case 2:System.out.println("Insuficiente"); break;
         case 3:System.out.println("Insuficiente"); break;
         case 4:System.out.println("Insuficiente"); break;
         case 5:System.out.println("Suficiente"); break;
         case 6:System.out.println("Bien"); break;
         case 7:System.out.println("Notable"); break;
         case 8:System.out.println("Notable"); break;
         case 9:System.out.println("Sobresaliente"); break;
         case 10:System.out.println("Sobresaliente"); break;
         default:     
    }
    
    }
}
