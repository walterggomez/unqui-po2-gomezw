package ar.edu.unq.po2.TpStreamsYEnums;

public enum ColorLesiones {
	
	Rojo("Lesion recien provocada",2), 
	Gris("Lesion avanzada",3),
	Amarillo("Lesion curandose",2),
	Miel("Lesion casi curada",1) ;
	
	String descripcion;
	int nivelDeRiesgo;
	
	private ColorLesiones(String descripcion, int nivelDeRiesgo) {
		this.descripcion = descripcion;
		this.nivelDeRiesgo = nivelDeRiesgo;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	
	public int getNivelDeRiesgo() {
		return nivelDeRiesgo;
	}
	
	public ColorLesiones getSiguiente() {
		int indiceSiguiente = (this.ordinal() + 1) % ColorLesiones.values().length;
		return ColorLesiones.values()[indiceSiguiente];
	}

}
