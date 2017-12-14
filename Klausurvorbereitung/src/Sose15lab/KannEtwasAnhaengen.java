package Sose15lab;

public interface KannEtwasAnhaengen {

	 /**
	   * Hänge das andere Objekt (anderesObjekt) an das aktuelle Objekt an.
	   * 
	   * @param anderesObjekt
	   *          Objekt, das an das aktuelle Objekt "angehängt" wird.
	   */
	  public void haengeAn(KannAngehaengtWerden anderesObjekt);

	  /**
	   * Getter
	   * 
	   * @return Aktuell angehängtes Objekt. Liefert null, wenn nichts angehängt
	   *         ist.
	   */
	  public KannAngehaengtWerden getAnhaenger();
	}
