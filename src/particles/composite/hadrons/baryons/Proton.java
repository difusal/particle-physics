package particles.composite.hadrons.baryons;

import particles.composite.hadrons.Baryon;
import database.Database;

public class Proton extends Baryon {
	private static final int ID = 0;

	public Proton() {
		super();
		loadAttributes(ID, Database.HADRONS_DB);
	}
}
