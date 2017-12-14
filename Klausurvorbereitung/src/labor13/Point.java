/**
 * Prof. Philipp Jenke
 * Hochschule f�r Angewandte Wissenschaften (HAW), Hamburg
 */
package labor13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Repr�sentierung eines dreidimensionalen Punktes. Ein Punkt beinhaltet drei
 * Koordinaten: x, y, z.
 */
public class Point {
	/**
	 * Koordinaten des Punktes.
	 */
	private double x, y, z;

	/**
	 * Default constructor.
	 * 
	 * @param x
	 *            Initialisierungswert f�r die Koordinate x.
	 * @param y
	 *            Initialisierungswert f�r die Koordinate y.
	 * @param z
	 *            Initialisierungswert f�r die Koordinate z.
	 */
	public Point(double x, double y, double z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public double getZ() {
		return z;
	}

	@Override
	public String toString() {
		return "(" + getX() + ", " + getY() + ", " + getZ() + ")";
	}

	@Override
	public boolean equals(Object vergleichspunkt) {
		if (!(vergleichspunkt instanceof Point)) {
			return false;
		}
		Point vergleich = (Point) vergleichspunkt;
		if (x == vergleich.x && y == vergleich.y && z == vergleich.z) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Point pointA = new Point(1.3, 4.5, 6.7);
		Point pointB = new Point(8, 9, 13);
		Point pointC = new Point(5, 4, 3);

		List<Point> pointArray = new ArrayList<Point>();
		pointArray.add(pointA);
		pointArray.add(pointB);
		pointArray.add(pointC);

		for (Point s : pointArray) {
			System.out.println(s);

		}
	}
}
