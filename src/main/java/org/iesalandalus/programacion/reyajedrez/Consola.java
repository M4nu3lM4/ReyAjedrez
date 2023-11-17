package org.iesalandalus.programacion.reyajedrez;
import java.awt.*;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Consola {
    private static Scanner scanner = new Scanner(System.in);

    // Constructor privado para evitar instanciación
    private Consola() {
    }

    // Método para mostrar el menú
    public static void mostrarMenu() {
        System.out.println("----- Menú -----");
        System.out.println("1. Crear rey por defecto");
        System.out.println("2. Crear rey eligiendo el color");
        System.out.println("3. Mover");
        System.out.println("4. Salir");
    }

    // Método para elegir una opción del menú
    public static int elegirOpcionMenu() {
        int opcion = 0;
        boolean opcionValida = false;

        do {
            try {
                System.out.print("Elige una opción: ");
                opcion = scanner.nextInt();
                scanner.nextLine(); // Consumir el salto de línea
                if (opcion >= 1 && opcion <= 4) {
                    opcionValida = true;
                } else {
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Por favor, introduce un número válido.");
                scanner.nextLine(); // Limpiar el búfer del scanner
            }
        } while (!opcionValida);

        return opcion;
    }

    // Método para elegir un color
    public static Color elegirColor() {
        int opcion;
        do {
            System.out.println("Elige un color:");
            System.out.println("1. Blanco");
            System.out.println("2. Negro");

            opcion = elegirOpcionMenu();
        } while (opcion != 1 && opcion != 2);

        return (opcion == 1) ? Color.WHITE : Color.BLACK;
    }

    // Método para mostrar el menú de direcciones
    public static void mostrarMenuDirecciones() {
        System.out.println("----- Menú de Direcciones -----");
        // Aquí puedes mostrar las direcciones disponibles (usando el enumerado Direccion)
    }

    // Método para elegir una dirección
    public static Direccion elegirDireccion() {
        // Implementa la lógica para elegir una dirección
        return Direccion.NORTE; // Esto es un ejemplo, reemplázalo con la lógica adecuada
    }

    // Método para despedirse
    public static void despedirse() {
        System.out.println("¡Hasta luego!");
    }
}