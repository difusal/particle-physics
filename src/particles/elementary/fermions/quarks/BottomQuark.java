package particles.elementary.fermions.quarks;

import particles.elementary.fermions.Quark;

public class BottomQuark extends Quark {
	private static final String NAME = "bottom quark";
	private static final String MASS = "4.18 + 0.03 - 0.03 GeV/c^2";
	private static final String CHARGE = "-1/3";
	private static final String SPIN = "1/2";
	private static final String DESCRIPTION = "";

	public BottomQuark() {
		super(NAME, MASS, CHARGE, SPIN, DESCRIPTION);
	}
}
