package org.iesalandalus.programacion.reyajedrez;
import org.iesalandalus.programacion.reyajedrez.Color;
import org.iesalandalus.programacion.reyajedrez.Direccion;
import org.iesalandalus.programacion.reyajedrez.Posicion;
import org.iesalandalus.programacion.reyajedrez.Rey;
import java.util.Scanner;
import javax.naming.OperationNotSupportedException;
import java.util.Scanner;

public class MainApp {
    private static Rey rey;

    public static void ejecutarOpcion(int opcion) throws OperationNotSupportedException {
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
                mostrarRey();
                break;
            default:
                Consola.despedirse();
                break;
        }
    }

    public static void crearReyDefecto() {
        rey = new Rey();
    }

    public static void crearReyColor() {
        Color color = Consola.elegirOpcion();
        rey = new Rey(color);
    }

    public static void mover() throws OperationNotSupportedException {
        Direccion direccion = Consola.elegirDireccion();
        rey.mover(direccion);
    }

    public static void mostrarRey() {
        if (rey == null) {
            System.out.println("El rey no ha sido creado.");
        } else {
            System.out.println(rey);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            Consola.mostrarMenu();
            opcion = Consola.elegirOpcionMenu();
            try {
                ejecutarOpcion(opcion);
            } catch (OperationNotSupportedException e) {
                System.out.println(e.getMessage());
            }
        } while (opcion != 4);
    }
}
