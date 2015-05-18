package Jeu;

import Jeu.ProprieteAConstruire;
import java.util.ArrayList;

public class Groupe {
    private CouleurPropriete couleur;
    private int prixConstruction;
    private ArrayList<ProprieteAConstruire> proprietes = new ArrayList<ProprieteAConstruire>();
    
//------------------------------------------------------//
    private CouleurPropriete getCouleur() {
        return couleur;
    }

    private ArrayList<ProprieteAConstruire> getProprietes() {
        return proprietes;
    }

    private int getPrixConstruction() {
        return prixConstruction;
    }
//------------------------------------------------------//
    private void setCouleur(CouleurPropriete couleur) {
        this.couleur = couleur;
    }

    private void setProprietes(ArrayList<ProprieteAConstruire> proprietes) {
        this.proprietes = proprietes;
    }

    private void setPrixConstruction(int prixConstruction) {
        this.prixConstruction = prixConstruction;
    }
}