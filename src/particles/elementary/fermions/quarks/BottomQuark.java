package particles.elementary.fermions.quarks;

import database.Database;
import particles.elementary.fermions.Quark;

public class BottomQuark extends Quark {
	private static final int ID = 5;

	public BottomQuark() {
		super();
		loadAttributes(ID, Database.QUARKS_DB);
	}
}
