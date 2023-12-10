/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

/**
 *
 * @author angela
 */
import java.util.Scanner;

/**
 *
 * @author angela
 */
public class SaldoIngrGresos {
    public static void main(String[] args) {
        Scanner capturando = new Scanner(System.in);
        int saldo = 5000000;
        int ingresos = 0;
        int egresos =0;
         while(true){
         
                       System.out.println("Selecciones una opcion:\n"
                                + "1.Agregar Ingreso\n"
                                + "2.Agregar Egresos\n"
                                +"3.Salir\n"
                  
                  );
        int opcion = capturando.nextInt();
        
             if ( opcion == 1) {
               System.out.print("Ingresa el monto: ");
                int monto = capturando.nextInt();
                saldo = saldo + monto;
                ingresos++;
             }else if(opcion == 2) {
               System.out.print("Ingresa el monto: ");
                int monto = capturando.nextInt();
                if (monto <= saldo) {
                    monto = monto - saldo;
                    egresos++;
                } else {
                    System.out.println("Saldo Insuficiente .");
                }
         
            }else if (opcion == 3){           
                System.out.println("Saliendo...");
            System.out.println("Saldo actual: " + saldo);
            System.out.println("Total Ingresos: " + ingresos);
            System.out.println("Total Egresos: " + egresos);
                break;
                
               }else {
                System.out.println("Respuesta Invalida Sea serio ome.");
                      }
         
            }
        
        
   
         }
}

