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
	
	/*
	 * 	String a = "abc";
		String s = a;
		String t
		Indique que valores retornan las siguientes expresiones o, si dan error, por qué se producen:	 
	 */
	
	// se hacen test para ver el resultado
	// ● s.length(); calcula el largo del String es este caso es 3
	// ● t.length(); inicialmente Java avisa que t no esta inicalizada, Java la iniciliza con Null
	//               despues Java solicita la colocacion de  @SuppressWarnings("null")
	//               por lo tanto la declaracion t esta mal
	// ● 1 + a; para saber que es lo que realiza, es decir si concatena el 1 con a , o bien si suma 
	//          1 con el valor Asccii de a (algo parecido a C++). lo que se hizo fue hacer una clase Main
	//          y ejecutar la aplicacion Java
	//          el resultado es que concatena el 1 con a ---> 1abc
	// ● a.toUpperCase(); se realiza lo mismo que para el punto anterior, resultado el String pasa a estar en Mayuscula
	// ● "Libertad".indexOf("r"); se realiza lo mismo que para 1+a, pero el resultado es la primera posicion 
	//                            donde aparece la r
	// ● "Universidad".lastIndexOf('i'); aca el resultado es la ultima posicion donde aparece la i
	// ● "Quilmes".substring(2,4);        Q u i l m e s , deberia devolver  il
	//							   index  0 1 2 3 4 5 6	 es en este sentido [ )
	// ● (a.length() + a).startsWith("a"); aca realiza una consulta espera como resultado un booleano
	//                                     en este caso la consulta es si comienza con a "3abc"  
	// ● s == a; esto compara dos String en este caso dando True el resultado, pero escrito con == lo toma como un error
	//           si usa el assertTrue , ahora para assertEquals no pasa nada
	// ● a.substring(1,3).equals("bc");       a b c como en [ ) devuelve "bc" se emplea assertTrue, como el 3 no esta
	//                                              incluido no pasa nada es un dato que no interesa por eso no rompe
	//                                              si pedian entre (1,4) ahi si rompe
	// 								   index  0 1 2 	


	//			 5. Tipos primitivos


	
	




	
		
		
		
}// cierra la class
	



