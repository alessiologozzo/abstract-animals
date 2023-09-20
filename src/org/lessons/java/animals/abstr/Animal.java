package org.lessons.java.animals.abstr;

public abstract class Animal {

	public String sleep() {
		return "Zzz...";
	}

	public abstract String makeNoise();

	public abstract String eat();

	@Override
	public String toString() {
		return "Dorme: " + sleep() + "\nFa un verso: " + makeNoise() + "\nMangia: " + eat();
	}
}
