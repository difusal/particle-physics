package logic;

import java.util.ArrayList;

import particles.Particle;
import particles.elementary.fermions.quarks.Quark;

public class Loader {
	private static ArrayList<Particle> quarks;

	public static ArrayList<Particle> getQuarks() {
		if (quarks == null) {
			quarks = new ArrayList<Particle>();

			quarks.add(new Quark("Up", "unavailable"));
			quarks.add(new Quark("Down", "unavailable"));

			quarks.add(new Quark("Charm", "unavailable"));
			quarks.add(new Quark("Strange", "unavailable"));

			quarks.add(new Quark("Top", "unavailable"));
			quarks.add(new Quark("Bottom", "unavailable"));
		}

		return quarks;
	}
}
