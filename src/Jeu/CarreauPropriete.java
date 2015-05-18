public abstract class CarreauPropriete extends Carreau {
	private int prixAchat;
	private int loyerBase;
	private Joueur proprietaire;

	public Joueur getProprietaire() {
		return this.proprietaire;
	}

	public void achatPropriete() {
		throw new UnsupportedOperationException();
	}

	public void calculLoyer() {
		throw new UnsupportedOperationException();
	}

	public int calculArgentRestant(int cash, int l) {
		throw new UnsupportedOperationException();
	}
}