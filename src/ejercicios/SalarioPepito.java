/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

/**
 *
 * @author angela
 */
public class SalarioPepito {
            public static void main(String[] args) {
                String name = "Pepito";
                double salarioMinimo = 1160000;
                double pagoTransporte = 140660;
                double descPension = (salarioMinimo*4)/100;
                double descSalud = (salarioMinimo*4)/100;
                double descTotal = descSalud + descPension;
                double salarioTotal = (salarioMinimo-descTotal)+ pagoTransporte;
                System.out.println("..........................");
                System.out.println("Nombre del Empleado: "+name+"\n"
                        +"Valor descuento EPS: "+descSalud+"\n"
                        +"Valor descuento Pension: "+descPension+"\n"
                       +"Valor Pago Transporte: "+pagoTransporte+"\n"
                        +"Valor salario Total: "+salarioTotal+"\n" 
                
                );
                System.out.println("..........................");
                        
    }
}
