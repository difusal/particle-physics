package particles.elementary.fermions.leptons;

import database.Database;
import particles.elementary.fermions.Lepton;

public class Electron extends Lepton {
	private static final int ID = 0;

	public Electron() {
		super();
		loadAttributes(ID, Database.LEPTONS_DB);
	}
}
