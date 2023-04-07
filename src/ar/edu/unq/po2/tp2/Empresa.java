package ar.edu.unq.po2.tp2;

import java.util.*;

public class Empresa {
	
	private String nombre;
	private String cuit;
	private List<Empleado> empleados = new ArrayList<Empleado>();
	private List<ReciboDeHaberes> recibos = new ArrayList<ReciboDeHaberes>();
	
	
	public Empresa(String nombre, String cuit, List<Empleado> empleados) {
		
		super();
		this.nombre = nombre;
		this.cuit = cuit;
		this.empleados = empleados;
	}
	public String getNombre() {
		return nombre;
	}
	public String getCuit() {
		return cuit;
	}

	public double totalSueldosBrutos() {
		int montoBruto = 0;
		for (Empleado empleado : empleados ) {
			montoBruto += empleado.sueldoBruto();
		}		
		return montoBruto; 
	}
	public double totalRetenciones() { 
		
		int montoRete = 0;
		for (Empleado empleado : empleados ) {
			montoRete += empleado.retenciones();
		}	 
		return montoRete;
	}
	public double totalSueldosNetos() {
		return this.totalSueldosBrutos() - this.totalRetenciones() ; 
	}
	public void liquidacionDeHaberes() {
		for (Empleado empleado : empleados ) {
			recibos.add(empleado.pedirRecibo());
		}		
	}
	


}
