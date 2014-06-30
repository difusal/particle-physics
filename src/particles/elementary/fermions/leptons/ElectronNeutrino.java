package particles.elementary.fermions.leptons;

import particles.elementary.fermions.Lepton;

public class ElectronNeutrino extends Lepton {
	private static final String NAME = "electron neutrino";
	private static final String MASS = "< 2.2 eV/c^2";
	private static final String CHARGE = "0";
	private static final String SPIN = "1/2";
	private static final String DESCRIPTION = "";

	public ElectronNeutrino() {
		super(NAME, MASS, CHARGE, SPIN, DESCRIPTION);
	}
}
