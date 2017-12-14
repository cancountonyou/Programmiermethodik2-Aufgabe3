package Sose15lab;

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
	 *            Initialer Wert für die x-Koordinate
	 * @param y
	 *            Initialier Wert für die y-Koordinate.
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
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Punkt other = (Punkt) obj;
		if ((this.x - other.x <= 1 / 100000) && (this.y - other.y <= 1 / 100000)) {
			return true;
		}
		return false;
	}
}
