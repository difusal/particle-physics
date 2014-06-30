package particles.elementary.fermions;

public class Lepton extends Fermion {
	private static final FermionType TYPE = FermionType.LEPTON;

	public Lepton(String name, String description) {
		super(name, description, TYPE);
	}
}
