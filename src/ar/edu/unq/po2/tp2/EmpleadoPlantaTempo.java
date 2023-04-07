package ar.edu.unq.po2.tp2;

import java.time.LocalDate;

public class EmpleadoPlantaTempo extends Empleado {
	
	private LocalDate fechaFinDesignacion;
	private int cantHorasExtras;
	
	public EmpleadoPlantaTempo(String nombre, String direccion, String estadoCivil, LocalDate fechaDeNac,
			double sueldoBasico, LocalDate fechaFinDesignacion, int cantHorasExtras) {
		super(nombre, direccion, estadoCivil, fechaDeNac, sueldoBasico);
		this.fechaFinDesignacion = fechaFinDesignacion;
		this.cantHorasExtras = cantHorasExtras;
	}

	
	public LocalDate getFechaFinDesignacion() {
		return fechaFinDesignacion;
	}
	
	public int getCantHorasExtras() {
		return cantHorasExtras;
	}
	
	public void setCantHorasExtras(int cantHorasExtras) {
		this.cantHorasExtras = cantHorasExtras;
	}	
	
	
	@Override
	protected double sueldoBruto() {
		
		return (this.getSueldoBasico() + this.sueldoPorHsExtras());
	}

	private double sueldoPorHsExtras() {
		
		return  40 * this.getCantHorasExtras();
	}

	@Override
	protected double retenciones() {
		
		return (this.retPorObraSoc() + this.retPorEdadAvanzada()+ this.retAporteJubilatorio()+ this.retPorHsExtras());
	}

	private double retPorEdadAvanzada() {
		if (this.edad() > 50)
		   { return 25; }
	   else
	  	   { return 0; }
	}

	@Override
	protected double retAporteJubilatorio() {
		return this.sueldoBruto() * 0.10 ;
	}

	private double retPorHsExtras() {		
		return 5 * this.getCantHorasExtras();
	}


	@Override
	protected ReciboDeHaberes pedirRecibo() {
		LocalDate emision = LocalDate.now();
		ReciboDeHabEmpTempo miReccibo = new ReciboDeHabEmpTempo(
												emision,
												this.getNombre(),
												this.getDireccion(),				
												this.sueldoBruto(),
												this.sueldoNeto(),												
												this.getSueldoBasico(),
												this.sueldoPorHsExtras(),										
												this.retPorObraSoc(),
												this.retPorEdadAvanzada(),
												this.retAporteJubilatorio(),
												this.retPorHsExtras()												
												);

		return miReccibo;
	}
	
}
