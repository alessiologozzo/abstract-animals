package org.lessons.java.animals;

import org.lessons.java.animals.abstr.Animal;
import org.lessons.java.animals.inter.Flying;

public class Sparrow extends Animal implements Flying {

	public String makeNoise() {
		return "Chip!";
	}

	public String eat() {
		return "Erba";
	}

	public String fly() {
		return "Sono un passerotto e sto volando!";
	}
}
