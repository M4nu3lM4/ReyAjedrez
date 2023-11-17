package org.iesalandalus.programacion.modelo;
import java.util.Objects;
import javax.naming.OperationNotSupportedException;

public class Rey {
    private Color color;
    private Posicion posicion;
    private int totalMovimientos;

    // Constructor por defecto
    public Rey() {
        this(Color.BLANCO);
    }

    // Constructor con parámetro de color
    public Rey(Color color) {
        setColor(color);
        if (color == Color.BLANCO) {
            this.posicion = new Posicion(1, 'e');
        } else {
            this.posicion = new Posicion(8, 'e');
        }
    }

    // Métodos get y set con validaciones
    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        if (color == null) {
            throw new IllegalArgumentException("El color no puede ser nulo.");
        }
        this.color = color;
    }

    public Posicion getPosicion() {
        return new Posicion(posicion); // Devuelve una copia para evitar la modificación externa
    }

    public void setPosicion(Posicion posicion) {
        if (posicion == null) {
            throw new IllegalArgumentException("La posición no puede ser nula.");
        }
        this.posicion = new Posicion(posicion);
    }

    public int getTotalMovimientos() {
        return totalMovimientos;
    }

    public void setTotalMovimientos(int totalMovimientos) {
        if (totalMovimientos < 0) {
            throw new IllegalArgumentException("El total de movimientos no puede ser negativo.");
        }
        this.totalMovimientos = totalMovimientos;
    }

    // Método mover con excepciones
    public void mover(Direccion direccion) throws OperationNotSupportedException {
        if (direccion == null) {
            throw new NullPointerException("La dirección no puede ser nula.");
        }

        // Implementa la lógica de movimiento y enroque según tus necesidades

        // Ejemplo de excepción por movimiento no permitido
        throw new OperationNotSupportedException("Movimiento no permitido.");
    }

    // Método toString
    @Override
    public String toString() {
        return "Rey [color=" + color + ", posición=" + posicion + "]";
    }
}


