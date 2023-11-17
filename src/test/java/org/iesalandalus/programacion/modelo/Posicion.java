package org.iesalandalus.programacion.modelo;

import java.util.Objects;

public class Posicion {
    private int fila;
    private char columna;

    // Constructor con la visibilidad adecuada
    public Posicion(int fila, char columna) {
        setFila(fila);
        setColumna(columna);
    }

    // Constructor copia
    public Posicion(Posicion otraPosicion) {
        this(otraPosicion.fila, otraPosicion.columna);
    }

    // Métodos get y set para los atributos
    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        if (fila < 1 || fila > 8) {
            throw new IllegalArgumentException("La fila debe estar entre 1 y 8, ambos inclusive.");
        }
        this.fila = fila;
    }

    public char getColumna() {
        return columna;
    }

    public void setColumna(char columna) {
        if (columna < 'a' || columna > 'h') {
            throw new IllegalArgumentException("La columna debe estar entre 'a' y 'h', ambos inclusive.");
        }
        this.columna = columna;
    }

    // Métodos equals y hashCode
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Posicion otraPosicion = (Posicion) obj;
        return fila == otraPosicion.fila && columna == otraPosicion.columna;
    }

    @Override
    public int hashCode() {
        return Objects.hash(fila, columna);
    }

    // Método toString
    @Override
    public String toString() {
        return "fila=" + fila + ", columna=" + columna;
    }
}

