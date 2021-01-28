package model;

import java.util.ArrayList;
import java.util.List;

public class Jaula {
	public static String NORTE = "Norte";
	public static String SUR = "Sur";
	public static String GRANDE= "Grande";
	public static String MEDIANA = "Mediana";
	public static String PEQUEÑA = "Pequeña";
	public static int CAPACIDAD_GRANDE = 10;
	public static int CAPACIDAD_MEDIANA = 6;
	public static int CAPACIDAD_PEQUEÑA = 2;
	
	private List<Animal> animales;
	private Guardia guardia;
	
	private String sector;
	private String tamanio;
	
	public Jaula( String sector, String tamanio) { //el constructor es del tipo nombre de la clase y tipo public
		
		this.sector = sector; // el "this" es un gran diferenciador entre el atributo y el parametro
		
		this.tamanio = tamanio;
		
		animales = new ArrayList();
		
		//guardia = new Guardia();
	}
	
	public String darSector() {
		
		return sector;
	}
	
	public Guardia darGuardia() {// retornar si el guardia existe o no
		
		Guardia temp = null;
		
		if(guardia != null) { //verificamos si el guardia existe
			
			temp= guardia;
		}
		return temp;
	}
	
	public String darTamanio(String tamanio) {
		
		return tamanio;
	}
	
	public ArrayList darAnimales() {
		
		return (ArrayList) animales;//asi se pone el tipo(se castea el tipo)
	}
	 public int darCapacidadJaula() {
		 int capacidad = 0;
		 if(GRANDE.equals("Grande")) {//cuando son String se utiliza equals y cuando es int/double se utiliza ==.
			 capacidad = CAPACIDAD_GRANDE;
			 
		 }else if(MEDIANA.equals("Mediana")) {
			 capacidad = CAPACIDAD_MEDIANA;
			 
		 }else if(PEQUEÑA.equals("Pequeña")) {
			 capacidad = CAPACIDAD_PEQUEÑA;
			 
		 }
		 return capacidad;
		 
	 }
}
