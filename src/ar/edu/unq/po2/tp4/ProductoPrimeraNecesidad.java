package ar.edu.unq.po2.tp4;

public class ProductoPrimeraNecesidad extends Producto{

	private double descuento;


	public ProductoPrimeraNecesidad(String nombre, double precio, boolean esPrecioCuidado,double descuento ) {
		super(nombre, precio, esPrecioCuidado);
		this.descuento = descuento;
		
	}
	@Override
	public double getPrecio(){
		return precio * (1 - descuento);
	}


/*  Este es el codigo para la primera parte donde el descuento no es variable
 * 
	public ProductoPrimeraNecesidad(String nombre, double precio, boolean esPrecioCuidado) {
		super(nombre, precio, esPrecioCuidado);
		
	}
	
	@Override
	public double getPrecio() {
		return this.precio * 0.9;
		}
		
*/
	
}
