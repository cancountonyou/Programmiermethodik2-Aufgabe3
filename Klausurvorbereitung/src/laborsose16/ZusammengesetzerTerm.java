package laborsose16;

public class ZusammengesetzerTerm implements Term {
	public enum Grundrechenart {
		PLUS, MINUS, MAL, GETEILT
	}

	private Grundrechenart operator;
	Term operand1;
	Term operand2;

	public ZusammengesetzerTerm(Grundrechenart operator, Term operand1, Term operand2) {
		this.operator = operator;
		this.operand1 = operand1;
		this.operand2 = operand2;
	}

	@Override
	public double getWert() {
		double ergebnis;
		switch (operator) {
		case PLUS:
			ergebnis = operand1.getWert() + operand2.getWert();
			return ergebnis;
		case MINUS:
			ergebnis = operand1.getWert() - operand2.getWert();
			return ergebnis;
		case MAL:
			ergebnis = operand1.getWert() * operand2.getWert();
			return ergebnis;
		case GETEILT:
			ergebnis = (operand1.getWert() / operand2.getWert());
			return ergebnis;
		default:
			return 0;
		}
	}

	

}
