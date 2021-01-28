package ui;

import java.util.Scanner;

import model.Zoologico;

public class Main {
	
	private static Zoologico zoo; // es static por que el main tambien es static
	
	

	public static void main(String[] args) {
		
		zoo = new Zoologico();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("[1]. Bienvenido al Zoologico");
		System.out.println("[2]. " );
		System.out.println("[3]. remover contactos");
		System.out.println("[4]. salir");
		
		}
	

}
