package particles.elementary.fermions.leptons;

import particles.elementary.fermions.Lepton;

public class Tau extends Lepton {
	private static final String NAME = "tau";
	private static final String MASS = "1776.82 ± 0.16 MeV/c^2";
	private static final String CHARGE = "-1";
	private static final String SPIN = "1/2";
	private static final String DESCRIPTION = "";

	public Tau() {
		super(NAME, MASS, CHARGE, SPIN, DESCRIPTION);
	}
}
