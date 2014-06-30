package particles.elementary.bosons.gaugebosons;

import database.Database;
import particles.elementary.bosons.GaugeBoson;

public class Gluon extends GaugeBoson {
	private static final int ID = 0;

	public Gluon() {
		super();
		loadAttributes(ID, Database.BOSONS_DB);
	}
}
