package particles.elementary.fermions.quarks;

import particles.elementary.fermions.Quark;

public class TopQuark extends Quark {
	private static final String NAME = "top quark";
	private static final String MASS = "173.34 ± 0.27 (stat) ± 0.71 (syst) GeV/c^2";
	private static final String CHARGE = "2/3";
	private static final String SPIN = "1/2";
	private static final String DESCRIPTION = "";

	public TopQuark() {
		super(NAME, MASS, CHARGE, SPIN, DESCRIPTION);
	}
}
