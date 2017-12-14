package Sose15lab;

public class Creditcard implements Comparable<Creditcard> {

	private String name;
	private int nummer;

	public Creditcard() {
		name = "";
		nummer = 0;
	}

	public Creditcard(String name, int nummer) {
		this.name = name;
		this.nummer = nummer;
	}

	public String getName() {
		return name;
	}

	public int getNummer() {
		return nummer;
	}

	@Override
	public String toString() {
		return name + ": " + nummer;
	}

	@Override
	public int compareTo(Creditcard o) {
		if (this.getNummer() < o.getNummer()) {
			return -1;
		} else if (this.getNummer() > o.getNummer()) {
			return 1;
		} else
			return 0;
	}
}
