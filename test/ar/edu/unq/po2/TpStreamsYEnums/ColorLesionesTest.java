package ar.edu.unq.po2.TpStreamsYEnums;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



class ColorLesionesTest {

	@BeforeEach
	void setUp() {
	}
	@Test
	void descripcionTest() {
		assertEquals("Lesion recien provocada",ColorLesiones.Rojo.getDescripcion());
		assertEquals("Lesion curandose",ColorLesiones.Amarillo.getDescripcion());
	}
	@Test
	void nuivelDeRiesgoTest() {
		assertEquals(2,ColorLesiones.Rojo.getNivelDeRiesgo());
		assertEquals(1,ColorLesiones.Miel.getNivelDeRiesgo());
	}	
	@Test
	void ordinalTest() {
		assertEquals(1,ColorLesiones.Gris.ordinal());
		assertEquals(3,ColorLesiones.Miel.ordinal());
	}
	@Test
	void sguienteColorTest() {
		assertEquals(0,ColorLesiones.Gris.compareTo(ColorLesiones.Rojo.getSiguiente()));
		assertEquals(0,ColorLesiones.Amarillo.compareTo(ColorLesiones.Gris.getSiguiente()));
		assertEquals(0,ColorLesiones.Miel.compareTo(ColorLesiones.Amarillo.getSiguiente()));
		assertEquals(0,ColorLesiones.Rojo.compareTo(ColorLesiones.Miel.getSiguiente()));
	}
	

}
