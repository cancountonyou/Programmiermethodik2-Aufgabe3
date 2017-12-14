package Sose15Klausur;

class Addition extends Operator {
	public Addition() {
		System.out.println("Neue Addition erzeugt.");
	}

	public int berechne(int operand1, int operand2) {
		return operand1 + operand2;
	}

}
