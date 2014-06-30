package particles.elementary;

import particles.ElementaryParticle;
import particles.ElementaryParticleType;

public class Fermion extends ElementaryParticle {
	private static final ElementaryParticleType TYPE = ElementaryParticleType.FERMION;

	private FermionType fermionType;

	public Fermion() {
		super();
		setElementaryParticleType(TYPE);
	}

	public Fermion(String name, String mass, String charge, String spin,
			FermionType type, String description) {
		super(name, mass, charge, spin, TYPE, description);
		this.setFermionType(type);
	}

	public FermionType getFermionType() {
		return fermionType;
	}

	public void setFermionType(FermionType type) {
		this.fermionType = type;
	}

	@Override
	public String toString() {
		return super.toString() + " > " + fermionType.toString();
	}
}
