package com.misiontic.main;

public class Main {

	public static void main(String[] args) {
		Animal perrito = new Animal();
		perrito.hungry = 50;
		perrito.happiness = 50;
		
		Animal gatico = new Animal();
		gatico.hungry = 70;
		gatico.happiness = 70;
		
		System.out.println("hambre perrito: " + perrito.hungry);
		System.out.println("hambre gatico: " + gatico.hungry);
		
		System.out.println("felicidad perrito: " + perrito.happiness);
		System.out.println("felicidad gatico: " + gatico.happiness);

	}

}
