package Sose15lab;

public class Anhaenger implements KannEtwasAnhaengen, KannAngehaengtWerden {
private Anhaenger objekt;

	public Anhaenger (KannAngehaengtWerden objekt){
		if (objekt != null){
			Anhaenger neu = (Anhaenger) objekt;
			this.objekt = neu;
		}else if(objekt == null){
			this.objekt = null;
		}
		
	}
	
	
	
	
	public KannAngehaengtWerden getObjekt() {
		return objekt;
	}
	@Override
	public void haengeAn(KannAngehaengtWerden anderesObjekt) {
		
		
	}

	@Override
	public KannAngehaengtWerden getAnhaenger() {
		return objekt;
	}




	@Override
	public String toString() {
		if(this.objekt.getAnhaenger() != null){
		return "A " + objekt.toString();
		}
		return null;
}}
