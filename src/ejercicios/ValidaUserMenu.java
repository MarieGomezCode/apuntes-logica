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
public class ValidaUserMenu {
    public static void main(String[] args) {
        Scanner capturar = new Scanner (System.in);
        String user = "Pepito";
        String contrasena = "contra1234";
        
        System.out.println("Bienvenido. Por favor ingrese sus credenciales.");
        System.out.print("Ingrese Usuario: ");
        String userIngre = capturar.nextLine();

        System.out.print("Ingrese Contraseña: ");
        String contrasenaIngre = capturar.nextLine();
        
       if (userIngre.equals(user) && contrasenaIngre.equals(contrasena)) {
            System.out.println("Inicio de sesión exitoso.");
            System.out.println("Ahora tiene acceso a los siguientes programas:  \n"
                                +"1.Calculadora \n"
                                +"2.Calcular IMC \n"
                                +"3.Profesiones \n"
            
            );
            
            int opc = capturar.nextInt();
                switch (opc) {
               case 1:
                    int opcCal;
                        int num1;
                        int num2;
                        int resultado;

                            System.out.println("Ha seleccionado Calculadora ");
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

                            opcCal = capturar.nextInt();
                                switch (opcCal) {
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
                                System.out.println("Que tenga Feliz Dia");

                                  break;
               case 2:
                        double peso;
                        double altura;
                        System.out.println("Cual es Peso");
                                peso = capturar.nextDouble();
                                System.out.println(peso);
                                System.out.println("Cual es tú altura");
                                altura = capturar.nextDouble();
                                System.out.println(altura);

                                double imc = peso/(altura*altura);
                                //System.out.println("This is a "+imc);


                        if ((imc>= 18.5) && (imc <=24.9)) {
                            System.out.println("Este es tu imc: "+imc);
                            System.out.println("Tienes un peso saludable");

                       }
                       if (imc<=18.5) {
                            System.out.println("Este es tu imc: "+imc);
                           System.out.println("Tienes un peso bajo");
                       }
                       if (imc>=24.9) {
                            System.out.println("Este es tu imc: "+imc);
                           System.out.println("Tienes sobre peso"); 
                       }
                       break;
               case 3:
                   System.out.println("Haz seleccionado Profesiones");
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
                    break;
      }
                System.out.println("Sesion Caducada");
        } else {
            System.out.println("Credenciales incorrectas. El programa finalizará.");
        }
        
    }
}
