package org.lessons.java.animals;

import org.lessons.java.animals.abstr.Animal;
import org.lessons.java.animals.inter.Swimming;

public class Dog extends Animal implements Swimming {

	public String makeNoise() {
		return "Bau!";
	}

	public String eat() {
		return "Carne";
	}

	public String swim() {
		return "Sono un cane e sto nuotando!";
	}
}
