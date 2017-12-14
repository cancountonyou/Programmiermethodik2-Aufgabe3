package Sose15Klausur;

class Multiplikation extends Operator {
	public void gibAus(int wert) {
		System.out.print("Mulitplikation: ");
		super.gibAus(wert);
	}

	public int berechne(int operand1, int operand2) {
		return operand1 * operand2;
	}
}
