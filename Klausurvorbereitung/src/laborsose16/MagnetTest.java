package laborsose16;

import laborsose16.Magnet.Pol;

public class MagnetTest {
	public static void main (String[] args){
		
			Magnet m1 = new Magnet("magnet1");
			Magnet m2 = new Magnet("magnet2");
			Magnet m3 = new Magnet("magnet3");
			Magnet m4 = new Magnet("magnet4");
			Magnet m5 = new Magnet("magnet5");
			m1.anlegen(Pol.MINUS, m2);
			m1.anlegen(Pol.PLUS, m3);
			m2.anlegen(Pol.MINUS, m4);
			m4.anlegen(Pol.MINUS, m5);
			System.out.println();
			System.out.println(m1);
			System.out.println(m1.getMinuspolMagnet());

		
	}
}
