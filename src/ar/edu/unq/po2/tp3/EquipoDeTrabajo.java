package ar.edu.unq.po2.tp3;

import java.util.List;

public class EquipoDeTrabajo {
	
	private String nombre ;
	private List<Persona> integrantes;
	
	public EquipoDeTrabajo(String nombre, List<Persona> integrantes) {
		super();
		this.nombre = nombre;
		this.integrantes = integrantes;
	}

	public String getNombre() {
		return nombre;
	}
	
	public List<Persona> getPersonas() {
		return integrantes;
	}
	
	public void agregarIntegrante(Persona persona){
		this.integrantes.add(persona);
	}
	
	public double promedioIntegrantes() {
		
		return this.sumaDeEdades()/this.cantDeIntegrantes();
		 
	}	
	private int sumaDeEdades(){
		int totalEdades = 0 ;
		for(Persona persona: integrantes) {
			totalEdades += persona.edad();
		}
		return totalEdades;
	}
	private int cantDeIntegrantes(){
		return integrantes.size() ;
	}
	
	

}