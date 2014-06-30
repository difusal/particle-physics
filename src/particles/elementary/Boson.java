package particles.elementary;

import particles.ElementaryParticle;
import particles.ElementaryParticleType;

public class Boson extends ElementaryParticle {
	private static final ElementaryParticleType TYPE = ElementaryParticleType.BOSON;

	private BosonType bosonType;

	public Boson(String name, String description, BosonType type) {
		super(name, description, TYPE);
		this.setBosonType(type);
	}

	public BosonType getBosonType() {
		return bosonType;
	}

	public void setBosonType(BosonType bosonType) {
		this.bosonType = bosonType;
	}
}
