package ar.edu.unq.po2.tp2;

public class EmpleadoPlantaPerma extends Empleado {
	private int cantDeHijos;
	private int antiguedad;
	private String soltero;
	
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
	protected float sueldoBruto() {
		return (this.getSueldoBasico() + this.salarioFamiliar());
	}
	
		
	private Float salarioFamiliar() {
		return (float) (this.asignacionPorHijo() + this.asignacionPorConyuje() + this.asignacionPorAntiguedad());
	}
	
	private int asignacionPorConyuje() {
		if (this.getEstadoCivil() != this.soltero) // REVISAR !!!
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
