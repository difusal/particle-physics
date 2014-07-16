package particles.composite;

import database.Database;
import particles.CompositeParticle;
import particles.CompositeParticleType;

public class Atom extends CompositeParticle {
	private static final CompositeParticleType TYPE = CompositeParticleType.ATOM;

	private final int atomicNumber;

	public Atom(AtomName atomName) {
		super();
		setCompositeParticleType(TYPE);

		this.atomicNumber = atomName.getAtomicNumber();
		loadAttributes(atomicNumber, Database.ATOMS_DB);
	}

	@Override
	public String toString() {
		return "Atomic Number: " + atomicNumber + "\nName: " + name
				+ "\nMass: " + mass + "\nParticle Type: " + particleType
				+ " > " + TYPE;
	}
}
