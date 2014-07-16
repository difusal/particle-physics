package particles.composite;

import particles.CompositeParticle;
import particles.CompositeParticleType;

public class Hadron extends CompositeParticle {
	private static final CompositeParticleType TYPE = CompositeParticleType.HADRON;

	private HadronType hadronType;

	public Hadron() {
		super();
		setCompositeParticleType(TYPE);
	}

	public Hadron(String name, String mass, String charge, String spin,
			HadronType type, String description) {
		super(name, mass, charge, spin, TYPE, description);
		this.setHadronType(type);
	}

	public HadronType getHadronType() {
		return hadronType;
	}

	public void setHadronType(HadronType hadronType) {
		this.hadronType = hadronType;
	}

	@Override
	public String toString() {
		return super.toString() + " > " + hadronType.toString();
	}
}
