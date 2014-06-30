package particles.elementary.fermions.leptons;

import database.Database;
import particles.elementary.fermions.Lepton;

public class TauNeutrino extends Lepton {
	private static final int ID = 5;

	public TauNeutrino() {
		super();
		loadAttributes(ID, Database.LEPTONS_DB);
	}
}
