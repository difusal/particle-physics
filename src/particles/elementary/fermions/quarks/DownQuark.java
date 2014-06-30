package particles.elementary.fermions.quarks;

import database.Database;
import particles.elementary.fermions.Quark;

public class DownQuark extends Quark {
	private static final int ID = 1;

	public DownQuark() {
		super();
		loadAttributes(ID, Database.QUARKS_DB);
	}
}
