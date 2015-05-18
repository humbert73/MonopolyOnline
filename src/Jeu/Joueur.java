package Jeu;

import Jeu.ProprieteAConstruire;
import java.util.ArrayList;

public class Joueur {
    private String nomJoueur;
    private int cash = 1500;
    private Monopoly monopoly;
    private ArrayList<Compagnie> compagnies = new ArrayList<Compagnie>();
    private ArrayList<Gare> gares = new ArrayList<Gare>();
    private Carreau positionCourante;
    private ArrayList<ProprieteAConstruire> proprietesAConstruire = new ArrayList<ProprieteAConstruire>();
//------------------------------------------------------//
    public Joueur(String nomJoueur, Monopoly monopoly){
        this.nomJoueur = nomJoueur;
        this.monopoly = monopoly;
        this.positionCourante = monopoly.getCaseDepart();
        
    }
    
    public void payerLoyer(Object loyer) {
        throw new UnsupportedOperationException();
    }

    public void recevoirLoyer(Object loyer) {
        throw new UnsupportedOperationException();
    }
//------------------------------------------------------//
    private String getNomJoueur() {
        return this.nomJoueur;
    }

    private int getCash() {
        return this.cash;
    }

    private int getNBGares() {
        throw new UnsupportedOperationException();
    }

    private Monopoly getMonopoly() {
        return monopoly;
    }

    private ArrayList<Compagnie> getCompagnies() {
        return compagnies;
    }

    private ArrayList<Gare> getGares() {
        return gares;
    }

    private Carreau getPositionCourante() {
        return positionCourante;
    }

    private ArrayList<ProprieteAConstruire> getProprietesAConstruire() {
        return proprietesAConstruire;
    }
//------------------------------------------------------//
    private void setMonopoly(Monopoly monopoly) {
        this.monopoly = monopoly;
    }

    private void setCompagnies(ArrayList<Compagnie> compagnies) {
        this.compagnies = compagnies;
    }

    private void setGares(ArrayList<Gare> gares) {
        this.gares = gares;
    }

    private void setPositionCourante(Carreau positionCourante) {
        this.positionCourante = positionCourante;
    }

    private void setProprietesAConstruire(ArrayList<ProprieteAConstruire> proprietesAConstruire) {
        this.proprietesAConstruire = proprietesAConstruire;
    }
}