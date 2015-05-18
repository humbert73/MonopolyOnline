package Jeu;

public abstract class Carreau {
    private int numero;
    private String nomCarreau;
    private Monopoly monopoly;
    
    public Carreau(int numero, String nomCarreau, Monopoly monopoly){
        this.monopoly = monopoly;
        this.nomCarreau = nomCarreau;
        this.numero = numero;
    }

    public void action() {
            throw new UnsupportedOperationException();
    }
//------------------------------------------------------//
    private int getNumero() {
        return numero;
    }

    private String getNomCarreau() {
        return nomCarreau;
    }

    private Monopoly getMonopoly() {
        return monopoly;
    }
//------------------------------------------------------//
    private void setNumero(int numero) {
        this.numero = numero;
    }

    private void setNomCarreau(String nomCarreau) {
        this.nomCarreau = nomCarreau;
    }

    private void setMonopoly(Monopoly monopoly) {
        this.monopoly = monopoly;
    }
}