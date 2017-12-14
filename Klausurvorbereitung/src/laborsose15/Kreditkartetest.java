package laborsose15;

public class Kreditkartetest {

	
	
	public static void main(String[] args){
		Kreditkarte k1 = new Kreditkarte("lars", 13);
		Kreditkarte k2 = new Kreditkarte("anna", 15);
		Kreditkarte k3 = new Kreditkarte("malte", 13);
		
		System.out.println(k1.compareTo(k2));
		System.out.println(k2.compareTo(k1));
		System.out.println(k1.compareTo(k3));
		System.out.println(k3.compareTo(k1));
	}
}
