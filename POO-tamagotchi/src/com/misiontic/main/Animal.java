package com.misiontic.main;

import java.awt.Color;

public class Animal {
	
	float weight;
	static int happiness;//va de 0 a 100, 0 es triste; 100 es feliz.
	int health;//va de 0 a 100, 0 muerto, 100 muy saludable.
	int hungry;//va de 0 a 100, 0 sin hambre y 100 es famelico.
	int sleep;//va de 0 a 100, 0 es muy despierto y 100 es muy somnoliento
	boolean isSleep;
	
	
	//Tengo que dar una respuesta cuando termine de comer?
	//Yo quiero decir si ya termine de comer
	private void eat(Food food) {
		if(hungry <= 5) {
			 hungry = 0;
			System.out.println("Estoy demasiado lleno, me voy a enfermar de tanto comer");
			health = health -2;
			}else {
				hungry = hungry +5;
			}
		}
		
	private void sleep() {
		
	}
	private void makeExercise() {
		
	}
	private void play() {
		
	}

	private void goToVeterinary() {
		
	}
	
	private void awake() {
		
	}


}


