package particles.elementary.bosons.gaugebosons;

import database.Database;
import particles.elementary.bosons.GaugeBoson;

public class Photon extends GaugeBoson {
	private static final int ID = 1;

	public Photon() {
		super();
		loadAttributes(ID, Database.BOSONS_DB);
	}
}
