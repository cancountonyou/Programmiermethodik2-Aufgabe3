package laborsose15;

import laborsose15.Stift.Farbe;

public class Stifttest {
public static void main (String[] args){
	System.out.println(Farbe.values()[2]);

	Stift s1 = new Stift();
	System.out.println(s1);
	Stift s2 = new Stift();
	System.out.println(s2);
	s2.verwendeNaechsteFarbe();
	System.out.println(s2);
	
	float b = (float) (9/4);
	int a = 9/4;
	int c = (short) (9.0/(4+1.0));
	int d =9%-4;
	int e = 3<<1;
	boolean f = true && 7>4;
	String g = 2+"3";
	char nine = '9';
	int h = (nine == '9') ? 23 : -23;
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	System.out.println(d);
	System.out.println(e);
	System.out.println(f);
	System.out.println(g);
	System.out.println(h);
	
	String [] stringArray = {"Jan", "Hein", "Klaas", "Pit", "julia"};
	for (int index = 0; index < stringArray.length; index++){
		System.out.print(stringArray[index].charAt(1));
	}
	System.out.println();
	int index = 0;
	while (index <stringArray.length){
		System.out.print(stringArray[index].charAt(1));
		index++;
	}
	System.out.println();
	int i =0;
	for (String name : stringArray){
		System.out.print(stringArray[i].charAt(1));
		i++;
	}
	}
}
