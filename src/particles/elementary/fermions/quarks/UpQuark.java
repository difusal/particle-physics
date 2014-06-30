package particles.elementary.fermions.quarks;

import particles.elementary.fermions.Quark;

public class UpQuark extends Quark {
	private static final String NAME = "up quark";
	private static final String MASS = "2.3 + 0.7 - 0.5 MeV/c^2";
	private static final String CHARGE = "2/3";
	private static final String SPIN = "1/2";
	private static final String DESCRIPTION = "";

	public UpQuark() {
		super(NAME, MASS, CHARGE, SPIN, DESCRIPTION);
	}
}
