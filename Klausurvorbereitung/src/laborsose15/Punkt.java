/**
 * Laborprüfung TI-Programmiertechnik.
 * Sommersemester 2015
 * Hochschule für Angewandte Wissenschaften, Hamburg
 */
package laborsose15;

/**
 * Diese Klasse repräsentiert einen Punkt bestehend aus einer x- und einer
 * y-Koordinate.
 * 
 * @author Philipp Jenke
 *
 */
public class Punkt {
  /**
   * x-Koordinate des Punktes
   */
  private double x;

  /**
   * y-Koordinate des Punktes
   */
  private double y;

  /**
   * Konstruktor, initialisiert die beiden Koordinaten
   * 
   * @param x
   *          Initialer Wert für die x-Koordinate
   * @param y
   *          Initialier Wert für die y-Koordinate.
   */
  public Punkt(double x, double y) {
    this.x = x;
    this.y = y;
  }

  /**
   * Getter.
   * 
   * @return Wert der x-Koordinate.
   */
  public double getX() {
    return x;
  }

  /**
   * Getter.
   * 
   * @return Wert der y-Koordinate.
   */
  public double getY() {
    return y;
  }

@Override
public String toString() {
	String ausgabe = String.format("%.2f / %.2f", x, y);
	return ausgabe;
}



@Override
public boolean equals(Object obj) {
	if(!(obj instanceof Punkt)){
		return false;
	}
	Punkt punkt = (Punkt) obj;
	if(this.x == punkt.x && this.y == punkt.y) {
		return true;
	}
	return false;
}
  
}
