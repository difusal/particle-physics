package particles.elementary.fermions.leptons;

import database.Database;
import particles.elementary.fermions.Lepton;

public class Tau extends Lepton {
	private static final int ID = 4;

	public Tau() {
		super();
		loadAttributes(ID, Database.LEPTONS_DB);
	}
}
