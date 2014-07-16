package particles;

public class CompositeParticle extends Particle {
	private static final ParticleType TYPE = ParticleType.COMPOSITE;

	private CompositeParticleType compositeParticleType;

	public CompositeParticle() {
		super();
		setParticleType(TYPE);
	}

	public CompositeParticle(String name, String mass, String charge,
			String spin, CompositeParticleType type, String description) {
		super(name, mass, charge, spin, TYPE, description);
		compositeParticleType = type;
	}

	public CompositeParticleType getCompositeParticleType() {
		return compositeParticleType;
	}

	public void setCompositeParticleType(
			CompositeParticleType compositeParticleType) {
		this.compositeParticleType = compositeParticleType;
	}

	@Override
	public String toString() {
		return super.toString() + " > " + compositeParticleType.toString();
	}
}
