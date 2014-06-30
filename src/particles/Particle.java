package particles;

public class Particle {
	private String name, description;
	private ParticleType particleType;

	public Particle(String name, String description, ParticleType type) {
		this.setName(name);
		this.setDescription(description);
		this.setParticleType(type);
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public ParticleType getParticleType() {
		return particleType;
	}

	public void setParticleType(ParticleType type) {
		this.particleType = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Name: " + name + "\nDescription: " + description
				+ "\nParticle Type:" + particleType;
	}
}
