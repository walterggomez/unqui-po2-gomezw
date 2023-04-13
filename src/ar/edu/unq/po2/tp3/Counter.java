package ar.edu.unq.po2.tp3;

import java.util.ArrayList;
import java.util.List;



public class Counter {	
	
	private List<Integer> numeros = new ArrayList<Integer>();
	
	public void addNumber(int numero) {
		numeros.add(numero);
	}
	
	// 1. Contador de pares, impares y múltiplos
	
	public int cantidadImpares() {
		int cantImpares = 0;
		for(Integer numero: numeros) {
			if(numero % 2 != 0)
				cantImpares += 1 ;
		}
		return cantImpares; 
	}
	
	public int cantidadPares() {
		int cantPares = 0;
		for(Integer numero: numeros) {
			if(numero % 2 == 0)
				cantPares += 1 ;
		}
		return cantPares; 
	}
	
	public int cantidadMultiplosDe(int multiplo) {
		int cantMultipo = 0;
		for(Integer numero: numeros) {
			if(numero % multiplo == 0)
				cantMultipo += 1 ;
		}
		return cantMultipo; 
	}
	
	// 2. Desarmando números
	
	public int numeroConMasDigitosPares() {
		
		int elDeMasDigitosPares =  numeros.get(0);
		for (int num:numeros) {
			elDeMasDigitosPares = this.elQueTieneMayorNroDeParesEntre(elDeMasDigitosPares,num);
		}		
		return elDeMasDigitosPares;			
	}

	public int elQueTieneMayorNroDeParesEntre(int numer1, int numer2) {
		List<Integer> arryDeNumer1 = this.separadorDeNumeros(numer1);
		List<Integer> arryDeNumer2 = this.separadorDeNumeros(numer2);
		if (this.cantidadPares(arryDeNumer1) >= this.cantidadPares(arryDeNumer2)) {
			return numer1;
		}
		else {
			return numer2;
		}		
	}

	public List<Integer> separadorDeNumeros(int numerASeparar) {
		List<Integer> arryTemp = new ArrayList<Integer>();        
        while(numerASeparar > 0){
        	arryTemp.add(numerASeparar % 10);
        	numerASeparar = numerASeparar / 10;
        }        
        return arryTemp;
		
	}
	
	public int cantidadPares(List<Integer> arryDeNumer) { // esto seria sobrecargar el metodo cantidadPares()
		int cantPares = 0;
		for(Integer numero: arryDeNumer) {
			if(numero % 2 == 0)
				cantPares += 1 ;
		}
		return cantPares; 		
	}
	
	// 3. Múltiplos
	
	public int multiploSimultaneoEntre(int x, int y) {
		
        for (int i = 1000; i > 0; i--) {
            if (i % x == 0 && i % y == 0) {
                return i;
            }
        }
        return -1;
    }
	
	// 4. Examinar las expresiones
	
	
	
		
		
		
}// cierra la class
	



