package ar.edu.unq.po2.tp4;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProductoPrimeraNecesidadTest {

	private ProductoPrimeraNecesidad leche;
	private ProductoPrimeraNecesidad arroz;
	private ProductoPrimeraNecesidad lecheLargaVida;
	
	@BeforeEach
	public void setUp() {
		leche = new ProductoPrimeraNecesidad("Leche", 8d, false, 0.1); // se le agrego el 10 % para que se cumpla el item 
																	 //	nro. 1
		arroz = new ProductoPrimeraNecesidad("Arroz", 15d, true, 0.08);
		lecheLargaVida = new ProductoPrimeraNecesidad("Leche Larga Vida", 15d, true, 0.11);
		
	}
	
	@Test
	public void testCalcularPrecio() {
		assertEquals(new Double(7.2), leche.getPrecio());
		assertEquals(new Double(13.8), arroz.getPrecio());
		assertEquals(new Double(13.35), lecheLargaVida.getPrecio());
	}
	
	
}
