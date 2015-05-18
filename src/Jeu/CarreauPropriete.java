package Jeu;

public abstract class CarreauPropriete extends Carreau {
    private int prixAchat;
    private int loyerBase;
    private Joueur proprietaire;
//------------------------------------------------------//
    public CarreauPropriete(int numero, String nomCarreau, Monopoly monopoly, int prixAchat, int loyerBase){
        super(numero, nomCarreau, monopoly);
        this.prixAchat = prixAchat;
        this.loyerBase = loyerBase;
        this.proprietaire = null;
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
//------------------------------------------------------//
    public Joueur getProprietaire() {
            return this.proprietaire;
    }

    private int getPrixAchat() {
        return prixAchat;
    }

    private int getLoyerBase() {
        return loyerBase;
    }
//------------------------------------------------------//
    private void setPrixAchat(int prixAchat) {
        this.prixAchat = prixAchat;
    }

    private void setLoyerBase(int loyerBase) {
        this.loyerBase = loyerBase;
    }
}