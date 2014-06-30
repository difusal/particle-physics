package particles.elementary.bosons.gaugebosons;

import particles.elementary.bosons.GaugeBoson;

public class WBoson extends GaugeBoson {
	private static final String NAME = "W boson";
	private static final String MASS = "2.085 ± 0.042 GeV/c^2";
	private static final String CHARGE = "±1";
	private static final String SPIN = "1";
	private static final String DESCRIPTION = "";

	public WBoson() {
		super(NAME, MASS, CHARGE, SPIN, DESCRIPTION);
	}
}
