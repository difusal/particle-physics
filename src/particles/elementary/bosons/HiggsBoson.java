package particles.elementary.bosons;

import database.Database;
import particles.elementary.Boson;
import particles.elementary.BosonType;

public class HiggsBoson extends Boson {
	private static final int ID = 4;

	public HiggsBoson() {
		super();
		setBosonType(BosonType.HIGGS);
		loadAttributes(ID, Database.BOSONS_DB);
	}
}
