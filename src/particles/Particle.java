package particles;

public class Particle {
	private String name;
	private String mass, charge, spin;
	private ParticleType particleType;
	private String description;

	public Particle(String name, String mass, String charge, String spin,
			ParticleType type, String description) {
		this.setName(name);
		this.setMass(mass);
		this.setCharge(charge);
		this.setSpin(spin);
		this.setParticleType(type);
		this.setDescription(description);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMass() {
		return mass;
	}

	public void setMass(String mass) {
		this.mass = mass;
	}

	public String getCharge() {
		return charge;
	}

	public void setCharge(String charge) {
		this.charge = charge;
	}

	public String getSpin() {
		return spin;
	}

	public void setSpin(String spin) {
		this.spin = spin;
	}

	public ParticleType getParticleType() {
		return particleType;
	}

	public void setParticleType(ParticleType type) {
		this.particleType = type;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Name: " + name + "\tMass: " + mass + "\tCharge: " + charge
				+ "\tSpin: " + spin + "\tParticle Type: " + particleType;
	}
}
