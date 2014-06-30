package cli;

import particles.Loader;
import particles.Particle;

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
		
		for (Particle p : Loader.getElementaryParticles())
			System.out.println(p + "\n");
	}
}
