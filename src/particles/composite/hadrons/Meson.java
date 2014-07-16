package particles.composite.hadrons;

import particles.composite.Hadron;
import particles.composite.HadronType;
import database.Database;

public class Meson extends Hadron {
	private static final int ID = 2;

	public Meson() {
		super();
		setHadronType(HadronType.MESON);
		loadAttributes(ID, Database.HADRONS_DB);
	}
}
