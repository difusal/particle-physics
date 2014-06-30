package particles;

import java.util.ArrayList;

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
	private static ArrayList<Particle> elementaryParticles;
	private static ArrayList<Particle> fermions, bosons;
	private static ArrayList<Particle> quarks, leptons, gaugeBosons;

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
}
