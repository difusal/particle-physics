package particles;

import java.util.ArrayList;

import particles.composite.Atom;
import particles.composite.AtomName;
import particles.composite.hadrons.Meson;
import particles.composite.hadrons.baryons.Neutron;
import particles.composite.hadrons.baryons.Proton;
import particles.elementary.bosons.HiggsBoson;
import particles.elementary.bosons.gaugebosons.Gluon;
import particles.elementary.bosons.gaugebosons.Photon;
import particles.elementary.bosons.gaugebosons.WBoson;
import particles.elementary.bosons.gaugebosons.ZBoson;
import particles.elementary.fermions.leptons.Electron;
import particles.elementary.fermions.leptons.ElectronNeutrino;
import particles.elementary.fermions.leptons.Muon;
import particles.elementary.fermions.leptons.MuonNeutrino;
import particles.elementary.fermions.leptons.Tau;
import particles.elementary.fermions.leptons.TauNeutrino;
import particles.elementary.fermions.quarks.BottomQuark;
import particles.elementary.fermions.quarks.CharmQuark;
import particles.elementary.fermions.quarks.DownQuark;
import particles.elementary.fermions.quarks.StrangeQuark;
import particles.elementary.fermions.quarks.TopQuark;
import particles.elementary.fermions.quarks.UpQuark;

public class Loader {
	private static ArrayList<Particle> particles;

	// elementary particles
	private static ArrayList<Particle> elementaryParticles;
	private static ArrayList<Particle> fermions, bosons;
	private static ArrayList<Particle> quarks, leptons, gaugeBosons;

	// composite particles
	private static ArrayList<Particle> compositeParticles;
	private static ArrayList<Particle> hadrons, atoms, molecules;
	private static ArrayList<Particle> baryons;

	public static ArrayList<Particle> getParticles() {
		if (particles == null) {
			particles = new ArrayList<Particle>();

			particles.addAll(getElementaryParticles());
			particles.addAll(getcompositeParticles());
		}

		return particles;
	}

	// elementary particles
	public static ArrayList<Particle> getElementaryParticles() {
		if (elementaryParticles == null) {
			elementaryParticles = new ArrayList<Particle>();

			elementaryParticles.addAll(getFermions());
			elementaryParticles.addAll(getBosons());
		}

		return elementaryParticles;
	}

	public static ArrayList<Particle> getFermions() {
		if (fermions == null) {
			fermions = new ArrayList<Particle>();

			fermions.addAll(getQuarks());
			fermions.addAll(getLeptons());
		}

		return fermions;
	}

	public static ArrayList<Particle> getQuarks() {
		if (quarks == null) {
			quarks = new ArrayList<Particle>();

			quarks.add(new UpQuark());
			quarks.add(new DownQuark());

			quarks.add(new CharmQuark());
			quarks.add(new StrangeQuark());

			quarks.add(new TopQuark());
			quarks.add(new BottomQuark());
		}

		return quarks;
	}

	public static ArrayList<Particle> getLeptons() {
		if (leptons == null) {
			leptons = new ArrayList<Particle>();

			leptons.add(new Electron());
			leptons.add(new ElectronNeutrino());

			leptons.add(new Muon());
			leptons.add(new MuonNeutrino());

			leptons.add(new Tau());
			leptons.add(new TauNeutrino());
		}

		return leptons;
	}

	public static ArrayList<Particle> getBosons() {
		if (bosons == null) {
			bosons = new ArrayList<Particle>();

			bosons.addAll(getGaugeBosons());
			bosons.add(new HiggsBoson());
		}

		return bosons;
	}

	public static ArrayList<Particle> getGaugeBosons() {
		if (gaugeBosons == null) {
			gaugeBosons = new ArrayList<Particle>();

			gaugeBosons.add(new Gluon());
			gaugeBosons.add(new Photon());
			gaugeBosons.add(new ZBoson());
			gaugeBosons.add(new WBoson());
		}

		return gaugeBosons;
	}

	// composite particles
	public static ArrayList<Particle> getcompositeParticles() {
		if (compositeParticles == null) {
			compositeParticles = new ArrayList<Particle>();

			compositeParticles.addAll(getHadrons());
			compositeParticles.addAll(getAtoms());
			// compositeParticles.addAll(getMolecules());
		}

		return compositeParticles;
	}

	public static ArrayList<Particle> getHadrons() {
		if (hadrons == null) {
			hadrons = new ArrayList<Particle>();

			hadrons.addAll(getBaryons());
			hadrons.add(new Meson());
		}

		return hadrons;
	}

	public static ArrayList<Particle> getBaryons() {
		if (baryons == null) {
			baryons = new ArrayList<Particle>();

			baryons.add(new Proton());
			baryons.add(new Neutron());
		}

		return baryons;
	}

	public static ArrayList<Particle> getAtoms() {
		if (atoms == null) {
			atoms = new ArrayList<Particle>();

			atoms.add(new Atom(AtomName.HYDROGEN));
			atoms.add(new Atom(AtomName.HELIUM));
			atoms.add(new Atom(AtomName.LITHIUM));
			atoms.add(new Atom(AtomName.BERYLLIUM));
			atoms.add(new Atom(AtomName.BORON));
			atoms.add(new Atom(AtomName.CARBON));
			atoms.add(new Atom(AtomName.NITROGEN));
			atoms.add(new Atom(AtomName.OXYGEN));
			atoms.add(new Atom(AtomName.FLUORINE));
			atoms.add(new Atom(AtomName.NEON));
			atoms.add(new Atom(AtomName.SODIUM));
			atoms.add(new Atom(AtomName.MAGNESIUM));
			atoms.add(new Atom(AtomName.ALUMINUM));
			atoms.add(new Atom(AtomName.SILICON));
			atoms.add(new Atom(AtomName.PHOSPHORUS));
			atoms.add(new Atom(AtomName.SULFUR));
			atoms.add(new Atom(AtomName.CHLORINE));
			atoms.add(new Atom(AtomName.ARGON));
			atoms.add(new Atom(AtomName.POTASSIUM));
			atoms.add(new Atom(AtomName.CALCIUM));
			atoms.add(new Atom(AtomName.SCANDIUM));
			atoms.add(new Atom(AtomName.TITANIUM));
			atoms.add(new Atom(AtomName.VANADIUM));
			atoms.add(new Atom(AtomName.CHROMIUM));
			atoms.add(new Atom(AtomName.MANGANESE));
			atoms.add(new Atom(AtomName.IRON));
			atoms.add(new Atom(AtomName.COBALT));
			atoms.add(new Atom(AtomName.NICKEL));
			atoms.add(new Atom(AtomName.COPPER));
			atoms.add(new Atom(AtomName.ZINC));
			atoms.add(new Atom(AtomName.GALLIUM));
			atoms.add(new Atom(AtomName.GERMANIUM));
			atoms.add(new Atom(AtomName.ARSENIC));
			atoms.add(new Atom(AtomName.SELENIUM));
			atoms.add(new Atom(AtomName.BROMINE));
			atoms.add(new Atom(AtomName.KRYPTON));
			atoms.add(new Atom(AtomName.RUBIDIUM));
			atoms.add(new Atom(AtomName.STRONTIUM));
			atoms.add(new Atom(AtomName.YTTRIUM));
			atoms.add(new Atom(AtomName.ZIRCONIUM));
			atoms.add(new Atom(AtomName.NIOBIUM));
			atoms.add(new Atom(AtomName.MOLYBDENUM));
			atoms.add(new Atom(AtomName.TECHNETIUM));
			atoms.add(new Atom(AtomName.RUTHENIUM));
			atoms.add(new Atom(AtomName.RHODIUM));
			atoms.add(new Atom(AtomName.PALLADIUM));
			atoms.add(new Atom(AtomName.SILVER));
			atoms.add(new Atom(AtomName.CADMIUM));
			atoms.add(new Atom(AtomName.INDIUM));
			atoms.add(new Atom(AtomName.TIN));
			atoms.add(new Atom(AtomName.ANTIMONY));
			atoms.add(new Atom(AtomName.TELLURIUM));
			atoms.add(new Atom(AtomName.IODINE));
			atoms.add(new Atom(AtomName.XENON));
			atoms.add(new Atom(AtomName.CESIUM));
			atoms.add(new Atom(AtomName.BARIUM));
			atoms.add(new Atom(AtomName.LANTHANUM));
			atoms.add(new Atom(AtomName.CERIUM));
			atoms.add(new Atom(AtomName.PRASEODYMIUM));
			atoms.add(new Atom(AtomName.NEODYMIUM));
			atoms.add(new Atom(AtomName.PROMETHIUM));
			atoms.add(new Atom(AtomName.SAMARIUM));
			atoms.add(new Atom(AtomName.EUROPIUM));
			atoms.add(new Atom(AtomName.GADOLINIUM));
			atoms.add(new Atom(AtomName.TERBIUM));
			atoms.add(new Atom(AtomName.DYSPROSIUM));
			atoms.add(new Atom(AtomName.HOLMIUM));
			atoms.add(new Atom(AtomName.ERBIUM));
			atoms.add(new Atom(AtomName.THULIUM));
			atoms.add(new Atom(AtomName.YTTERBIUM));
			atoms.add(new Atom(AtomName.LUTETIUM));
			atoms.add(new Atom(AtomName.HAFNIUM));
			atoms.add(new Atom(AtomName.TANTALUM));
			atoms.add(new Atom(AtomName.TUNGSTEN));
			atoms.add(new Atom(AtomName.RHENIUM));
			atoms.add(new Atom(AtomName.OSMIUM));
			atoms.add(new Atom(AtomName.IRIDIUM));
			atoms.add(new Atom(AtomName.PLATINUM));
			atoms.add(new Atom(AtomName.GOLD));
			atoms.add(new Atom(AtomName.MERCURY));
			atoms.add(new Atom(AtomName.THALLIUM));
			atoms.add(new Atom(AtomName.LEAD));
			atoms.add(new Atom(AtomName.BISMUTH));
			atoms.add(new Atom(AtomName.POLONIUM));
			atoms.add(new Atom(AtomName.ASTATINE));
			atoms.add(new Atom(AtomName.RADON));
			atoms.add(new Atom(AtomName.FRANCIUM));
			atoms.add(new Atom(AtomName.RADIUM));
			atoms.add(new Atom(AtomName.ACTINIUM));
			atoms.add(new Atom(AtomName.THORIUM));
			atoms.add(new Atom(AtomName.PROTACTINIUM));
			atoms.add(new Atom(AtomName.URANIUM));
			atoms.add(new Atom(AtomName.NEPTUNIUM));
			atoms.add(new Atom(AtomName.PLUTONIUM));
			atoms.add(new Atom(AtomName.AMERICIUM));
			atoms.add(new Atom(AtomName.CURIUM));
			atoms.add(new Atom(AtomName.BERKELIUM));
			atoms.add(new Atom(AtomName.CALIFORNIUM));
			atoms.add(new Atom(AtomName.EINSTEINIUM));
			atoms.add(new Atom(AtomName.FERMIUM));
			atoms.add(new Atom(AtomName.MENDELEVIUM));
			atoms.add(new Atom(AtomName.NOBELIUM));
			atoms.add(new Atom(AtomName.LAWRENCIUM));
			atoms.add(new Atom(AtomName.RUTHERFORDIUM));
			atoms.add(new Atom(AtomName.DUBNIUM));
			atoms.add(new Atom(AtomName.SEABORGIUM));
			atoms.add(new Atom(AtomName.BOHRIUM));
			atoms.add(new Atom(AtomName.HASSIUM));
			atoms.add(new Atom(AtomName.MEITNERIUM));
			atoms.add(new Atom(AtomName.DARMSTADTIUM));
			atoms.add(new Atom(AtomName.ROENTGENIUM));
			atoms.add(new Atom(AtomName.COPERNICIUM));
			atoms.add(new Atom(AtomName.UNUNTRIUM));
			atoms.add(new Atom(AtomName.FLEROVIUM));
			atoms.add(new Atom(AtomName.UNUNPENTIUM));
			atoms.add(new Atom(AtomName.LIVERMORIUM));
			atoms.add(new Atom(AtomName.UNUNSEPTIUM));
			atoms.add(new Atom(AtomName.UNUNOCTIUM));
		}

		return atoms;
	}
}
