package org.iesalandalus.programacion.modelo;
import org.iesalandalus.programacion.reyajedrez.Color;
import org.iesalandalus.programacion.reyajedrez.Direccion;
import org.iesalandalus.programacion.reyajedrez.Posicion;
import org.iesalandalus.programacion.reyajedrez.Rey;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({ ColorTest.class, DireccionTest.class, PosicionTest.class, ReyTest.class })
class AllTests {

}
