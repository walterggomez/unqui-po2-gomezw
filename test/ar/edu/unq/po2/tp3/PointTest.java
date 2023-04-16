package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PointTest {
	
	Point puntoA = new Point(2,5) ;
	Point puntoB = new Point(5,2) ;
	Point puntoC = new Point();

	@Test
	void testLocalizacionDePuntos() {
		assertEquals(puntoC.getX(), 0);
		assertEquals(puntoC.getY(), 0);
		
		assertEquals(puntoA.getX(), 2);
		assertEquals(puntoA.getY(), 5);
		
		assertEquals(puntoB.getX(), 5);
		assertEquals(puntoB.getY(), 2);		
	}
	
	@Test
	void testMoverPunto() {
		puntoB.moverPunto(7, 10);
		
		assertEquals(puntoB.getX(),7);
		assertEquals(puntoB.getY(), 10);
	}
	
	@Test
	void testSumarPuntos() {
		Point puntoD =  puntoA.sumarPunto(puntoB);
		
		assertEquals(puntoD.getX(),7);
		assertEquals(puntoD.getY(),7);
	}
}
