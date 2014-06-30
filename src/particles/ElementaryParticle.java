package particles;


public class ElementaryParticle extends Particle {
	private static final ParticleType TYPE = ParticleType.ELEMENTARY;

	private ElementaryParticleType elementaryParticleType;

	public ElementaryParticle(String name, String description,
			ElementaryParticleType type) {
		super(name, description, TYPE);
		this.setElementaryParticleType(type);
	}

	public ElementaryParticleType getElementaryParticleType() {
		return elementaryParticleType;
	}

	public void setElementaryParticleType(ElementaryParticleType type) {
		this.elementaryParticleType = type;
	}
}
