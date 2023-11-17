package org.iesalandalus.programacion.modelo;

public enum Color {
    BLANCO("Blanco"),
    NEGRO("Negro");

    private String cadenaAMostrar;

    // Constructor con la visibilidad adecuada
    private Color(String cadenaAMostrar) {
        this.cadenaAMostrar = cadenaAMostrar;
    }

    // Método toString
    @Override
    public String toString() {
        return cadenaAMostrar;
    }
}

