package laborsose15;

public class Kreditkarte implements Comparable<Kreditkarte>{

	private String name;
	private int nummer;
	
	
	public Kreditkarte(){
		this.name ="";
		this.nummer=0;
	}
	public Kreditkarte(String name, int nummer){
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
	public int compareTo(Kreditkarte kreditkarte) {
		if (this.nummer < kreditkarte.getNummer()){
			return -1;
		}else
	if(this.nummer > kreditkarte.getNummer())
		return 1;
	return 0;
	}

	
}
