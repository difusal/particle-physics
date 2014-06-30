package particles.elementary.fermions.quarks;

import database.Database;
import particles.elementary.fermions.Quark;

public class CharmQuark extends Quark {
	private static final int ID = 2;

	public CharmQuark() {
		super();
		loadAttributes(ID, Database.QUARKS_DB);
	}
}
