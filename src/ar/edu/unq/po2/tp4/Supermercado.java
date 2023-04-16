package ar.edu.unq.po2.tp4;

import java.util.*;

public class Supermercado {
	private String nombre ;
	private String direccion ;	
	private List<Producto> productos; // ver en empresa tp2 otra forma se hacerlo, se hace asi porque el test dado
			                          // no se puede modificar, y en test se instancia un supermercado sin productos
	
	public Supermercado(String nombre, String direccion) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.productos= new ArrayList<Producto>();
		
	}

	public String getNombre() {
		return nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public List<Producto> getProductos() {
		return productos;
	}
	
	public int getCantidadDeProductos() {
		return productos.size();
	}
	
	public void agregarProducto(Producto producto) {
		productos.add(producto);
	}

	public double getPrecioTotal() {
		double acumulador = 0 ;
		for(Producto producto : productos) {
			acumulador += producto.getPrecio();
		}
		return acumulador;
	}
	

}

