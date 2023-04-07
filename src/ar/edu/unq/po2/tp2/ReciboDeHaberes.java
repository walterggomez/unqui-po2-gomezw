package ar.edu.unq.po2.tp2;

import java.time.LocalDate;

public class ReciboDeHaberes {
	
	private LocalDate fechaDeEmision;
	private String nombreEmpleado;
	private String direccionEmpleado;	
	private double sueldoBruto;
	private double sueldoNeto;
	private double sueldoBasico;
	
	public ReciboDeHaberes(LocalDate fechaDeEmision, String nombreEmpleado, String direccionEmpleado, double sueldoBruto,
			double sueldoNeto,double sueldoBasico) {
		super();
		this.fechaDeEmision = fechaDeEmision;
		this.nombreEmpleado = nombreEmpleado;
		this.direccionEmpleado = direccionEmpleado;
		this.sueldoBruto = sueldoBruto;
		this.sueldoNeto = sueldoNeto;
		this.sueldoBasico = sueldoBasico; 
	}
	// get
	public LocalDate getFechaDeEmision() {
		return fechaDeEmision;
	}
	public String getNombreEmpleado() {
		return nombreEmpleado;
	}
	public String getDireccionEmpleado() {
		return direccionEmpleado;
	}	
	public double getSueldoBruto() {
		return sueldoBruto;
	}
	public double getSueldoNeto() {
		return sueldoNeto;
	}	
	public double getSueldoBasico() {
		return sueldoBasico;
	}
	

	
	

}
