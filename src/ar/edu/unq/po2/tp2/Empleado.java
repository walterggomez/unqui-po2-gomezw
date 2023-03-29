package ar.edu.unq.po2.tp2;

import java.util.Date;

public abstract class Empleado {
	
	private String nombre;
	private String direccion;
	private String estadoCivil;
	private Date   fechaDeNac;
	private Float  sueldoBasico;	

	
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
	public double sueldoNeto() {
		return this.sueldoBruto() - this.retenciones();		
	}
    public double retPorObraSoc() {
		
		return this.sueldoBruto() * 0.10 ;
    }
    
	protected abstract float sueldoBruto();
	
	protected abstract double retenciones();
	
	protected abstract double retAporteJubilatorio();

}
