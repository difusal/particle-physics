package particles.elementary.fermions.quarks;

import database.Database;
import particles.elementary.fermions.Quark;

public class TopQuark extends Quark {
	private static final int ID = 4;

	public TopQuark() {
		super();
		loadAttributes(ID, Database.QUARKS_DB);
	}
}
