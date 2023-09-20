package org.lessons.java.animals;

import org.lessons.java.animals.abstr.Animal;
import org.lessons.java.animals.inter.Swimming;

public class Dolphin extends Animal implements Swimming {

	public String makeNoise() {
		return "Fiuuuu!";
	}

	public String eat() {
		return "Pesce";
	}

	public String swim() {
		return "Sono un delfino e sto nuotando!";
	}
}
