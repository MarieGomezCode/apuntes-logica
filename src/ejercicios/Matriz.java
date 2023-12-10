/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

import java.util.Scanner;



/**
 *
 * @author angela
 */
public class Matriz {
    public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
        
    int [][] numeros = new int [3][3];
    //{{4,9,8},{2,3,1},{7,5,0}};
    
           for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                
                numeros[2][2]=10;
                System.out.println("NUmero" + j +" es: "+numeros[i][j]);
            }
        }

  }
}
