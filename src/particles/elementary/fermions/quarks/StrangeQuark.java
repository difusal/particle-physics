package particles.elementary.fermions.quarks;

import particles.elementary.fermions.Quark;

public class StrangeQuark extends Quark {
	private static final String NAME = "strange quark";
	private static final String MASS = "95 + 5 - 5 MeV/c^2";
	private static final String CHARGE = "-1/3";
	private static final String SPIN = "1/2";
	private static final String DESCRIPTION = "";

	public StrangeQuark() {
		super(NAME, MASS, CHARGE, SPIN, DESCRIPTION);
	}
}
