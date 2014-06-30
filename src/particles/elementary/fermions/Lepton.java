package particles.elementary.fermions;

import particles.elementary.Fermion;
import particles.elementary.FermionType;

public class Lepton extends Fermion {
	private static final FermionType TYPE = FermionType.LEPTON;

	public Lepton() {
		super();
		setFermionType(TYPE);
	}
	
	public Lepton(String name, String mass, String charge, String spin,
			String description) {
		super(name, mass, charge, spin, TYPE, description);
	}
}
