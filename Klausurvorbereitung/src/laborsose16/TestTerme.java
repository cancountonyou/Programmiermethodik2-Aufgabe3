package laborsose16;

import laborsose16.ZusammengesetzerTerm.Grundrechenart;

public class TestTerme {
	public static void main(String[] args){
ZahlTerm z1 = new ZahlTerm(3.1234);
System.out.println(z1);


System.out.println(new ZusammengesetzerTerm(Grundrechenart.GETEILT, new ZahlTerm(6), new ZahlTerm(3)).getWert());

}}