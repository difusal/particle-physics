package particles.elementary.fermions;

import particles.elementary.Fermion;
import particles.elementary.FermionType;


public class Lepton extends Fermion {
	private static final FermionType TYPE = FermionType.LEPTON;

	public Lepton(String name, String description) {
		super(name, description, TYPE);
	}
}
