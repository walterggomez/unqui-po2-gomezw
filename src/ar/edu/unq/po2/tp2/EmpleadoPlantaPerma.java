package ar.edu.unq.po2.tp2;

import java.time.LocalDate;

public class EmpleadoPlantaPerma extends Empleado {
	
	// Attributes
	private int cantDeHijos;
	private int antiguedad;
	
	
	// Constructor
	public EmpleadoPlantaPerma(String nombre, String direccion, String estadoCivil, LocalDate fechaDeNac,
			double sueldoBasico, int cantDeHijos, int antiguedad) {
		super(nombre, direccion, estadoCivil, fechaDeNac, sueldoBasico);
		this.cantDeHijos = cantDeHijos;
		this.antiguedad = antiguedad;
	}
	
	public int getCantDeHijos() {
		return cantDeHijos;
	}
	public void setCantDeHijos(int cantDeHijos) {
		this.cantDeHijos = cantDeHijos;
	}
	public int getAntiguedad() {
		return antiguedad;
	}
	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}

	@Override
	protected double sueldoBruto() {
		return (this.getSueldoBasico() + this.salarioFamiliar());
	}
	
		
	private double salarioFamiliar() {
		return this.asignacionPorHijo() + this.asignacionPorConyuje() + this.asignacionPorAntiguedad();
	}
	
	private int asignacionPorConyuje() {
		if (this.getEstadoCivil() !="Soltero")
			{ return 100; }
		else
		  	{ return 0; }				
	}
	private int asignacionPorHijo() {
		return  (150 * this.getCantDeHijos());
	}
	private int asignacionPorAntiguedad() {
		return (50 * this.getAntiguedad());
	}
	
		
	@Override
	protected double retenciones() {
		return (this.retPorObraSoc() + this.retPorHijo()+ this.retAporteJubilatorio());
	}
	
	@Override
	protected double retAporteJubilatorio() {
		return this.sueldoBruto() * 0.15 ;
	}
	
	private int retPorHijo() {
		return 20 * this.getCantDeHijos();
	}

	
}
