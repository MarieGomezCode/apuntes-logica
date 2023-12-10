/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apuntes;

import java.util.Scanner;

/**
 *
 * @author angela
 */
public class funcionesClase {
    static Scanner entrada = new Scanner(System.in);
    public static int largo;
    public static int ancho;
    
    
    
    
   public static void main(String[] args) {
        /*
        //Main para llamar funciones
        
        System.out.println(sumar());
        double descuento = calcularSalud(1160000);
        System.out.println("El descuento x salud de peipto es : "+descuento);
*/
        calcularApp();
    }
   
   
   
    //Esta funcion retona el resutado de una operacion pero no recible ningun parametro
    public static int sumar (){
        int num1 = 23;
        int num2 = 15;
        int res=num1+num2;
        //return resultado;
        return num1 + num2;
        
    }
    public static double calcularSalud(double salario){
    
    double descuentoSalud = salario * 0.04;
    return descuentoSalud;
    
    }
    public static int area(int largo, int ancho){
        int area = largo * ancho;
    
    
        return area;
    
    
    
    }
    public static void calcularApp(){
    
        System.out.println("ingrese el Ancho");
        ancho = entrada.nextInt();
        System.out.println("ingrese el Altura");
        largo= entrada.nextInt();
        
       int res=  area(ancho, largo);
        System.out.println("El resultado es"+ res);
        
    }
   
}
