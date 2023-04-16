package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MultioperadorTest {
	private Multioperador multio;
	
	@BeforeEach
	public void setUp() throws Exception {
		multio = new Multioperador();
		
		multio.addNumber(1);
		multio.addNumber(3);
		multio.addNumber(5);
		multio.addNumber(7);
		
		
	}
	@Test
	public void multioperador() {	
	
		assertEquals(multio.suma(),16);
		assertEquals(multio.resta(),-16);
		assertEquals(multio.multiplicacion(),105);
		
	}

}
