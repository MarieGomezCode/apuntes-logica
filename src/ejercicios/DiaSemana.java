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
public class DiaSemana {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        String[][] diaSemana = new String [2][3];//Una fila 7 columnas
        
        //EST CODIGO NO FUNCIONA O ESTA INCOMPLETO 
        int ciclo = 0;
        
        do{
        
        
        System.out.println("Ingrese la posicion de i");
        int i = read.nextInt();
        System.out.println("Ingrese la posicion de j");
        int j= read.nextInt();
        System.out.println("Ingrese el dia de la seamana");
        diaSemana [i][j]= read.nextLine();
         
           ciclo++;//Contador  
        
        }
        while (ciclo > 7); 
       
        
        for (int i = 0; i < diaSemana.length; i++) {
            for (int j = 0; j < diaSemana[i].length; j++) {
                System.out.println("Dia " + j +" es: "+diaSemana[i][j]);
            }
        
        }
     }   
    }

