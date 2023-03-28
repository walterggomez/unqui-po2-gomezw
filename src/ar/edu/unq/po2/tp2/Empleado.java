package ar.edu.unq.po2.tp2;

import java.util.Date;

public class Empleado {
	private String nombre;
	private String direccion;
	private String estadoCivil;
	private Date fechaDeNac;
	private Float sueldoBasico;
	
	public String getEstadoCivil() {
		return estadoCivil;
	}
	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	public Float getSueldoBasico() {
		return sueldoBasico;
	}
	public void setSueldoBasico(Float sueldoBasico) {
		this.sueldoBasico = sueldoBasico;
	}
	public int edad() {
		return 0; // ver como quedarme de la fecha actual solo el año y lo mismo con la fecha de nac
		
	}
	public float sueldoBruto() {
		return this.sueldoBasico; //+ lo que sobre escriben las dos clases 
	}
	public abstract float retenciones() {
		
	}
	public float sueldoNeto() {
		return this.sueldoBruto() - this.retenciones();
		
	}
	
	
	
	

}
