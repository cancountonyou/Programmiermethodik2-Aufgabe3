package laborsose16;

public class ZahlTerm implements Term {
	private double wert;

	public ZahlTerm(double wert) {
		this.wert = wert;
	}

	
	@Override
	public String toString() {
		String ausgabe = String.format("%.2f", wert);
		return ausgabe;
	}


	


	@Override
	public boolean equals(Object obj) {
		if( !(obj instanceof ZahlTerm)) {
			return false;
		}
		ZahlTerm term = (ZahlTerm) obj;
		if(this.getWert() - term.getWert() <= 0.125){
			return true;
		}
		return false;
	}


	@Override
	public double getWert() {
		return wert;
	}

}
