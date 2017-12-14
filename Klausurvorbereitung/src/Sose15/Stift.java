package Sose15;

public class Stift {
	public enum Farbe {
		ROT, GRUEN, BLAU
	}

	private Farbe farbe;

	public Farbe getFarbe() {
		return farbe;
	}

	public Stift() {
		farbe = Farbe.ROT;
	}

	public void setFarbe(String farbenName) throws FarbFehlerException {
		switch (farbe.valueOf(farbenName.toUpperCase())) {
		case ROT:
			farbe = Farbe.ROT;
		case BLAU:
			farbe = Farbe.BLAU;
		case GRUEN:
			farbe = Farbe.GRUEN;
		default:
			throw new FarbFehlerException();
		}
	}

	public void uebernimmFarbe(Stift stift) {
		farbe = stift.getFarbe();
	}

	public void verwendeNaechsteFarbe() {
		if (farbe.ordinal() == Farbe.values().length - 1) {
			farbe = Farbe.values()[0];
		} else {
			farbe = farbe.values()[farbe.ordinal() + 1];
		}
	}
}
