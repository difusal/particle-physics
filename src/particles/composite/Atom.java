package particles.composite;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

import particles.CompositeParticle;
import particles.CompositeParticleType;
import particles.Loader;
import database.Database;

public class Atom extends CompositeParticle {
	private static final CompositeParticleType TYPE = CompositeParticleType.ATOM;

	private final int atomicNumber;
	private String symbol;

	public Atom(AtomName atomName) {
		super();
		setCompositeParticleType(TYPE);

		this.atomicNumber = atomName.getAtomicNumber();
		symbol = "";
		loadAttributes();
	}

	private void loadAttributes() {
		try {
			String symbol = "", name = "";
			String mass = "", charge = "", spin = "";
			String description = "";

			InputStream fis = new FileInputStream(Database.ATOMS_DB);
			BufferedReader br = new BufferedReader(new InputStreamReader(fis,
					Charset.forName("UTF-8")));

			int linesPerElem = Loader.loadLinesPerElement(br);

			String line;
			while ((line = br.readLine()) != null) {
				int readID = -1;

				try {
					readID = Integer.parseInt(line);
				} catch (NumberFormatException e) {
				}

				if (readID == atomicNumber) {
					symbol = br.readLine();
					name = br.readLine();
					mass = br.readLine();
					charge = br.readLine();
					spin = br.readLine();
					description = br.readLine();
					br.readLine();

					break;
				} else {
					for (int i = 0; i < linesPerElem; i++)
						br.readLine();
				}
			}

			setAttributes(symbol, name, mass, charge, spin, description);

			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	protected void setAttributes(String symbol, String name, String mass,
			String charge, String spin, String description) {
		this.setSymbol(symbol);
		this.setName(name);
		this.setMass(mass);
		this.setCharge(charge);
		this.setSpin(spin);
		this.setDescription(description);
	}

	private void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	@Override
	public String toString() {
		return "Atomic Number: " + atomicNumber + "\nSymbol: " + symbol
				+ "\nName: " + name + "\nMass: " + mass + "\nParticle Type: "
				+ particleType + " > " + TYPE;
	}
}
