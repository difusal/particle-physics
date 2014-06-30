package cli;

import java.util.Scanner;

import particles.Particle;
import logic.Loader;

public class Launcher {
	public static void main(String[] args) {
		/*
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.print("Type something: ");
			String str = scanner.nextLine();

			System.out.println("You typed: " + str);
			if (str.equals("lol"))
				break;
		}

		scanner.close();
		*/
		
		System.out.println("Quarks:\n");
		for (Particle p : Loader.getQuarks())
			System.out.println(p + "\n");
	}
}
