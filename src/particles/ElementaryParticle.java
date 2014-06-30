package particles;

public class ElementaryParticle extends Particle {
	private static final ParticleType TYPE = ParticleType.ELEMENTARY;

	private ElementaryParticleType elementaryParticleType;

	public ElementaryParticle(String name, String mass, String charge,
			String spin, ElementaryParticleType type, String description) {
		super(name, mass, charge, spin, TYPE, description);
		this.setElementaryParticleType(type);
	}

	public ElementaryParticleType getElementaryParticleType() {
		return elementaryParticleType;
	}

	public void setElementaryParticleType(ElementaryParticleType type) {
		this.elementaryParticleType = type;
	}
}
