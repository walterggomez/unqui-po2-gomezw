package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RectanguloTest {
	
	Point inicio = new Point();
	Rectangulo r = new Rectangulo(inicio,7,8);
	
	Cuadrado c = new Cuadrado(inicio,6);

	@Test
	void tesRectangulo() {
		
		assertEquals(r.getEsquinaInferiorIzq().getX(), 0 );
		assertEquals(r.getEsquinaInferiorIzq().getY(), 0 );
		
		assertEquals(r.getEsquinaInferiorDer().getX(),7);
		assertEquals(r.getEsquinaInferiorDer().getY(),0);
		
		assertEquals(r.getEsquinaSuperiorrIzq().getX(),0);
		assertEquals(r.getEsquinaSuperiorrIzq().getY(),8);
		
		assertEquals(r.getEsquinaSuperiorDer().getX(),7);
		assertEquals(r.getEsquinaSuperiorDer().getY(),8);
	
		assertEquals(r.area(), 56 );
		assertEquals(r.perimetro(), 30);
		
		assertTrue(r.orientacion() == "Vertical");

	}
	

	@Test
	void testCuadrado() {
		
		assertEquals(c.getEsquinaInferiorIzq().getX(), 0 );
		assertEquals(c.getEsquinaInferiorIzq().getY(), 0 );
		
		assertEquals(c.getEsquinaInferiorDer().getX(),6);
		assertEquals(c.getEsquinaInferiorDer().getY(),0);
		
		assertEquals(c.getEsquinaSuperiorrIzq().getX(),0);
		assertEquals(c.getEsquinaSuperiorrIzq().getY(),6);
		
		assertEquals(c.getEsquinaSuperiorDer().getX(),6);
		assertEquals(c.getEsquinaSuperiorDer().getY(),6);
	
		assertEquals(c.area(), 36 );
		assertEquals(c.perimetro(), 24);
		
		assertFalse(c.orientacion() == "Vertical");

	}
	

}
