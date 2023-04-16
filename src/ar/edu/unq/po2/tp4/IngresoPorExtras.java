package ar.edu.unq.po2.tp4;

public class IngresoPorExtras extends Ingreso{
	
	private int cantHsExtras;
	
	public IngresoPorExtras(String mesDePercepción, String concepto, Double montoPercibido, int cantHsExtras) {
		super(mesDePercepción, concepto, montoPercibido);
		this.cantHsExtras = cantHsExtras;
	}

	public int getCantHsExtras() {
		return cantHsExtras;
	}

	public void setCantHsExtras(int cantHsExtras) {
		this.cantHsExtras = cantHsExtras;
	}

}
