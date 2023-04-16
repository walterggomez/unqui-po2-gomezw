package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EquipoDeTrabajoTest {
	
	private List<Persona> integrantes = new ArrayList<Persona>();
	
	DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	LocalDate fechaNacLeandro = LocalDate.parse("29/07/1994", fmt);
	LocalDate fechaNacTomas = LocalDate.parse("29/03/1994", fmt);
	LocalDate fechaNacSoledad = LocalDate.parse("25/04/1980", fmt);
	LocalDate fechaNacEmilia = LocalDate.parse("15/02/2003", fmt);
	LocalDate fechaNaWalter = LocalDate.parse("26/05/1980", fmt);
	
	Persona leandro = new Persona("Leandro Pepe", fechaNacLeandro);
	Persona tomas = new Persona("Tomas Fuentes", fechaNacTomas);
	Persona soledad = new Persona("Soledad Pardo", fechaNacSoledad);
	Persona emilia = new Persona("Emilia Gomez", fechaNacEmilia);
	Persona walter = new Persona("Walter Gomez",fechaNaWalter);
	

	
	EquipoDeTrabajo equipo = new EquipoDeTrabajo("Los Alacranes",integrantes) ;
	
	@BeforeEach
	void setUp() throws Exception {
		
		equipo.agregarIntegrante(leandro);
		equipo.agregarIntegrante(tomas);
		equipo.agregarIntegrante(soledad);
		equipo.agregarIntegrante(emilia);
		equipo.agregarIntegrante(walter);
		
	}
	@Test
	void testEquipoDeTrabajo() {
		assertEquals(equipo.getNombre() ,"Los Alacranes");
		assertEquals(equipo.promedioIntegrantes(),32);
	}

}
