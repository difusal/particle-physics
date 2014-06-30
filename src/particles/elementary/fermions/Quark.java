package particles.elementary.fermions;

import particles.elementary.Fermion;
import particles.elementary.FermionType;


public class Quark extends Fermion {
	private static final FermionType TYPE = FermionType.QUARK;

	public Quark(String name, String description) {
		super(name, description, TYPE);
	}
}
