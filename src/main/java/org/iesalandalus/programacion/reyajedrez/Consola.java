package org.iesalandalus.programacion.reyajedrez;
import org.iesalandalus.programacion.reyajedrez.Color;
import org.iesalandalus.programacion.reyajedrez.Direccion;
import org.iesalandalus.programacion.reyajedrez.Posicion;
import org.iesalandalus.programacion.reyajedrez.Rey;
import java.util.Scanner;

public class Consola {
    private Consola() {
    }

    public static void mostrarMenu() {
        System.out.println("1. Crear rey por defecto");
        System.out.println("2. Crear rey eligiendo el color");
        System.out.println("3. Mover");
        System.out.println("4. Salir");
    }

    public static int elegirOpcionMenu() {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("Elige una opción:");
            opcion = scanner.nextInt();
        } while (opcion < 1 || opcion > 4);
        return opcion;
    }

    public static Color elegirOpcion() {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("Elige un color:");
            System.out.println("1. Blanco");
            System.out.println("2. Negro");
            opcion = scanner.nextInt();
        } while (opcion < 1 || opcion > 2);
        return opcion == 1 ? Color.BLANCO : Color.NEGRO;
    }

    public static void mostrarMenuDirecciones() {
        System.out.println("1. NORTE");
        System.out.println("2. NORESTE");
        System.out.println("3. ESTE");
        System.out.println("4. SURESTE");
        System.out.println("5. SUR");
        System.out.println("6. SUROESTE");
        System.out.println("7. OESTE");
        System.out.println("8. NOROESTE");
        System.out.println("9. ENROQUE_CORTO");
        System.out.println("10. ENROQUE_LARGO");
    }

    public static Direccion elegirDireccion() {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("Elige una dirección:");
            opcion = scanner.nextInt();
        } while (opcion < 1 || opcion > 10);
        // Aquí deberías devolver la dirección correspondiente a la opción elegida.
        return null;
    }

    public static void despedirse() {
        System.out.println("¡Gracias por usar nuestra aplicación! ¡Hasta la próxima!");
    }
}