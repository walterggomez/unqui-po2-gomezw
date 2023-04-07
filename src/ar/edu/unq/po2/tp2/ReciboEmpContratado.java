package ar.edu.unq.po2.tp2;

import java.time.LocalDate;

public class ReciboEmpContratado extends ReciboDeHaberes{
	
	private double gastosAdministrativos;
	
	public ReciboEmpContratado(LocalDate fechaDeEmision, String nombreEmpleado, String direccionEmpleado,
			double sueldoBruto, double sueldoNeto, double sueldoBasico, double gastosAdministrativos) {
		
		super(fechaDeEmision, nombreEmpleado, direccionEmpleado, sueldoBruto, sueldoNeto,sueldoBasico);
		this.gastosAdministrativos = gastosAdministrativos;
	}

	public double getGastosAdministrativos() {
		return gastosAdministrativos;
	}

	
	

}
