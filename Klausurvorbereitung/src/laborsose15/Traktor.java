package laborsose15;

public class Traktor implements KannEtwasAnhaengen{

	public Traktor(Object anhaengen){
		if(anhaengen instanceof KannAngehaengtWerden || anhaengen == null) {
			Traktor traktor = (Traktor) anhaengen;
		}	
		}
		
		//public static Traktor erzeugeGespann(){
			//Traktor traktor1 = new Traktor();
			
	//}
	@Override
	public void haengeAn(KannAngehaengtWerden anderesObjekt) {
	
		
	}

	@Override
	public KannAngehaengtWerden getAnhaenger() {
		
		return null;
	}

}
