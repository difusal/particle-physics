package particles.composite.hadrons;

import particles.composite.Hadron;
import particles.composite.HadronType;

public class Baryon extends Hadron {
	private static final HadronType TYPE = HadronType.BARYON;

	public Baryon() {
		super();
		setHadronType(TYPE);
	}

	public Baryon(String name, String mass, String charge, String spin,
			String description) {
		super(name, mass, charge, spin, TYPE, description);
	}
}
