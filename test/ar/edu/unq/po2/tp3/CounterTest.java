package ar.edu.unq.po2.tp3;


import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;



public class CounterTest {
	private Counter counter;
	private Counter counterTwo;
	private Counter counterTree;

	
/**
 * Crea un escenario de test bÃ¡sico, que consiste en un contador
 * con 10 enteros
 *
 * @throws Exception
 */
	@BeforeEach
	public void setUp() throws Exception {
		//Se crea el contador
		counter = new Counter();
		counterTwo = new Counter();
		counterTree = new Counter();
	
		//Se agregan los numeros. Un solo par y nueve impares
		counter.addNumber(1);
		counter.addNumber(3);
		counter.addNumber(5);
		counter.addNumber(7);
		counter.addNumber(9);
		counter.addNumber(1);
		counter.addNumber(1);
		counter.addNumber(1);
		counter.addNumber(1);
		counter.addNumber(4);
		
		counterTwo.addNumber(2);
		counterTwo.addNumber(4);
		counterTwo.addNumber(8);
		counterTwo.addNumber(3);
		counterTwo.addNumber(9);
		counterTwo.addNumber(25);
		
		counterTree.addNumber(251);
		counterTree.addNumber(179);
		counterTree.addNumber(4769);
		counterTree.addNumber(753);
		

		}
/**
 * Verifica la cantidad de pares
*/

	@Test
	public void testEvenNumbers() {
	// Getting the even occurrences
		int impares  = counter.cantidadImpares();
		int pares  = counter.cantidadPares();
	
	// I check the amount is the expected one
		assertEquals(impares, 9);
		assertEquals(pares, 1);
		assertEquals(counterTwo.cantidadMultiplosDe(2), 3);
		assertEquals(counterTwo.cantidadMultiplosDe(5), 1);				
	
	}
	
	@Test
	public void numeroConMasDigitosPares() {
		assertEquals(counterTree.numeroConMasDigitosPares(),4769);	
	}
	
	@Test
	public void multiploSimultaneoEntre() {
		assertEquals(counter.multiploSimultaneoEntre(3,9),999);
		assertEquals(counter.multiploSimultaneoEntre(900,8),-1);
		
	}	
	
    @SuppressWarnings("null")
	public void testString() {
        String a = "abc";
        String s = a;
        String t = null;
       
        assertEquals(s.length(), 3);
        assertEquals(t.length(), 0);
        assertEquals(1 + a, "1abc");
        assertEquals(a.toUpperCase(), "ABC");
        assertEquals("Libertad".indexOf("r"), 4);
        assertEquals("Universidad".lastIndexOf('i'), 7);
        assertEquals("Quilmes".substring(2,4),"il");
        assertEquals((a.length() + a).startsWith("a"),false);
        assertEquals(s==a,true);
        assertTrue(s=a,true);
        assertTrue(a.substring(1,3).equals("bc"));

	
    }
}
