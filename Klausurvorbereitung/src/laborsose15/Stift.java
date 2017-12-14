package laborsose15;

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

		if (Farbe.valueOf(farbenName.toUpperCase()) == Farbe.ROT) {
			this.farbe = Farbe.ROT;
		}else
		if (Farbe.valueOf(farbenName.toUpperCase()) == Farbe.GRUEN) {
			this.farbe = Farbe.GRUEN;
		}else 
		if (Farbe.valueOf(farbenName.toUpperCase()) == Farbe.BLAU) {
			this.farbe = Farbe.BLAU;
		}else 
		throw new FarbFehlerException();
	}

	public void uebernimmFarbe(Stift stiftchen) {
		this.farbe = stiftchen.farbe;
	}

	public void verwendeNaechsteFarbe() {
		if (farbe == Farbe.values()[0]) {
			farbe = Farbe.values()[1];
		} else if (farbe == Farbe.values()[1]) {
			farbe = Farbe.values()[2];
		} else if (farbe == Farbe.values()[2]) {
			farbe = Farbe.values()[0];
		}
	}

	@Override
	public String toString() {
		return "Stift [farbe=" + farbe + "]";
	}
	
}
