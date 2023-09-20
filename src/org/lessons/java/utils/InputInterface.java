package org.lessons.java.utils;

import java.util.Scanner;

public class InputInterface {

	public static int getInt(Scanner scanner, int min, int max, String requestMessage) {

		String inputValue;
		int x = 0;
		boolean inputSuccess = false;

		System.out.println(requestMessage);

		while (!inputSuccess) {
			inputValue = scanner.nextLine();
			try {
				x = Integer.parseInt(inputValue);

				if (x < min)
					System.err.println("Errore! Devi inserire un numero maggiore di " + (min - 1) + ". Riprova");
				else if (x > max)
					System.err.println("Errore! Devi inserire un numero minore di  " + (max + 1) + ". Riprova");
				else
					inputSuccess = true;
			} catch (NumberFormatException e) {
				System.err.println("Errore! Devi inserire un numero intero. Riprova");
			}
		}

		return x;
	}
}
