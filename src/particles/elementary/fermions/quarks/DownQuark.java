package particles.elementary.fermions.quarks;

import particles.elementary.fermions.Quark;

public class DownQuark extends Quark {
	private static final String NAME = "down quark";
	private static final String MASS = "4.8 + 0.5 - 0.3 MeV/c^2";
	private static final String CHARGE = "-1/3";
	private static final String SPIN = "1/2";
	private static final String DESCRIPTION = "";

	public DownQuark() {
		super(NAME, MASS, CHARGE, SPIN, DESCRIPTION);
	}
}
