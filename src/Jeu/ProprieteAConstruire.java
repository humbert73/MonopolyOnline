package Jeu;

import java.util.ArrayList;
import java.util.HashMap;

public class ProprieteAConstruire extends CarreauPropriete {
    private int nbConstructions;
    private HashMap<Integer, Integer> loyers;
    private Groupe groupePropriete;
//------------------------------------------------------//
    public ProprieteAConstruire(int numero, String nomCarreau, Monopoly monopoly, int prixAchat, int loyerBase, ArrayList<Integer> l){
        super(numero, nomCarreau, monopoly, prixAchat, loyerBase);
        this.nbConstructions = 0;
        loyers = new HashMap<>();
        int i = 0;
        for(Integer loy : l){
            i++;
            loyers.put(i, loy);
        }
    }
//------------------------------------------------------//
    private int getNbConstructions() {
        return nbConstructions;
    }

    private HashMap<Integer, Integer> getLoyers() {
        return loyers;
    }

    private Groupe getGroupePropriete() {
        return groupePropriete;
    }
//------------------------------------------------------//
    private void setNbConstructions(int nbConstructions) {
        this.nbConstructions = nbConstructions;
    }

    private void setLoyers(HashMap<Integer, Integer> loyers) {
        this.loyers = loyers;
    }

    private void setGroupePropriete(Groupe groupePropriete) {
        this.groupePropriete = groupePropriete;
    }
}