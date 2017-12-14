/**
 * Laborprüfung TI-Programmiertechnik.
 * Sommersemester 2015
 * Hochschule für Angewandte Wissenschaften, Hamburg
 */
package laborsose15;

/**
 * Ein Polygon verbindet ringförmig eine geordnete Liste von Punkte.
 * 
 * @author Philipp Jenke
 */
public class Polygon {

	
  /**
   * Die Punkte werden in einem Aray abgelegt. Die Länge des Arrays gibt die
   * Anzahl der Punkte im Polygon an.
   */
  private Punkt[] punkte;
  
  public Polygon(int anzahl){
		punkte = new Punkt[anzahl];
	}
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

  public Polygon(Punkt... punkte){
	  this.punkte = punkte;
  }
}