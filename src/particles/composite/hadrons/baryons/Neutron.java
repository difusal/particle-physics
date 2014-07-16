package particles.composite.hadrons.baryons;

import database.Database;
import particles.composite.hadrons.Baryon;

public class Neutron extends Baryon {
	private static final int ID = 1;

	public Neutron() {
		super();
		loadAttributes(ID, Database.HADRONS_DB);
	}

}
