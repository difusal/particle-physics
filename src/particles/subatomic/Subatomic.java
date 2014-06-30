package particles.subatomic;

import particles.Particle;
import particles.ParticleType;

public class Subatomic extends Particle {
	private static final ParticleType TYPE = ParticleType.SUBATOMIC;

	public Subatomic(String name, String description) {
		super(name, description, TYPE);
	}
}
