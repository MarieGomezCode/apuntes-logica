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
public class Calculadora {
    public static void main(String[] args) {
                    
    Scanner capturar = new Scanner(System.in);//Importar Libreria
    //Declaracion de variables 
    
    int opc;
    int num1;
    int num2;
    int resultado;
 
    
        System.out.println("Ingrese el primer number");
        num1 = capturar.nextInt();
         System.out.println("Ingrese el Segundo number");
        num2 = capturar.nextInt();
    
   System.out.println("Elige la operacion que quieres realizar: \n "
           +"1.Suma\n"
            +"2.Resta\n"
            +"3.Multiplicacion\n"
            +"4.Division\n"
   );
   
    opc = capturar.nextInt();
        switch (opc) {
            case 1://Suma
                resultado = num1 + num2;
                System.out.println("El resultado es:"+ resultado );
                break;
            case 2:    
                 resultado = num1 - num2;
                System.out.println("El resultado es:"+ resultado );
                break;
            case 3:    
                 resultado = num1 * num2;
                System.out.println("El resultado es:"+ resultado );
                break;
            case 4:    
                 resultado = num1 / num2;
                System.out.println("El resultado es:"+ resultado );
                break;
            default:
                System.out.println(".....Error........");
        }   
    
    }

        
         
            
}
