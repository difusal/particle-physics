package particles.elementary.fermions.leptons;

import database.Database;
import particles.elementary.fermions.Lepton;

public class MuonNeutrino extends Lepton {
	private static final int ID = 3;

	public MuonNeutrino() {
		super();
		loadAttributes(ID, Database.LEPTONS_DB);
	}
}
