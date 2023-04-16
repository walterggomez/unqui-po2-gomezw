package ar.edu.unq.po2.tp4;

public class Ingreso {
	
	private String mesDePercepción;
	private String concepto;
	private Double montoPercibido;
	
	public Ingreso(String mesDePercepción, String concepto, Double montoPercibido) {
		super();
		this.mesDePercepción = mesDePercepción;
		this.concepto = concepto;
		this.montoPercibido = montoPercibido;
	}

	public String getMesDePercepción() {
		return mesDePercepción;
	}

	public String getConcepto() {
		return concepto;
	}

	public Double getMontoPercibido() {
		return montoPercibido;
	}	

}
