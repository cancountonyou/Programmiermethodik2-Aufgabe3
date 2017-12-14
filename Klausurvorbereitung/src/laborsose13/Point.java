
package laborsose13;

import java.util.ArrayList;
import java.util.List;

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
		public boolean equals(Object obj) {
			if(!(obj instanceof Point))
				return false;
			Point neuerPunkt = (Point) obj;
			if( this.x == neuerPunkt.x && this.y == neuerPunkt.y  && this.z == neuerPunkt.z){
				return true;
			}
			return false;
		}
		public static void main(String[] args){
			List<Point> punkteliste = new ArrayList<Point>();
			PointName p1 = new PointName(1,2,3,"Center");
			PointName p2 = new PointName(1,2,5,"Hans");
			PointName p3 = new PointName(1,4,3,"Links");
			PointName p4 = new PointName(8,2,3,"Rechts");
			punkteliste.add(p1);
			punkteliste.add(p2);
			punkteliste.add(p3);
			punkteliste.add(p4);
			for (Point puenktchen : punkteliste){
			System.out.println(puenktchen);
			}
		}
	}
