package particles.elementary.fermions.quarks;

import database.Database;
import particles.elementary.fermions.Quark;

public class UpQuark extends Quark {
	private static final int ID = 0;

	public UpQuark() {
		super();
		loadAttributes(ID, Database.QUARKS_DB);
	}
}
