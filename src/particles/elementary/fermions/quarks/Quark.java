package particles.elementary.fermions.quarks;

import particles.elementary.fermions.Fermion;
import particles.elementary.fermions.FermionType;

public class Quark extends Fermion {
	private static final FermionType TYPE = FermionType.QUARK;

	public Quark(String name, String description) {
		super(name, description, TYPE);
	}
}
