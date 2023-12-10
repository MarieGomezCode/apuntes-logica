package apuntes;

import java.util.Scanner;

public class DoWhileDos {

    public static void main(String[] args) {
        Scanner cap = new Scanner (System.in);
        int numero = 0;
        int total = 0;
        String respuesta;

        do {
            System.out.println("Ingrese un número:");
            numero = cap.nextInt();
            total += numero;

            System.out.println("¿Desea agregar otro número? (s/n)");
            respuesta = cap.next();
        } while (respuesta.equals("s"));

        System.out.println("El total es: " + total);
    }
	
}
//Funcionalidad que permita agrupar un numero y sumar 
//, debe preguntar si desea agregar otro numero si deben agrugarlo
//que ingrese y si no desea que agregue n. la ejecucion termina cuando 
//no quiera agregar mas numeros. debe mostrar el total de los numeros a
//gregados.  