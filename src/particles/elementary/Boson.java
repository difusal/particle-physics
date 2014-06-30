package particles.elementary;

import particles.ElementaryParticle;
import particles.ElementaryParticleType;

public class Boson extends ElementaryParticle {
	private static final ElementaryParticleType TYPE = ElementaryParticleType.BOSON;

	private BosonType bosonType;

	public Boson() {
		super();
		setElementaryParticleType(TYPE);
	}

	public Boson(String name, String mass, String charge, String spin,
			BosonType type, String description) {
		super(name, mass, charge, spin, TYPE, description);
		this.setBosonType(type);
	}

	public BosonType getBosonType() {
		return bosonType;
	}

	public void setBosonType(BosonType bosonType) {
		this.bosonType = bosonType;
	}
}
