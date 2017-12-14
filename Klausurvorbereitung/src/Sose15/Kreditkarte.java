package Sose15;

public class Kreditkarte implements Comparable<Kreditkarte>{

	private String name;
	private int nummer;
	
	public Kreditkarte() {
		name =new String();
		nummer = 0;
	}
	public Kreditkarte(String name, int nummer) {
		this.name = name;
		this.nummer = nummer;
	}
	
	public int getNummer() {
		return nummer;
	}

	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return name +": " + nummer;
	}
	@Override
	public int compareTo(Kreditkarte k) {
		if (this.getNummer() < k.getNummer()) {
			return -1;
		} else if (this.getNummer() > k.getNummer()) {
				return 1;
		}
		return 0;
	}
	
}