import java.util.ArrayList;

public class Joueur {
	private String nomJoueur;
	private int cash = 1500;
	private Monopoly monopoly;
	private ArrayList<Compagnie> compagnies = new ArrayList<Compagnie>();
	private ArrayList<Gare> gares = new ArrayList<Gare>();
	private Carreau positionCourante;
	private ArrayList<ProprieteAConstruire> proprietesAConstruire = new ArrayList<ProprieteAConstruire>();

	public void payerLoyer(Object loyer) {
		throw new UnsupportedOperationException();
	}

	public void recevoirLoyer(Object loyer) {
		throw new UnsupportedOperationException();
	}

	public String getNomJoueur() {
		return this.nomJoueur;
	}

	public int getCash() {
		return this.cash;
	}

	public int getNBGares() {
		throw new UnsupportedOperationException();
	}
}