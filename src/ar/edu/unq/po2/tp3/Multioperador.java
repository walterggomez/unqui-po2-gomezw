package ar.edu.unq.po2.tp3;

import java.util.ArrayList;
import java.util.List;

public class Multioperador {
	// int[] arregloDeEnteros;
	// int[] arregloDeEnteros = new int[] {1,2,3};
	//int[] arregloDeEnteros = new int[] {1,-2,3};
	private List<Integer> arregloDeEnteros = new ArrayList<Integer>();

	public void addNumber(int numero) {
		arregloDeEnteros.add(numero);
	}
	
	public int suma() {
		int sum = 0;
		for (int entero:arregloDeEnteros ) {
			sum +=entero;
			}
		return sum;
	}
	
	public int resta() {
		int rest = 0;
		for (int entero:arregloDeEnteros ) {
			rest -=entero;
			}
		return rest;
	}
	public int multiplicacion() {
		int multi = 1;
		for (int entero:arregloDeEnteros ) {
			multi *=entero;
			}
		return multi;
	}	


}
