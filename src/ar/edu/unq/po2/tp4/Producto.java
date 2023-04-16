package ar.edu.unq.po2.tp4;

public class Producto {
	
	private String nombre;
	protected double precio;
	private boolean esPrecioCuidado;
	
	public Producto(String nombre, double precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.esPrecioCuidado = false;
	}

	public Producto(String nombre, double precio, boolean esPrecioCuidado) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.esPrecioCuidado = esPrecioCuidado;
	}

	public String getNombre() {
		return nombre;
	}

	public double getPrecio() {
		return precio;
	}	
	
	 public boolean esPrecioCuidado(){
		 return esPrecioCuidado;
	 }

	public void aumentarPrecio(double d) {
		precio += d;
		
	}
	 
	 
	 
	 
}
