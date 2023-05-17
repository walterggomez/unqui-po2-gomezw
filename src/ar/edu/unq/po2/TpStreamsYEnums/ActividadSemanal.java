package ar.edu.unq.po2.TpStreamsYEnums;

public class ActividadSemanal {
	
	private DiaDeLaSemana diaDeLaSemana;
	private int horaInicio;
	private int duracion;
	private Deportes deporte;
	
	public ActividadSemanal(DiaDeLaSemana diaDeLaSemana, int horaInicio, int duracion, Deportes deporte) {
		super();
		this.diaDeLaSemana = diaDeLaSemana;
		this.horaInicio = horaInicio;
		this.duracion = duracion;
		this.deporte = deporte;
	}

	public DiaDeLaSemana getDiaDeLaSemana() {
		return diaDeLaSemana;
	}

	public int getHoraInicio() {
		return horaInicio;
	}

	public int getDuracion() {
		return duracion;
	}

	public Deportes getDeporte() {
		return deporte;
	}

	public int costoActividad() {
		return this.getDiaDeLaSemana().costo() + (deporte.getComplejidad() * 200) ;
	}
	
	public String toString() {
		return "Deporte: " + this.getDeporte() + ". " + "Dia: " + this.getDiaDeLaSemana() + " A LAS " + this.getHoraInicio() 
						   + ". " + "Duracion: " + this.getDuracion() + "hora(s)."; 
	}
	
	//  Sobreescribir el método equals para comparar
	
	  @Override
	  public boolean equals(Object obj) {
	    if (obj == null) return false;
	    if (obj == this) return true;
	    if (!(obj instanceof ActividadSemanal)) return false;
	    ActividadSemanal otro = (ActividadSemanal) obj;
	    return this.deporte.equals(otro.deporte);
	  }
}
