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
public class RegistroSesion {
    //Esto esta enredaddo pero funciona
     public static void main(String[] args) {
        // Crear un array de usuarios
        String[] usuarios = new String[1];
        String[] contraseñas = new String[1];

        // Solicitar al usuario sus credenciales
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su nombre de usuario:");
        String usuario = scanner.nextLine();
        System.out.println("Ingrese su contraseña:");
        String contraseña = scanner.nextLine();

        // Guardar las credenciales en el array
        for (int i = 0; i < usuarios.length; i++) {
            if (usuarios[i] == null) {
                usuarios[i] = usuario;
                contraseñas[i] = contraseña;
                break;
            }
        }

        // Imprimir las credenciales guardadas
        for (int i = 0; i < usuarios.length; i++) {
            System.out.println("Usuario: " + usuarios[i] + ", Contraseña: " + contraseñas[i]);
        }
    }

}
