package particles.elementary.fermions.leptons;

import particles.elementary.fermions.Lepton;

public class Muon extends Lepton {
	private static final String NAME = "muon";
	private static final String MASS = "105.6583715(35) MeV/c^2";
	private static final String CHARGE = "-1";
	private static final String SPIN = "1/2";
	private static final String DESCRIPTION = "";

	public Muon() {
		super(NAME, MASS, CHARGE, SPIN, DESCRIPTION);
	}
}
