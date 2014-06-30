package particles.elementary.fermions;

import particles.elementary.ElementaryParticle;
import particles.elementary.ElementaryParticleType;

public class Fermion extends ElementaryParticle {
	private static final ElementaryParticleType TYPE = ElementaryParticleType.FERMION;

	private FermionType fermionType;

	public Fermion(String name, String description, FermionType type) {
		super(name, description, TYPE);
		this.setFermionType(type);
	}

	public FermionType getFermionType() {
		return fermionType;
	}

	public void setFermionType(FermionType type) {
		this.fermionType = type;
	}
}
