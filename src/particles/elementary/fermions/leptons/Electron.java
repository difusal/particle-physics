package particles.elementary.fermions.leptons;

import particles.elementary.fermions.Lepton;

public class Electron extends Lepton {
	private static final String NAME = "electron";
	private static final String MASS = "0.510998928(11) MeV/c^2";
	private static final String CHARGE = "-1";
	private static final String SPIN = "1/2";
	private static final String DESCRIPTION = "";

	public Electron() {
		super(NAME, MASS, CHARGE, SPIN, DESCRIPTION);
	}
}
