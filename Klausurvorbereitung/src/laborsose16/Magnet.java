package laborsose16;



public class Magnet {
	private String name;
	private Magnet[] anliegendeMagnete = new Magnet[2];

	public enum Pol {
		PLUS, MINUS
	}

	public Magnet(String name) {
		this.name = name;
	}

	public void anlegen(Pol polung, Magnet magnet) {
		if (polung == Pol.PLUS && anliegendeMagnete[Pol.PLUS.ordinal()] == null) {
			anliegendeMagnete[Pol.PLUS.ordinal()] = magnet;
			magnet.anliegendeMagnete[Pol.MINUS.ordinal()] = this;
		} else if (polung == Pol.MINUS && anliegendeMagnete[Pol.MINUS.ordinal()] == null) {
			anliegendeMagnete[Pol.MINUS.ordinal()] = magnet;
			magnet.anliegendeMagnete[Pol.PLUS.ordinal()] = this;
		}
	}

	@Override
	public String toString() {
		String output = "Magnet [name=" + name + ", anliegendeMagnete=";
		if (this.anliegendeMagnete[0] != null) {
			output += this.anliegendeMagnete[0].getName();
		}
		if (this.anliegendeMagnete[1] != null) {
			output += this.anliegendeMagnete[1].getName();
		}
		return output + "]";
	}

	public String getName() {
		return name;
	}

	// @Override
	// public String toString() {
	// String magnete = "anliegendeMagnete=";
	// if(anliegendeMagnete[0] != null) {
	// magnete += anliegendeMagnete[0].toString() + ",";
	// }
	// if(anliegendeMagnete[1] != null) {
	// magnete += anliegendeMagnete[1];
	// }
	// return "Magnet [name=" + name + ", " + magnete + "]";
	// }
	
	public Magnet getMinuspolMagnet(){
		if(anliegendeMagnete[Pol.MINUS.ordinal()] != null) {
			if(anliegendeMagnete[Pol.MINUS.ordinal()].getMinuspolMagnet() != null){
				return anliegendeMagnete[Pol.MINUS.ordinal()].getMinuspolMagnet();
			}
		}
		
		return anliegendeMagnete[Pol.MINUS.ordinal()];
	}

}