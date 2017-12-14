package Sose15lab;

public class Polygon {

	 /**
	   * Die Punkte werden in einem Aray abgelegt. Die Länge des Arrays gibt die
	   * Anzahl der Punkte im Polygon an.
	   */
	  private Punkt[] punkte;

	  /**
	   * Liefert die Anzahl der Punkte im Polygon.
	   * 
	   * @return Anzahl der Punkte im Polygon.
	   */
	  public int getAnzahlPunkte() {
	    return punkte.length;
	  }

	  /**
	   * Getter für einen einzelnen Punkt.
	   * 
	   * @param index
	   *          Index des angefragten Punktes. Gültige Werte sind 0 ...
	   *          punkte.length-1.
	   * @return Punkt am angegebenen Index.
	   */
	  public Punkt getPunkt(int index) {
	    return punkte[index];
	  }
	  public Polygon(int anzahl){
		  punkte = new Punkt[anzahl];
	  }
	  public Polygon(Punkt...punkte){
		  
	  }
	}