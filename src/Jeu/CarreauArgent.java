package Jeu;

public class CarreauArgent extends CarreauAction {
    private int montant;
    
    public CarreauArgent(int numero, String nomCarreau, Monopoly monopoly, int montant){
        super(numero, nomCarreau, monopoly);
        this.montant = montant;
    }
//------------------------------------------------------//
    private int getMontant() {
        return montant;
    }
//------------------------------------------------------//
    private void setMontant(int montant) {
        this.montant = montant;
    }
}