package org.iesalandalus.programacion.modelo;

import org.iesalandalus.programacion.modelo.ColorTest;
import org.iesalandalus.programacion.reyajedrez.Color;
import org.iesalandalus.programacion.reyajedrez.Direccion;
import org.iesalandalus.programacion.reyajedrez.Posicion;
import org.iesalandalus.programacion.reyajedrez.Rey;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class ColorTest {
	
	private static final String NOMBRE_NO_VALIDO = "El nombre del color no es válido.";

	@Test
	void nombresValidosColores() {
		assertEquals("Blanco", Color.BLANCO.toString(), NOMBRE_NO_VALIDO);
		assertEquals("Negro", Color.NEGRO.toString(), NOMBRE_NO_VALIDO);
	}

}
