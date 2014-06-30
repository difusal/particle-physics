package particles.elementary.fermions.leptons;

import database.Database;
import particles.elementary.fermions.Lepton;

public class ElectronNeutrino extends Lepton {
	private static final int ID = 1;

	public ElectronNeutrino() {
		super();
		loadAttributes(ID, Database.LEPTONS_DB);
	}
}
