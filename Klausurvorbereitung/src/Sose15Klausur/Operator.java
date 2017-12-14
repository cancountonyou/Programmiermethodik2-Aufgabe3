package Sose15Klausur;

	abstract class Operator {
		public Operator() {
			System.out.println("Neuer Operator erzeugt.");
		}

		public abstract int berechne(int operand1, int operand2);

		public void gibAus(int wert) {
			System.out.println("Wert: " + wert);
		}
	}