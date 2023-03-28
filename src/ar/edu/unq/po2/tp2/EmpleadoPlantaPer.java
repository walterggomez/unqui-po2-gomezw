package ar.edu.unq.po2.tp2;

public class EmpleadoPlantaPer extends Empleado{
	private int cantDeHijos;
	private int antiguedad;
	
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
	@Overrider
	public float sueldoBruto() {
		
	}

}
