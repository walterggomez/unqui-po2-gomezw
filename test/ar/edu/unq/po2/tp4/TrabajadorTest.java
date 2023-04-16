package ar.edu.unq.po2.tp4;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TrabajadorTest {
	
	private List<Ingreso> ingresosPercibidos= new ArrayList<Ingreso>();
	private Trabajador tomas = new Trabajador(ingresosPercibidos);
	
	private Ingreso eneroSueldo= new Ingreso("Enero","Sueldo",25700.0);
	private Ingreso febreroSueldo= new Ingreso("Febrero","Sueldo",25700.0);
	private Ingreso marzoSueldo= new Ingreso("Marzo","Sueldo",25000.0);
	
	private Ingreso eneroExtras= new IngresoPorExtras("Enero","Horas Extras",16000.0,10);
	private Ingreso marzoExtras= new IngresoPorExtras("Marzo","Horas Extras",8000.0,5);
	

	
			@BeforeEach
	void setUp() throws Exception {
		tomas.agregarIngresos(eneroSueldo);
		tomas.agregarIngresos(eneroExtras);
		tomas.agregarIngresos(febreroSueldo);
		tomas.agregarIngresos(marzoSueldo);
		tomas.agregarIngresos(marzoExtras);
		
	}

	@Test
	void testSobreMontosTotales() {
		assertEquals(tomas.getTotalPercibido(),100400.0);
		assertEquals(tomas.getMontoImponible(),76400.0);
		assertEquals(tomas.getImpuestoAPagar(),1528.0);		
	}


}
