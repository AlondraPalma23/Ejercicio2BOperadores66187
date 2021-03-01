/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2BOperadores66187;

import java.util.Scanner;

/**
 *
 * @author Alondra Palma
 */
public class Ejercicio2BOperadores66187 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int matriz [][] = new int [2][2];
  
        Scanner miConsola = new Scanner (System.in);
        System.out.println("Ingresa el valor para la matriz [0][0]");
        matriz[0][0]= miConsola.nextInt();
        
        System.out.println("Ingresa el valor para la matriz [0][1]");
        matriz[0][1]= miConsola.nextInt();
        
        System.out.println("Ingresa el valor para la matriz [1][0]");
        matriz[1][0]= miConsola.nextInt();
         
        System.out.println("Ingresa el valor para la matriz [1][1]");
        matriz[1][1]= miConsola.nextInt();
        
        int determinante = ( matriz[0][0] * matriz[1][1])-(matriz[0][1] * matriz[1][0]);
        System.out.println("La determinante es: " + determinante);
    }
    
}
