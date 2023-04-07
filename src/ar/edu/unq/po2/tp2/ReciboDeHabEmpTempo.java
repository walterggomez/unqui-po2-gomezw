package ar.edu.unq.po2.tp2;

import java.time.LocalDate;


public class ReciboDeHabEmpTempo extends ReciboDeHaberes{
	
	private double sueldoPorHsExtras;
	private double retPorObraSocial;
	private double retPorEdadAvanzada;
	private double retAporteJubilatorio;
	private double retPorHsExtras;	
	
	
	public ReciboDeHabEmpTempo(LocalDate fechaDeEmision, String nombreEmpleado, String direccionEmpleado,
			double sueldoBruto, double sueldoNeto, double sueldoBasico, double sueldoPorHsExtras,
			double retPorObraSocial, double retPorEdadAvanzada, double retAporteJubilatorio, double retPorHsExtras) {
		
		super(fechaDeEmision, nombreEmpleado, direccionEmpleado, sueldoBruto, sueldoNeto,sueldoBasico);
		this.sueldoPorHsExtras = sueldoPorHsExtras;
		this.retPorObraSocial = retPorObraSocial;
		this.retPorEdadAvanzada = retPorEdadAvanzada;
		this.retAporteJubilatorio = retAporteJubilatorio;
		this.retPorHsExtras = retPorHsExtras;
	}


	public double getSueldoPorHsExtras() {
		return sueldoPorHsExtras;
	}


	public double getRetPorObraSocial() {
		return retPorObraSocial;
	}


	public double getRetPorEdadAvanzada() {
		return retPorEdadAvanzada;
	}


	public double getRetAporteJubilatorio() {
		return retAporteJubilatorio;
	}


	public double getRetPorHsExtras() {
		return retPorHsExtras;
	}

	
	
	
	
	



}
