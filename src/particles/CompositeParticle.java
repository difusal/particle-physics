package particles;


public class CompositeParticle extends Particle {
	private static final ParticleType TYPE = ParticleType.COMPOSITE;

	public CompositeParticle(String name, String description) {
		super(name, description, TYPE);
	}
}
