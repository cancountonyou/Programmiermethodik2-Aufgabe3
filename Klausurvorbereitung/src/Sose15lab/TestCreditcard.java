package Sose15lab;

public class TestCreditcard {

	public static void main (String[] args){
		Creditcard c1 = new Creditcard("anna", 33);
		Creditcard c2 = new Creditcard("malte", 54);
		Creditcard c3 = new Creditcard("otto",33);
		
		System.out.println(c1.compareTo(c2));
		System.out.println(c1.compareTo(c3));
		System.out.println(c2.compareTo(c1));
	}
}
