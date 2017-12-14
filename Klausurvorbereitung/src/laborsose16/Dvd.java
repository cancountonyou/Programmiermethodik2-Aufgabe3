package laborsose16;

public class Dvd {
private String titel;
private int laufzeit;
private int altersfreigabe;

public Dvd(String titel, int laufzeit, int altersfreigabe){
	this.titel = titel;
	this.laufzeit = laufzeit;
	this.altersfreigabe = altersfreigabe;
}

public String getTitel() {
	return titel;
}

public int getLaufzeit() {
	return laufzeit;
}

public int getAltersfreigabe() {
	return altersfreigabe;
}
public String toString(){
	return titel + " " +"(" + laufzeit + ","+" " + altersfreigabe + ")";
}
}
