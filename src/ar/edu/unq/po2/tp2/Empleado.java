package ar.edu.unq.po2.tp2;

import java.time.LocalDate;
import java.time.Period;

public abstract class Empleado {
	// Attributes
	private String nombre;
	private String direccion;
	private String estadoCivil;
	private LocalDate    fechaDeNac;
	private double sueldoBasico;
	private LocalDate ahora = LocalDate.now();
	
	// Constructor
	public Empleado(String nombre, String direccion, String estadoCivil, LocalDate fechaDeNac, double sueldoBasico) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.estadoCivil = estadoCivil;
		this.fechaDeNac = fechaDeNac;
		this.sueldoBasico = sueldoBasico;
	}
	// Set && Get Compartment
	public String getNombre() {
		return nombre; 
	}
	public String getDireccion() {
		return direccion; 
	}	
	public LocalDate getFechaDeNac() {
		return fechaDeNac; 
	}
	
	public String getEstadoCivil() {
		return estadoCivil;
	}
	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	public double getSueldoBasico() {
		return sueldoBasico;
	}
	public void setSueldoBasico(Float sueldoBasico) {
		this.sueldoBasico = sueldoBasico;
	}
	// 		
	public int edad() {
		Period periodo = Period.between(fechaDeNac,ahora);		
		return periodo.getYears(); 
	}
	public double sueldoNeto() {
		return this.sueldoBruto() - this.retenciones();		
	}
    public double retPorObraSoc() {
		
		return this.sueldoBruto() * 0.10 ;
    }
    
	protected abstract double sueldoBruto();
	
	protected abstract double retenciones();
	
	protected abstract double retAporteJubilatorio();

}
