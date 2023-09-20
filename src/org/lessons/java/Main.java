package org.lessons.java;

import java.util.Scanner;

import org.lessons.java.animals.Dog;
import org.lessons.java.animals.Dolphin;
import org.lessons.java.animals.Eagle;
import org.lessons.java.animals.Sparrow;
import org.lessons.java.animals.abstr.Animal;
import org.lessons.java.animals.inter.Flying;
import org.lessons.java.animals.inter.Swimming;
import org.lessons.java.utils.InputInterface;

public class Main {

	public static void makeItSwim(Swimming swimmingAnimal) {
		System.out.println(swimmingAnimal.swim());
	}

	public static void makeItFly(Flying flyingAnimal) {
		System.out.println(flyingAnimal.fly());
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int dim = InputInterface.getInt(scanner, 1, 100, "Quanti animali vuoi inserire?");
		Animal[] animals = new Animal[dim];

		for (int i = 0; i < animals.length; i++) {
			int animalType = InputInterface.getInt(scanner, 1, 4,
					"N°" + (i + 1) + " Che animale vuoi inserire?\n1) Cane\n2) Aquila\n3) Delfino\n4) Passerotto");

			switch (animalType) {

			case 1:
				animals[i] = new Dog();
				break;

			case 2:
				animals[i] = new Eagle();
				break;

			case 3:
				animals[i] = new Dolphin();
				break;

			case 4:
				animals[i] = new Sparrow();
				break;
			}
		}

		for (int i = 0; i < animals.length; i++) {
			System.out.println("\nAnimale N°" + (i + 1) + "\n" + animals[i].toString());

			if (animals[i] instanceof Swimming)
				makeItSwim((Swimming) animals[i]);

			if (animals[i] instanceof Flying)
				makeItFly((Flying) animals[i]);
		}

		System.out.println("\n\nArrivederci!");

		scanner.close();
	}

}
