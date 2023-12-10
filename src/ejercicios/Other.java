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
public class Other {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Declaramos las variables para almacenar los números
        int n1, n2;

        // Mostramos el menú
        System.out.println("Calculadora básica");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        System.out.print("Elija una operación: ");
        int opcion = sc.nextInt();

        // Pedimos al usuario que introduzca los números
        System.out.print("Introduzca el primer número: ");
        n1 = sc.nextInt();

        System.out.print("Introduzca el segundo número: ");
        n2 = sc.nextInt();

        // Llamamos a la función correspondiente
        switch (opcion) {
            case 1:
                int suma = sumar(n1, n2);
                System.out.println("Suma: " + suma);
                break;
            case 2:
                int resta = restar(n1, n2);
                System.out.println("Resta: " + resta);
                break;
            case 3:
                int multiplicacion = multiplicar(n1, n2);
                System.out.println("Multiplicación: " + multiplicacion);
                break;
            case 4:
                int division = dividir(n1, n2);
                System.out.println("División: " + division);
                break;
        }
    }

    // Función para sumar dos números
    public static int sumar(int a, int b) {
        return a + b;
    }

    // Función para restar dos números
    public static int restar(int a, int b) {
        return a - b;
    }

    // Función para multiplicar dos números
    public static int multiplicar(int a, int b) {
        return a * b;
    }

    // Función para dividir dos números
    public static int dividir(int a, int b) {
        return a / b;
    }
}
