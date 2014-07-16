package cli;

import particles.Loader;
import particles.Particle;

public class Launcher {
	public static void main(String[] args) {
		for (Particle p : Loader.getAtoms())
			System.out.println(p + "\n");
	}
}
