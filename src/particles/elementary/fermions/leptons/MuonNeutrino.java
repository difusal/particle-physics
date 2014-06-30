package particles.elementary.fermions.leptons;

import particles.elementary.fermions.Lepton;

public class MuonNeutrino extends Lepton {
	private static final String NAME = "muon neutrino";
	private static final String MASS = "< 0.17 MeV/c^2";
	private static final String CHARGE = "0";
	private static final String SPIN = "1/2";
	private static final String DESCRIPTION = "";

	public MuonNeutrino() {
		super(NAME, MASS, CHARGE, SPIN, DESCRIPTION);
	}
}
