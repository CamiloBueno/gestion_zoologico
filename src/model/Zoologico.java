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
	
	
	
}
