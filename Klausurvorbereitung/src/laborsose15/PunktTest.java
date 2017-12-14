package laborsose15;

public class PunktTest {
	public static void  main (String[] args){
Punkt p1= new Punkt(3.1567, 1.45326);
System.out.println(p1);
Punkt p2 = new Punkt(3.1567, 1.45326);
System.out.println(p1.equals(p2));
Punkt p3 = new Punkt(1.2, 8.9);
System.out.println(p3.equals(p1));
}
}