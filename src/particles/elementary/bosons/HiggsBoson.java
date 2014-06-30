package particles.elementary.bosons;

import particles.elementary.Boson;
import particles.elementary.BosonType;

public class HiggsBoson extends Boson {
	private static final String NAME = "Higgs boson";
	private static final String MASS = "126.0 ± 0.4 (stat) ± 0.4 (sys) GeV/c^2";
	private static final String CHARGE = "0";
	private static final String SPIN = "0";
	private static final String DESCRIPTION = "";

	public HiggsBoson() {
		super(NAME, MASS, CHARGE, SPIN, BosonType.HIGGS, DESCRIPTION);
	}
}
