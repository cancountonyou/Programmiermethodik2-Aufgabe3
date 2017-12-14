package Sose15lab;

public class Traktor implements KannEtwasAnhaengen {
	private Anhaenger objekt;

	public Traktor(KannAngehaengtWerden objekt) {
		Anhaenger objektneu = (Anhaenger) objekt;
		if (objekt != null) {
			this.objekt = objektneu;
		} else if (objektneu == null) {
			this.objekt = null;
		}

	}
	public static Traktor erzeugeGespann(){
		Traktor traktor = new Traktor(new Anhaenger(new Anhaenger(new Anhaenger(null))));
		return traktor;
	}

	@Override
	public String toString() {
		if (this != null && this instanceof Traktor) {
			return "T " + this.objekt.toString();
		} else if (objekt != null && objekt instanceof Anhaenger)
			return objekt.getObjekt().toString();
		return null;
	}

	@Override
	public void haengeAn(KannAngehaengtWerden anderesObjekt) {

	}

	@Override
	public KannAngehaengtWerden getAnhaenger() {

		return null;
	}
	public static void main (String[] args){
		System.out.println(erzeugeGespann().toString());
		
	}
}