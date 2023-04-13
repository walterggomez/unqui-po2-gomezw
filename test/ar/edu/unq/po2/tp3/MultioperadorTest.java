package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MultioperadorTest {
	private Multioperador multio;
	
	@Test
	public void multioperador() {
		multio = new Multioperador();
		// para  {1,2,3}
		/*assertEquals(multio.suma(),6);
		assertEquals(multio.resta(),-6);
		assertEquals(multio.multiplicacion(),6);
		*/
		// para {1,-2,3}
		assertEquals(multio.suma(),2);
		assertEquals(multio.resta(),-2);
		assertEquals(multio.multiplicacion(),-6);
		
	}

}
