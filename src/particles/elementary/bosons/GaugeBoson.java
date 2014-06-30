package particles.elementary.bosons;

import particles.elementary.Boson;
import particles.elementary.BosonType;

public class GaugeBoson extends Boson {
	private static final BosonType TYPE = BosonType.GAUGE;

	public GaugeBoson(String name, String description) {
		super(name, description, TYPE);
	}
}
