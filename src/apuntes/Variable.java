/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apuntes;

/**
 *
 * @author 503
 */
public class Variable {
        public static void main(String[] args) {
       // System.out.println("Quelo qu es"); 
       String name;//Esto es una variable declarada
       name = "Pepito"; //Aqui esta inicializada;
       int age = 25;// var declarada e inicializada
         System.out.println("Quelo qu es"); 
         int num1=4;
         int num2=5;
         int num3 = num1*num2;
         System.out.println("El resultado es: "+num3);
         System.out.println("Nuestro bots es " +name+" Tiene " +age+" Años"); 
         byte num = 127;//Rangos
         short numbyte = (short) num;
            System.out.println(numbyte);
        double altura = 1.76;
        int edad = 10;
            if ((edad<= 10) && (altura <= 1.76)) {
                System.out.println("Puede pasar");
            }
    }
}
