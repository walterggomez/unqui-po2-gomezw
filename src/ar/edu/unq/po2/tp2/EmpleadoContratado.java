package ar.edu.unq.po2.tp2;

import java.time.LocalDate;

public class EmpleadoContratado extends Empleado {
	
	private String numeroDeContarto;
	private String medioDePago;
	
	public EmpleadoContratado(String nombre, String direccion, String estadoCivil, LocalDate fechaDeNac,
			double sueldoBasico, String numeroDeContarto, String medioDePago) {
		super(nombre, direccion, estadoCivil, fechaDeNac, sueldoBasico);
		this.setNumeroDeContarto(numeroDeContarto);
		this.setMedioDePago(medioDePago);
	}

	
	public String getNumeroDeContarto() {
		return numeroDeContarto;
	}
	public void setNumeroDeContarto(String numeroDeContarto) {
		this.numeroDeContarto = numeroDeContarto;
	}
	public String getMedioDePago() {
		return medioDePago;
	}
	public void setMedioDePago(String medioDePago) {
		this.medioDePago = medioDePago;
	}
	
	@Override
	protected double sueldoBruto() {
		return (this.getSueldoBasico() );
	}
	@Override
	protected double retenciones() {
		
		return (this.gastosAdministrativos());
	}
	private double gastosAdministrativos() {
		return 50;
	}
	
	@Override
	protected double retAporteJubilatorio() {		
		return 0;
	}	
	
	
	@Override
	protected ReciboDeHaberes pedirRecibo() {
		LocalDate emision = LocalDate.now();
		ReciboEmpContratado miReccibo = new ReciboEmpContratado(
													emision,
													this.getNombre(),
													this.getDireccion(),
													this.sueldoBruto(),
													this.sueldoNeto(),
													this.getSueldoBasico(),
													this.gastosAdministrativos()
													);

		return miReccibo;
	}
	


}
