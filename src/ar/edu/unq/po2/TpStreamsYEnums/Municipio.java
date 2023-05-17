package ar.edu.unq.po2.TpStreamsYEnums;
import java.util.*;
import java.util.stream.Stream;

public class Municipio {
	
	List<ActividadSemanal> actividadesSemanales;
	
	public Municipio() {
		super();
		this.actividadesSemanales = new ArrayList<ActividadSemanal>();
	}
	
	public void agregarActividadSemanal(ActividadSemanal actividad) {
		actividadesSemanales.add(actividad);
	}
	
	public List<ActividadSemanal> getActividadesSemanales() {
		return actividadesSemanales;
	}

	// Todas las actividades de FUTBOL. Devuelve List<ActividadSemanal>
	public List<ActividadSemanal> soloFutbol(){
		return actividadesSemanales.stream().filter(a->a.getDeporte() == Deportes.Futbol).toList();
	}
	
	// Todas las actividades de una complejidad recibida como parámetro.
	//  Devuelve List<ActividadSemanal>
	public List<ActividadSemanal> actividadesDeXComplejidad(int complejidad){
		return actividadesSemanales.stream().filter(a->a.getDeporte().getComplejidad() == complejidad).toList();
	}
	
	// Cantidad de horas totales de actividadesSemanales que ofrece el Municipio
	public int cantidadHorasTotales(){
		return actividadesSemanales.stream().mapToInt(a->a.getDuracion()).sum();
	}
	
	// La actividadSemanal de menor costo para un Deporte de
	// interés recibido por parámetro
	public Optional<ActividadSemanal> actividadDeMenorCosto(Deportes deporte) {
		Stream<ActividadSemanal> actividadesDelDeporte = actividadesSemanales.stream().filter(a->a.getDeporte()== deporte);
		Comparator<ActividadSemanal> menorCosto = Comparator.comparing(ActividadSemanal::costoActividad);
		return actividadesDelDeporte.min(menorCosto) ;
	}
	
	/*
	public Map<Actividad, ActividadSemanal> mapDeActividadesMasEconomicas(){
		return ;
	}
	*/
	
	// imprime todas las actividades organizadas por el Municipio
	
	public void imprimirActividadesDelMunicipio() {
		actividadesSemanales.stream().forEach(a->System.out.println(a.toString()));
	}
	

}
