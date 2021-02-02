package ui;

import java.util.Scanner;

import model.Zoologico;

public class Main {
	
	private static Zoologico zoo; // es static por que el main tambien es static
	
	

	public static void main(String[] args) {
		
		zoo = new Zoologico();
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Bienvenido al Zoologico");
		System.out.println("[1]. Misma cantidad de animales en las jaulas " );
		System.out.println("[2]. 3 jaulas con mayor porcentaje de ocupacion");
		System.out.println("[3]. Ver jaula con la mayor canidad de animales de la misma especie");
		System.out.println("[4]. Verificar si es posible agregar un animal a una");
		int op = sc.nextInt();
		
		switch(op) {
		
		case 1:
			
			System.out.println(zoo.verificarJaula());
			
		break;
			
		case 2 :
			
			break;
		case 3 :
			
			break;
				
				
		}
		
		
		}
	

}
