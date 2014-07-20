package particles;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

public class Particle {
	protected String name;
	protected String mass, charge, spin;
	protected ParticleType particleType;
	protected String description;

	public Particle() {
		super();
	}

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

	public void loadAttributes(int ID, String database) {
		try {
			String name = "";
			String mass = "", charge = "", spin = "";
			String description = "";

			InputStream fis = new FileInputStream(database);
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

				if (readID == ID) {
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

			setAttributes(name, mass, charge, spin, description);

			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	protected void setAttributes(String name, String mass, String charge,
			String spin, String description) {
		this.setName(name);
		this.setMass(mass);
		this.setCharge(charge);
		this.setSpin(spin);
		this.setDescription(description);
	}

	@Override
	public String toString() {
		return "Name: " + name + "\nMass: " + mass + "\nCharge: " + charge
				+ "\nSpin: " + spin + "\nParticle Type: " + particleType;
	}
}
