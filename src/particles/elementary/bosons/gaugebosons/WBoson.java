package particles.elementary.bosons.gaugebosons;

import database.Database;
import particles.elementary.bosons.GaugeBoson;

public class WBoson extends GaugeBoson {
	private static final int ID = 3;

	public WBoson() {
		super();
		loadAttributes(ID, Database.BOSONS_DB);
	}
}
