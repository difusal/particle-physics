package particles;

import java.util.ArrayList;

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
	private static ArrayList<Particle> quarks, leptons;

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
}
