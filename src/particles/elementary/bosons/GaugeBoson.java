package particles.elementary.bosons;

import particles.elementary.Boson;
import particles.elementary.BosonType;

public class GaugeBoson extends Boson {
	private static final BosonType TYPE = BosonType.GAUGE;

	public GaugeBoson() {
		super();
		setBosonType(TYPE);
	}

	public GaugeBoson(String name, String mass, String charge, String spin,
			String description) {
		super(name, mass, charge, spin, TYPE, description);
	}
}
