package ar.edu.unq.po2.tp2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.junit.Before;
import org.junit.Test;


import java.util.ArrayList;
import java.util.List;

public class EmpresaTest {
	
	List<Empleado> empleados = new ArrayList<Empleado>();
	
	DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	LocalDate fechaNacLeandro = LocalDate.parse("29/07/1994",fmt);
	LocalDate fechaNacWalter = LocalDate.parse("26/05/1980",fmt);
	
	LocalDate fechaFinDesignacionWalter = LocalDate.parse("31/08/2022",fmt);
		
	EmpleadoPlantaPerma leandro = new EmpleadoPlantaPerma("Leandro","Bernal","Soltero",fechaNacLeandro,50000,0,10);
		
	EmpleadoPlantaTempo walter = new EmpleadoPlantaTempo("Walter","CA El Pato","Casado",fechaNacWalter,50000,fechaFinDesignacionWalter,10);
		
			
	@Before
	public void setUp() throws Exception {		
		
		// agrego elementos a la lista de empleados 
		empleados.add(leandro);
		empleados.add(walter);	
	}
	
	Empresa dataSoft = new Empresa("DataSoft","30-38440514-7", empleados);
	
	@Test
	public void totalSueldosBrutosEmpTest() {
		double totalSuBrEmp = dataSoft.totalSueldosBrutos();
        double totalSuBrEmpEsperado = 100900;		
        assertEquals(totalSuBrEmp,totalSuBrEmpEsperado);		
				
	}
	@Test
	public void totalRetencionesEmpTest() {
		double totalRetEmp = dataSoft.totalRetenciones();
        double totalRetEmpEsperado = 22755;		
        assertEquals(totalRetEmp,totalRetEmpEsperado);		
				
	}	
	
	


}
