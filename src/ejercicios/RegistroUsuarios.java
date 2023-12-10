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

public class RegistroUsuarios {
    private static String[][] usuariosRegistrados = new String[100][3]; // Agregamos una columna adicional para almacenar el tipo de usuario
    private static int totalUsuarios = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean ejecutar = true;

        while (ejecutar) {
            System.out.println("Bienvenido al sistema de registro y menú de usuarios");
            System.out.println("1. Registrarse");
            System.out.println("2. Iniciar sesión");
            System.out.println("3. Salir");
            System.out.print("Ingrese su opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    registrarUsuario(scanner);
                    break;
                case 2:
                    boolean sesionIniciada = iniciarSesion(scanner);
                    if (sesionIniciada) {
                        menuPrincipal(scanner);
                    }
                    break;
                case 3:
                    ejecutar = false;
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                    break;
            }
        }

        System.out.println("¡Gracias por usar el programa!");
    }

    private static void registrarUsuario(Scanner scanner) {
        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.next();
        System.out.print("Ingrese su contraseña: ");
        String contraseña = scanner.next();
        System.out.print("Ingrese el tipo de usuario (1 para estándar, 2 para administrador): ");
        int tipoUsuario = scanner.nextInt();

        usuariosRegistrados[totalUsuarios][0] = nombre;
        usuariosRegistrados[totalUsuarios][1] = contraseña;
        usuariosRegistrados[totalUsuarios][2] = String.valueOf(tipoUsuario);
        totalUsuarios++;

        System.out.println("¡Registro exitoso!");
    }

    private static boolean iniciarSesion(Scanner scanner) {
        System.out.print("Ingrese su nombre de usuario: ");
        String nombreUsuario = scanner.next();
        System.out.print("Ingrese su contraseña: ");
        String contraseña = scanner.next();

        for (int i = 0; i < totalUsuarios; i++) {
            String nombre = usuariosRegistrados[i][0];
            String contraseñaGuardada = usuariosRegistrados[i][1];

            if (nombre.equals(nombreUsuario) && contraseña.equals(contraseñaGuardada)) {
                System.out.println("Inicio de sesión exitoso. ¡Bienvenido, " + nombreUsuario + "!");
                return true;
            }
        }

        System.out.println("Inicio de sesión fallido. Usuario o contraseña incorrectos.");
        return false;
    }

    private static void menuPrincipal(Scanner scanner) {
        System.out.println("\nMenú principal");
        System.out.println("1. Calculadora");
        System.out.println("2. Otro programa");
        System.out.println("3. Cerrar sesión");
        System.out.print("Ingrese su opción: ");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                realizarCalculo(scanner);
                break;
            case 2:
                ejecutarOtroPrograma();
                break;
            case 3:
                System.out.println("Cerrando sesión. ¡Hasta luego!");
                break;
            default:
                System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                break;
        }
    }

    private static void realizarCalculo(Scanner scanner) {
        System.out.print("Ingrese el primer número: ");
        double numero1 = scanner.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        double numero2 = scanner.nextDouble();
        System.out.print("Ingrese el operador (+, -, *, /): ");
        String operador = scanner.next();

        double resultado = 0;

        switch (operador) {
            case "+":
                resultado = numero1 + numero2;
                break;
            case "-":
                resultado = numero1 - numero2;
                break;
            case "*":
                resultado = numero1 * numero2;
                break;
            case "/":
                resultado = numero1 / numero2;
                break;
            default:
                System.out.println("Operador inválido. No se puede realizar el cálculo.");
                return;
        }

        System.out.println("El resultado es: " + resultado);
    }

    private static void ejecutarOtroPrograma() {
        System.out.println("Ejecutando otro programa...");
        // Aquí puedes agregar la lógica y funcionalidad de tu otro programa adicional
        System.out.println("Programa finalizado.");
    }
}
