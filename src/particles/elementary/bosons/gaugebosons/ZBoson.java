package particles.elementary.bosons.gaugebosons;

import database.Database;
import particles.elementary.bosons.GaugeBoson;

public class ZBoson extends GaugeBoson {
	private static final int ID = 2;

	public ZBoson() {
		super();
		loadAttributes(ID, Database.BOSONS_DB);
	}
}
