package org.iesalandalus.programacion.reyajedrez;

import javax.naming.OperationNotSupportedException;
import org.iesalandalus.programacion.reyajedrez.Color;
import org.iesalandalus.programacion.reyajedrez.Direccion;
import org.iesalandalus.programacion.reyajedrez.Posicion;
import org.iesalandalus.programacion.reyajedrez.Rey;
public class Rey {
    private Color color;
    private Posicion posicion;
    private int totalMovimientos;

    public Rey() {
        this.color = Color.BLANCO;
        this.posicion = new Posicion(1, 'e');
    }

    public Rey(Color color) {
        this.color = color;
        this.posicion = color == Color.BLANCO ? new Posicion(1, 'e') : new Posicion(8, 'e');
    }

    public Color getColor() {
        return this.color;
    }

    public void setColor(Color color) {
        if (color == null) {
            throw new IllegalArgumentException("El color no puede ser nulo.");
        }
        this.color = color;
    }

    public Posicion getPosicion() {
        return this.posicion;
    }

    public void setPosicion(Posicion posicion) {
        if (posicion == null) {
            throw new IllegalArgumentException("La posición no puede ser nula.");
        }
        this.posicion = posicion;
    }

    public int getTotalMovimientos() {
        return this.totalMovimientos;
    }

    public void mover(Direccion direccion) throws OperationNotSupportedException {
        if (direccion == null) {
            throw new IllegalArgumentException("La dirección no puede ser nula.");
        }
        // Aquí deberías implementar la lógica para mover el rey en la dirección especificada.
        // Si el movimiento no es válido, debes lanzar una OperationNotSupportedException.
        // Si el movimiento es válido, debes actualizar la posición del rey e incrementar totalMovimientos en uno.
    }

    @Override
    public String toString() {
        return "Color: " + color + ", Posición: " + posicion;
    }
}
