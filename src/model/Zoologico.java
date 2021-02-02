package model;

public class Zoologico {
	
	public static final int CANT_JAULAS= 10;
	private Jaula[] jaulas;
	
	
	
	public Zoologico() {
		jaulas = new Jaula[CANT_JAULAS]; //creo la relacion en el constructor
		
	}

	public Jaula[] darJaulas(){
		
		return jaulas;
		
	}
	
	public String verificarJaula() { //Informar si existen jaulas ocupadas con la misma cantidad de animales
		
		String mensaje= "";
		
		for(int i= 0; i<jaulas.length;i++) {
			
			if(jaulas[i] != null) {
				
				mensaje = "la jaula "+(i+1)+" esta ocupada";
				
				if(jaulas[i].darCapacidadJaula() == jaulas[i].darAnimales().size()) {
					
					mensaje += "y tienen la misma cantidad de animales";
					
				} else {
					
					mensaje += "pero no tienen la misma cantidad de animales";
					
				}
				
					
			}else {
				
				mensaje = "las "+(i+1)+ " jaulas estan desocupadas";
				
			}
			
			
		}
		
		return mensaje;
		
		
		
	}
	
	
	
}
