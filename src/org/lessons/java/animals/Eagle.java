package org.lessons.java.animals;

import org.lessons.java.animals.abstr.Animal;
import org.lessons.java.animals.inter.Flying;
import org.lessons.java.animals.inter.Swimming;

public class Eagle extends Animal implements Flying, Swimming {

	public String makeNoise() {
		return "Ahhhhh!";
	}

	public String eat() {
		return "Carne";
	}

	public String fly() {
		return "Sono un aquila e sto volando!";
	}

	public String swim() {
		return "Sono un aquila e sto nuotando!";
	}
}
