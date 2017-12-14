package laborsose16;

import java.util.LinkedList;
import java.util.List;

public class DvdSammlung {
	private Dvd[] dvds;
	private int anzahlDvds;

	public DvdSammlung(int laenge) {
		anzahlDvds = 0;
		dvds = new Dvd[laenge];
	}

	public int getAnzahlDvds() {
		return anzahlDvds;
	}

	public void dvdHinzufuegen(Dvd anhang) throws IllegalArgumentException {
		for (int i = 0; i < dvds.length; i++) {
			if (dvds[i] == null) {
				dvds[i] = anhang;
				return;
			}
		}
		throw new IllegalArgumentException("Sammlung voll");
	}

	public Dvd getDvd(int index) throws IllegalArgumentException {
		if (index >= dvds.length) {
			throw new IllegalArgumentException("Ungültiger Dvd-Index");
		}
		return dvds[index];
	}

	public Dvd getDvd(String gesuchtertitel) {
		for (Dvd dvd : dvds) {
			if (dvd.getTitel() == gesuchtertitel) {
				return dvd;
			}
		}
		return null;
	}

	public int getLaufzeitInSamllung() {
		int gesamtLaufzeit = 0;
		for (Dvd dvd : dvds) {
			gesamtLaufzeit += dvd.getLaufzeit();
		}
		return gesamtLaufzeit;
	}

	public List<Dvd> getDvdsBisAlter(int alter) {
		List<Dvd> altersListe = new LinkedList<Dvd>();
		for (Dvd dvd : dvds) {
			if (dvd.getAltersfreigabe() <= alter) {
				altersListe.add(dvd);
			}
		}
	return altersListe;
	}
}
