package org.iesalandalus.programacion.reyajedrez;
import javax.naming.OperationNotSupportedException;

public class MainApp {
    private static Rey rey;
    public static void main(String[] args) {
        int opcion;

        do {
            Consola.mostrarMenu();
            opcion = Consola.elegirOpcionMenu();
            ejecutarOpcion(opcion);
        } while (opcion != 4);

        Consola.despedirse();
    }

    private static void ejecutarOpcion(int opcion) {
        switch (opcion) {
            case 1:
                crearReyDefecto();
                break;
            case 2:
                crearReyColor();
                break;
            case 3:
                mover();
                break;
            case 4:
                // Salir, no hace falta hacer nada
                break;
            default:
                System.out.println("Opción no válida.");
        }
    }

    private static void crearReyDefecto() {
        rey = new Rey();
        System.out.println("Se ha creado un rey por defecto.");
        mostrarRey();
    }

    private static void crearReyColor() {
        Color color = Consola.elegirColor();
        rey = new Rey(color);
        System.out.println("Se ha creado un rey de color " + color + ".");
        mostrarRey();
    }

    private static void mover() {
        if (rey != null) {
            Consola.mostrarMenuDirecciones();
            Direccion direccion = Consola.elegirDireccion();

            try {
                rey.mover(direccion);
                System.out.println("El rey se ha movido correctamente.");
                mostrarRey();
            } catch (OperationNotSupportedException e) {
                System.out.println("Error: " + e.getMessage());
            }
        } else {
            System.out.println("Error: No se ha creado un rey.");
        }
    }

    private static void mostrarRey() {
        if (rey != null) {
            System.out.println("Información del rey: " + rey);
        } else {
            System.out.println("No se ha creado un rey.");
        }
    }
}

