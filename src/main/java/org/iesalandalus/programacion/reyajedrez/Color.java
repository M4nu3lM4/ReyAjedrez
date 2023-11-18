package org.iesalandalus.programacion.reyajedrez;
import org.iesalandalus.programacion.reyajedrez.Color;
import org.iesalandalus.programacion.reyajedrez.Direccion;
import org.iesalandalus.programacion.reyajedrez.Posicion;
import org.iesalandalus.programacion.reyajedrez.Rey;
import org.iesalandalus.programacion.reyajedrez.Color;
public enum Color {
    BLANCO("Blanco"),
    NEGRO("Negro");

    private String cadenaAMostrar;

    Color(String cadenaAMostrar) {
        this.cadenaAMostrar = cadenaAMostrar;
    }

    @Override
    public String toString() {
        return this.cadenaAMostrar;
    }
}
