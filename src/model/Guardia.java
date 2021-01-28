package model;

import java.util.ArrayList;

public class Guardia {

	private String nombre;
	private int anhosExperiencia;
	
	public Guardia(String nombre, int anhosExperiencia) {
		
		this.nombre = nombre;
		this.anhosExperiencia = anhosExperiencia;
		
	
		}
	
	public String darNombre() {
		
		return nombre;
	}
	
	public int darAnhosExperiencia() {
		
		return anhosExperiencia;
	}
	
	
	
	
}
