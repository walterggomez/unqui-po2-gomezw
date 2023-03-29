package ar.edu.unq.po2.tp2;

import java.util.Date;

public class EmpleadoPlantaTempo extends Empleado {
	
	private Date fechaFinDesignacion;
	private int cantHorasExtras;
	
	public Date getFechaFinDesignacion() {
		return fechaFinDesignacion;
	}
	
	public int getCantHorasExtras() {
		return cantHorasExtras;
	}
	
	public void setCantHorasExtras(int cantHorasExtras) {
		this.cantHorasExtras = cantHorasExtras;
	}	
	
	
	@Override
	protected float sueldoBruto() {
		
		return (this.getSueldoBasico() + this.sueldoPorHsExtras());
	}

	private Float sueldoPorHsExtras() {
		
		return ((float) 40 * this.getCantHorasExtras());
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
	
}
