package particles.elementary.fermions.quarks;

import particles.elementary.fermions.Quark;

public class CharmQuark extends Quark {
	private static final String NAME = "charm quark";
	private static final String MASS = "1.29 + 0.05 - 0.11 GeV/c^2";
	private static final String CHARGE = "2/3";
	private static final String SPIN = "1/2";
	private static final String DESCRIPTION = "";

	public CharmQuark() {
		super(NAME, MASS, CHARGE, SPIN, DESCRIPTION);
	}
}
