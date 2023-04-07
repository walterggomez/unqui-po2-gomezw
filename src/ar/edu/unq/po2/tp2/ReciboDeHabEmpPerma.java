package ar.edu.unq.po2.tp2;

import java.time.LocalDate;

public class ReciboDeHabEmpPerma  extends ReciboDeHaberes{
	private double asignacionPorHijo;
	private double asignacionPorConyuje;
	private double asignacionPorAntiguedad;
	private double retPorObraSocial;
	private double retPorHijo;
	private double retAporteJubilatorio;
	
	public ReciboDeHabEmpPerma(LocalDate fechaDeEmision, String nombreEmpleado, String direccionEmpleado,
			double sueldoBruto, double sueldoNeto, double sueldoBasico, double asignacionPorHijo,
			double asignacionPorConyuje, double asignacionPorAntiguedad, double retPorObraSocial, double retPorHijo,
			double retAporteJubilatorio) {
		
		super(fechaDeEmision, nombreEmpleado, direccionEmpleado, sueldoBruto, sueldoNeto,sueldoBasico);
		this.asignacionPorHijo = asignacionPorHijo;
		this.asignacionPorConyuje = asignacionPorConyuje;
		this.asignacionPorAntiguedad = asignacionPorAntiguedad;
		this.retPorObraSocial = retPorObraSocial;
		this.retPorHijo = retPorHijo;
		this.retAporteJubilatorio = retAporteJubilatorio;
	}
	
	// get 

	public double getAsignacionPorHijo() {
		return asignacionPorHijo;
	}

	public double getAsignacionPorConyuje() {
		return asignacionPorConyuje;
	}

	public double getAsignacionPorAntiguedad() {
		return asignacionPorAntiguedad;
	}

	public double getRetPorObraSocial() {
		return retPorObraSocial;
	}

	public double getRetPorHijo() {
		return retPorHijo;
	}

	public double getRetAporteJubilatorio() {
		return retAporteJubilatorio;
	}
	

	
	
	
	



	


}
