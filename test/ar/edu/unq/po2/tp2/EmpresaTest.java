package ar.edu.unq.po2.tp2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class EmpresaTest {
	DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	LocalDate fechaNacLeandro = LocalDate.parse("29/07/1994",fmt);
	LocalDate fechaNacWalter = LocalDate.parse("26/05/1980",fmt);
	LocalDate fechaFinDesignacionWalter = LocalDate.parse("31/08/2022",fmt);
	
	EmpleadoPlantaPerma leandro = new EmpleadoPlantaPerma("Leandro", "Bernal", "Soltero", fechaNacLeandro , 50000, 0, 10 );
	EmpleadoPlantaTempo walter = new EmpleadoPlantaTempo("Walter", "Bernal", "Casado", fechaNacWalter , 50000, fechaFinDesignacionWalter , 10 );
	
	//List<Empleado> empleados = new ArrayList<Empleado>();
	//empleados.
	//empleados.add(walter);
	
	//Empresa Datasoft = Empresa ("Datasoft","30-28150516-6",<);

}
