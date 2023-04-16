package ar.edu.unq.po2.tp3;

public class Rectangulo {
	
	private Point esquinaInferiorIzq ;
	private Point esquinaInferiorDer ;
	private Point esquinaSuperiorrIzq ;
	private Point esquinaSuperiorDer ;
	
	private int base;
	private int altura;
	
	public Rectangulo(Point esquinaInferiorIzq, int base, int altura) {
		super();
		this.esquinaInferiorIzq = esquinaInferiorIzq;
		this.esquinaInferiorDer = new Point(esquinaInferiorIzq.getX() + base , esquinaInferiorIzq.getY());
		this.esquinaSuperiorrIzq = new Point(esquinaInferiorIzq.getX() , esquinaInferiorIzq.getY() + altura);
		this.esquinaSuperiorDer = new Point(esquinaInferiorIzq.getX() + base , esquinaInferiorIzq.getY() + altura);
		this.base = base;
		this.altura = altura;
	}
	
	public int area() {
		return this.base * this.altura;
	}
	
	public int perimetro() {
		return 2 * (this.base + this.altura) ;
	}
	
	public String orientacion() {
		if(base > altura) {
			return "Horizontal";
		}
		else {
			return "Vertical";
		}
	}

	public Point getEsquinaInferiorIzq() {
		return esquinaInferiorIzq;
	}
	public Point getEsquinaInferiorDer() {
		return esquinaInferiorDer;
	}

	public Point getEsquinaSuperiorrIzq() {
		return esquinaSuperiorrIzq;
	}

	public Point getEsquinaSuperiorDer() {
		return esquinaSuperiorDer;
	}

	public int getBase() {
		return base;
	}

	public int getAltura() {
		return altura;
	}
	
	


}
