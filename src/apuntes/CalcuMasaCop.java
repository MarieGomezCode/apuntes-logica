/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apuntes;
import java.util.Scanner;

/**
 *
 * @author 503
 */
public class CalcuMasaCop {
    public static void main(String[] args) {
    	
    	Scanner read = new Scanner(System.in);
    	double peso;
    	double altura;
    	System.out.println("Cual es Peso");
		peso = read.nextDouble();
		System.out.println(peso);
		System.out.println("Cual es altura");
		altura = read.nextDouble();
		System.out.println(altura);
		
		double imc = peso/(altura*altura);
		//System.out.println("This is a "+imc);
		
		
        if ((imc>= 18.5) && (imc <=24.9)) {
            System.out.println("Tienes un peso saludable");
           
       }
       if (imc<=18.5) {
           System.out.println("Tienes un peso bajo");
       }
       if (imc>=24.9) {
           System.out.println("Tienes sobre peso"); 
       }
		
		
		
		
		
		
    	
    	
    	
    	

       
         
    }
}
