package ar.edu.unq.po2.tp2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


import org.junit.jupiter.api.Test;

// assertTrue, assertEquals
// @BeforeEach , @AfterEach

public class EmpleadoTest {
	DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	LocalDate fechaNacLeandro = LocalDate.parse("29/07/1994",fmt);
	LocalDate fechaNacWalter = LocalDate.parse("26/05/1980",fmt);
	LocalDate fechaFinDesignacionWalter = LocalDate.parse("31/08/2022",fmt);
	
	
	
	EmpleadoPlantaPerma empleadoP = new EmpleadoPlantaPerma("Leandro", "Bernal", "Soltero", fechaNacLeandro , 50000, 0, 10 );
	EmpleadoPlantaTempo empleadoT = new EmpleadoPlantaTempo("Walter", "Bernal", "Casado", fechaNacWalter , 50000, fechaFinDesignacionWalter , 10 );
	
	@Test
	public void nombreDeEmpleado() {
		assertEquals("Leandro",empleadoP.getNombre());
		assertEquals("Walter",empleadoT.getNombre());	
	}
	
	@Test
	public void edadDeEmpleado() {
		int edadEmpP = empleadoP.edad();
		int edadEmpT = empleadoT.edad();
		assertEquals(edadEmpP,28);
		assertEquals(edadEmpT,42);	
	}
	
		
	@Test
	public void calcularSueldoBrutoTest() {
		
		double sueldobrutoP = empleadoP.sueldoBruto();
		double sueldoEsperadoP = 50500;
		
		double sueldobrutoT = empleadoT.sueldoBruto();
		double sueldoEsperadoT = 50400;
		
		assertEquals(sueldobrutoP,sueldoEsperadoP);
		assertEquals(sueldobrutoT,sueldoEsperadoT);		
	}
	
	@Test
	public void calcularRetencionesTest() {
		
		double retencionesP = empleadoP.retenciones();
		double retencionesEsperadaP = 12625;
		
		double retencionesT = empleadoT.retenciones();
		double retencionesEsperadaT = 10130;
		
		assertEquals(retencionesP,retencionesEsperadaP);
		assertEquals(retencionesT,retencionesEsperadaT);		
	}
	@Test
	public void calcularSueldoNeto() {
		
		double netoP = empleadoP.sueldoNeto();
		double netoEsperadaP = 37875;
		
		double netoT = empleadoT.sueldoNeto();
		double netoEsperadaT = 40270;
		
		assertEquals(netoP,netoEsperadaP);
		assertEquals(netoT,netoEsperadaT);
	}

}
