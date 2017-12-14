package laborsose16;

public class TestDvd {
public static void main (String[] args){
	Dvd d1 = new Dvd("blabla", 160, 8);
	Dvd d2 = new Dvd("yolo", 180, 18);
	Dvd d3 = new Dvd("hey", 220, 12);
	
	DvdSammlung s1 = new DvdSammlung(3);
	System.out.println("DVDS: " + s1.getAnzahlDvds());
	s1.dvdHinzufuegen(d1);
	s1.dvdHinzufuegen(d2);
	s1.dvdHinzufuegen(d3);
	Dvd d4 = new Dvd("LALALA", 120, 14);
	
	try {
		s1.dvdHinzufuegen(d4);
	}catch(IllegalArgumentException e){
		System.out.println("Fehler: " + e.getMessage());
	}
	try{
		s1.getDvd(3);
	} catch (IllegalArgumentException e){
		System.out.println("Fehler: " + e.getMessage());
	}
	System.out.println(s1.getDvd(1));
	System.out.println("blabla DVD: "+ s1.getDvd("blabla"));
	System.out.println(s1.getLaufzeitInSamllung());
	System.out.println("Dvds ab 12 " + s1.getDvdsBisAlter(12));
}
}
