package particles.elementary.fermions.quarks;

import database.Database;
import particles.elementary.fermions.Quark;

public class StrangeQuark extends Quark {
	private static final int ID = 3;

	public StrangeQuark() {
		super();
		loadAttributes(ID, Database.QUARKS_DB);
	}
}
