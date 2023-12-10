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
public class fAnidado {
    public static void main(String[] args) {
        Scanner capturar = new Scanner (System.in);
         
        System.out.println("Ingresa tu salario");
        double salario = capturar.nextDouble();
        
                String a="Tecnico";
                String b="Tecnologo";
                String c="Profesional";
                String d="Especializacion";
            double auxtransp = 140000;
            double salarioTotal= salario+auxtransp;
            double salarioMinimo= 1160000;
            
            if (salario < salarioMinimo) {
                System.out.println("Voz no tenes derecho");
                System.out.println("El salario total es: "+salario);
        }else{
            if (salario>=salarioMinimo && salario<1740000) {
                System.out.println("Eres categoria a: "+a);
                 System.out.println("Tu sumado auxilio seria: "+salarioTotal);
                }
               
            if (salario>=1740000 && salario<2320000) {
             System.out.println("Eres categoria b: "+b);
              System.out.println("Tu sumado auxilio seria: "+salarioTotal);
                }
                
            if (salario>= 2320000 && salario<4060000) {
            System.out.println("Eres categoria c: "+c);
             System.out.println("Tu sumado auxilio seria: "+salarioTotal);
                }
                
            if (salario>=4060000) {
                System.out.println("Eres categoria d: "+d);
                 System.out.println("Tu sumado auxilio seria: "+salarioTotal);
                }
                 
            }
    }
}
