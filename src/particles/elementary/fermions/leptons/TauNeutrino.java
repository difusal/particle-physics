package particles.elementary.fermions.leptons;

import particles.elementary.fermions.Lepton;

public class TauNeutrino extends Lepton {
	private static final String NAME = "tau neutrino";
	private static final String MASS = "< 15.5 MeV/c^2";
	private static final String CHARGE = "0";
	private static final String SPIN = "1/2";
	private static final String DESCRIPTION = "";

	public TauNeutrino() {
		super(NAME, MASS, CHARGE, SPIN, DESCRIPTION);
	}
}
