package Sose15lab;

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

	public void setFarbe(String farbenName) throws IllegalArgumentException {
		switch (Farbe.valueOf(farbenName.toUpperCase())) {
		case ROT:
			farbe = Farbe.ROT;
			break;
		case BLAU:
			farbe = Farbe.BLAU;
			break;
		case GRUEN:
			farbe = farbe.GRUEN;
			break;
		default:
			throw new IllegalArgumentException("leider falsche farbe, bro");
		}
	}

	public void uebernimmFarbe(Stift stiftchen) {
		this.farbe = stiftchen.farbe;
	}

	public void verwendeNaechsteFarbe() {
		if (this.farbe == Farbe.ROT) {
			this.farbe = Farbe.GRUEN;
		} else if (this.farbe == Farbe.GRUEN) {
			this.farbe = Farbe.BLAU;
		} else
			this.farbe = Farbe.ROT;
	}
	
}
