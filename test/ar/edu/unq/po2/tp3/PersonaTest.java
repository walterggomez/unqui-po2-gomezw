package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import org.junit.jupiter.api.Test;

class PersonaTest {
	DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	LocalDate fechaNacLeandro = LocalDate.parse("29/07/1994", fmt);
	LocalDate fechaNacTomas = LocalDate.parse("29/03/1994", fmt);
	LocalDate fechaNacSoledad = LocalDate.parse("25/04/1980", fmt);
	LocalDate fechaNacEmilia = LocalDate.parse("15/02/2003", fmt);
	LocalDate fechaNaWalter = LocalDate.parse("26/05/1980", fmt);
	
	Persona leandro = new Persona("Leandro", fechaNacLeandro);
	Persona tomas = new Persona("Tomas", fechaNacTomas);
	Persona soledad = new Persona("Soledad", fechaNacSoledad);
	Persona emilia = new Persona("Emilia", fechaNacEmilia);
	
	

	@Test
	void testNombre() {
		assertEquals(leandro.getNombre() ,"Leandro");
		assertEquals(tomas.getNombre() ,"Tomas");
		assertEquals(soledad.getNombre() ,"Soledad");
		assertEquals(emilia.getNombre() ,"Emilia");
		
	}
	
	void testFechaDeNacimiento() {
		assertEquals(leandro.getFechaNac() ,fechaNacLeandro);
		assertEquals(tomas.getFechaNac() ,fechaNacTomas);
		assertEquals(soledad.getFechaNac() ,fechaNacSoledad);
		assertEquals(emilia.getFechaNac() ,fechaNacEmilia);		
	}
	
	void testEdad() {
		assertEquals(leandro.edad() ,28);
		assertEquals(tomas.edad() ,29);
		assertEquals(soledad.edad(),42);
		assertEquals(emilia.edad() ,20);		
	}
	
	void testMenorQue() {
		assertTrue(leandro.menorQue(tomas));
		assertFalse(leandro.menorQue(soledad));
		assertFalse(emilia.menorQue(soledad));
		assertTrue(emilia.menorQue(tomas));
	}	
	void testPersona() {
		

		assertEquals(Persona.persona("Walter", fechaNaWalter).getNombre() ,"Walter");
		assertEquals(Persona.persona("Walter", fechaNaWalter).getFechaNac() ,fechaNaWalter);
		assertEquals(Persona.persona("Walter", fechaNaWalter).edad() ,42);
		assertFalse(Persona.persona("Walter", fechaNaWalter).menorQue(tomas));

	}
}
