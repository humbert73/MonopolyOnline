package Jeu;

public class Compagnie extends CarreauPropriete {
    private int loyer;
//------------------------------------------------------//
    public Compagnie(int numero, String nomCarreau, Monopoly monopoly, int prixAchat, int loyerBase, int loyer){
        super(numero, nomCarreau, monopoly, prixAchat, loyerBase);
        this.loyer = loyer;
    }
//------------------------------------------------------//
    public int getLoyer() {
        return loyer;
    }
//------------------------------------------------------//
    public void setLoyer(int loyer) {
        this.loyer = loyer;
    }
}