package ar.edu.unq.po2.tp3;

public class Cuadrado extends Rectangulo{

	public Cuadrado(Point esquinaInferiorIzq, int base) {
		super(esquinaInferiorIzq, base, base);
		
	}

	@Override
	public String orientacion() {
	 return "Es un cuadrado, no tiene orientacion";
	}
	

}
