package ar.edu.unq.po2.tp4;

import java.util.*;
import java.util.stream.Collectors;

public class Trabajador {
	
	private List<Ingreso> ingresosPercibidos= new ArrayList<Ingreso>();
	
	public Trabajador(List<Ingreso> ingresosPercibidos) {
		super();
		this.ingresosPercibidos = ingresosPercibidos;
	}
	
	public void agregarIngresos(Ingreso ingreso) {
		this.ingresosPercibidos.add(ingreso);
	}

	public Double getTotalPercibido() {
		double totalPercibido = 0;
		for (Ingreso ingreso : ingresosPercibidos ) {
			totalPercibido += ingreso.getMontoPercibido();			
		}
		return totalPercibido;		
	}
	
	public Double getMontoImponible(){
		double totalImponible=0;
		for (Ingreso ingresoImp : this.ingresosImponibles() ) {
			totalImponible+= ingresoImp.getMontoPercibido();			
		}
	return totalImponible;		
	}
	
	private List<Ingreso> ingresosImponibles(){
		return ingresosPercibidos.stream().filter(concepto ->concepto.getConcepto()=="Sueldo").collect(Collectors.toList());
	}
	
	public Double getImpuestoAPagar() {
		return this.getMontoImponible()*0.02;
		
	}	

	

}
