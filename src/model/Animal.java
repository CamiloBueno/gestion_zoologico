package model;

public class Animal {

	public static String HERBIVORO = "hervbivoro";
	public static String CARNIVORO = "carnivoro";
	
	private String nombre;
	private String especie;
	private String tipo;
	
	public Animal(String nombre,String especie, String tipo) {
		
		this.nombre = nombre;
		this.especie = especie;
		this.tipo = tipo;
		
	}
	
	public String darNombre() {
		
		return nombre;
	}
	
	public void cambiarNombre(String nombre) {
		
		this.nombre = nombre;
	}
	
	public String darEspecie() {
		
		return especie;
	}
	
	public void cambiarEspecie(String especie) {
		
		this.especie = especie;
	}
	
	public String darTipo() {
		
		return tipo;
	}
	
	public void cambiarTipo(String tipo) {
		
		this.tipo = tipo;
	}
	
	
}
