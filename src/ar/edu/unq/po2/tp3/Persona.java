package ar.edu.unq.po2.tp3;

import java.time.LocalDate;
import java.time.Period;

public class Persona {
	
	private String nombre ; 
	private LocalDate fechaNac ;
		
	LocalDate ahora = LocalDate.now() ;
	
	public Persona(String nombre, LocalDate fechaNac) {
		super();
		this.nombre = nombre;
		this.fechaNac = fechaNac;
	}

	public String getNombre() {
		return nombre;
	}

	public LocalDate getFechaNac() {
		return fechaNac;
	}
	
	public int edad() {
		Period periodo = Period.between(fechaNac,ahora) ; 
		return periodo.getYears();
	}
	
	public Boolean menorQue(Persona persona) {
		return this.getFechaNac().isAfter(persona.getFechaNac()); // hace el calculo de que fecha esta despues  
	}
	
	public static Persona persona(String nombre , LocalDate fechaNac) {
		return new Persona(nombre,fechaNac);
	}
	
	
	
	

}
