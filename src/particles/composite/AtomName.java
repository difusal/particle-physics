package particles.composite;

public enum AtomName {
	HYDROGEN(1),
	HELIUM(2),
	LITHIUM(3),
	BERYLLIUM(4),
	BORON(5),
	CARBON(6),
	NITROGEN(7),
	OXYGEN(8),
	FLUORINE(9),
	NEON(10),
	SODIUM(11),
	MAGNESIUM(12),
	ALUMINUM(13),
	SILICON(14),
	PHOSPHORUS(15),
	SULFUR(16),
	CHLORINE(17),
	ARGON(18),
	POTASSIUM(19),
	CALCIUM(20),
	SCANDIUM(21),
	TITANIUM(22),
	VANADIUM(23),
	CHROMIUM(24),
	MANGANESE(25),
	IRON(26),
	COBALT(27),
	NICKEL(28),
	COPPER(29),
	ZINC(30),
	GALLIUM(31),
	GERMANIUM(32),
	ARSENIC(33),
	SELENIUM(34),
	BROMINE(35),
	KRYPTON(36),
	RUBIDIUM(37),
	STRONTIUM(38),
	YTTRIUM(39),
	ZIRCONIUM(40),
	NIOBIUM(41),
	MOLYBDENUM(42),
	TECHNETIUM(43),
	RUTHENIUM(44),
	RHODIUM(45),
	PALLADIUM(46),
	SILVER(47),
	CADMIUM(48),
	INDIUM(49),
	TIN(50),
	ANTIMONY(51),
	TELLURIUM(52),
	IODINE(53),
	XENON(54),
	CESIUM(55),
	BARIUM(56),
	LANTHANUM(57),
	CERIUM(58),
	PRASEODYMIUM(59),
	NEODYMIUM(60),
	PROMETHIUM(61),
	SAMARIUM(62),
	EUROPIUM(63),
	GADOLINIUM(64),
	TERBIUM(65),
	DYSPROSIUM(66),
	HOLMIUM(67),
	ERBIUM(68),
	THULIUM(69),
	YTTERBIUM(70),
	LUTETIUM(71),
	HAFNIUM(72),
	TANTALUM(73),
	TUNGSTEN(74),
	RHENIUM(75),
	OSMIUM(76),
	IRIDIUM(77),
	PLATINUM(78),
	GOLD(79),
	MERCURY(80),
	THALLIUM(81),
	LEAD(82),
	BISMUTH(83),
	POLONIUM(84),
	ASTATINE(85),
	RADON(86),
	FRANCIUM(87),
	RADIUM(88),
	ACTINIUM(89),
	THORIUM(90),
	PROTACTINIUM(91),
	URANIUM(92),
	NEPTUNIUM(93),
	PLUTONIUM(94),
	AMERICIUM(95),
	CURIUM(96),
	BERKELIUM(97),
	CALIFORNIUM(98),
	EINSTEINIUM(99),
	FERMIUM(100),
	MENDELEVIUM(101),
	NOBELIUM(102),
	LAWRENCIUM(103),
	RUTHERFORDIUM(104),
	DUBNIUM(105),
	SEABORGIUM(106),
	BOHRIUM(107),
	HASSIUM(108),
	MEITNERIUM(109),
	DARMSTADTIUM(110),
	ROENTGENIUM(111),
	COPERNICIUM(112),
	UNUNTRIUM(113),
	FLEROVIUM(114),
	UNUNPENTIUM(115),
	LIVERMORIUM(116),
	UNUNSEPTIUM(117),
	UNUNOCTIUM(118);

	private final int atomicNumber;

	private AtomName(int atomicNumber) {
		this.atomicNumber = atomicNumber;
	}

	public int getAtomicNumber() {
		return atomicNumber;
	}
}
