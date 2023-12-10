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
public class CalculadoraFuncion {
    static Scanner entrada = new Scanner (System.in);
    public static int  numero1;
    public static int numero2;
       
    
    public static void main(String[] args) {
            
   System.out.println("Elige la operacion que quieres realizar: \n "
           +"1.Suma\n"
            +"2.Resta\n"
            +"3.Multiplicacion\n"
            +"4.Division\n"
         
   );
   
    int opc = entrada.nextInt();
        switch (opc) {
            case 1://Suma
                Calculadora();
                int resSuma=  suma(numero1, numero2);
                System.out.println("El resultado es: "+ resSuma);
                break;
            case 2:
                Calculadora();
                int resResta=  resta(numero1, numero2);
                System.out.println("El resultado es: "+ resResta);
                break;
            case 3:  
                Calculadora();
                int resMulti=  multiplicacion(numero1, numero2);
                System.out.println("El resultado es: "+ resMulti);
                break;
            case 4:  
                Calculadora();
                 int resDivi=  dividir(numero1, numero2);
                 System.out.println("El resultado es: "+ resDivi);
    
                break;
            default:
                System.out.println(".....Error........");
        }   
        
        
    }
    public static int suma(int numero1, int numero2){
        int suma= numero1 + numero2;
    
    
        return suma;
    
    
    
    }
        public static int resta(int numero1, int numero2){
        int resta= numero1 - numero2;
    
    
        return resta;
    
    
    
    }
    public static int multiplicacion(int numero1, int numero2){
        int multiplicacion= numero1 * numero2;
    
    
        return multiplicacion;
    
    
    
    }  
    public static int dividir(int numero1, int numero2){
        int dividir= numero1 / numero2;
    
    
        return dividir;
    
    
    
    } 
    public static void Calculadora(){
    
    System.out.println("ingrese el primer numero");
    
    numero1 = entrada.nextInt();
    System.out.println("ingrese el segundo numero");
    numero2 = entrada.nextInt();
 
    
    }
    
        
}
