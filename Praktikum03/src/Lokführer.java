	import java.util.Observable;
	import java.util.Observer;
	
public class Lokführer extends Thread {



		private RangierBahnhof bahnhof;
		private String aufgabe;
		private Zug zug;
		
		public Lokführer(RangierBahnhof bahnhof) {
			this.bahnhof = bahnhof;
			if((Math.random() *10) >= 5){
				aufgabe = "Reinfahren";
			} else {
				aufgabe ="Rausfahren";
			}
		}
		
		public void run() {
			int gleisNummer = bahnhof.getGleisNummer();
			if(aufgabe.equals("Reinfahren")) {
				this.zug = bahnhof.erzeugeZug();
				bahnhof.einfahren(zug, gleisNummer);
			} else {
				bahnhof.ausfahren(gleisNummer);
			}
		}
		
		
		
}
