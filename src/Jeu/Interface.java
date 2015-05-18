package Jeu;

public class Interface {
    public static Monopoly monopoly;
//------------------------------------------------------//
    public void messageEtatJoueur(Joueur j) {
        throw new UnsupportedOperationException();
    }
    
    public Interface(String dataFilename){
        monopoly = new Monopoly(dataFilename);
    }
//------------------------------------------------------//
    public static Monopoly getMonopoly() {
        return monopoly;
    }
//------------------------------------------------------//
    private void setMonopoly(Monopoly monopoly) {
        this.monopoly = monopoly;
    }
}