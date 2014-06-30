package particles.elementary.fermions.leptons;

import database.Database;
import particles.elementary.fermions.Lepton;

public class Muon extends Lepton {
	private static final int ID = 2;

	public Muon() {
		super();
		loadAttributes(ID, Database.LEPTONS_DB);
	}
}
