package Jeu;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class Monopoly {
    private int nbMaisons = 32;
    private int nbHotels = 12;
    private HashMap<Integer,Carreau> carreaux;
    private ArrayList<Joueur> joueurs = new ArrayList<Joueur>();
    public Interface inter;
//------------------------------------------------------//
    public void jouerUnCoup(Joueur j) {
            throw new UnsupportedOperationException();
    }

    public void lancerDesAvancer() {
            throw new UnsupportedOperationException();
    }

    public int calculCase() {
            throw new UnsupportedOperationException();
    }

    public Carreau avancer(int nbCase) {
            throw new UnsupportedOperationException();
    }
    
    public Monopoly(String dataFilename){
            buildGamePlateau(dataFilename);
    }

    private void buildGamePlateau(String dataFilename){
        try{
            ArrayList<String[]> data = readDataFile(dataFilename, ",");

            //TODO: create cases instead of displaying
            for(int i=0; i<data.size(); ++i){
                String caseType = data.get(i)[0];
                
                if(caseType.compareTo("P") == 0){
                    ArrayList<Integer> l =  new ArrayList<>();
                    for(int e = 6; i < 11; i++){
                        int k = Integer.parseInt(data.get(i)[e]);
                        l.add(k);
                    }
                    Carreau c = new ProprieteAConstruire(i+1, data.get(i)[2], this, Integer.parseInt(data.get(i)[5]), Integer.parseInt(data.get(i)[6]), l);
                    System.out.println("Propriété :\t" + data.get(i)[2] + "\t@ case " + data.get(i)[1]);
                    this.carreaux.put(i, c);
                }
                else if(caseType.compareTo("G") == 0){
                    Carreau c = new Gare(i+1, data.get(i)[2], this, Integer.parseInt(data.get(i)[5]), Integer.parseInt(data.get(i)[6]));
                    System.out.println("Gare :\t" + data.get(i)[2] + "\t@ case " + data.get(i)[1]);
                }
                else if(caseType.compareTo("C") == 0){
                    Carreau c = new Compagnie(i+1, data.get(i)[2], this, Integer.parseInt(data.get(i)[5]), Integer.parseInt(data.get(i)[6]));
                    System.out.println("Compagnie :\t" + data.get(i)[2] + "\t@ case " + data.get(i)[1]);
                }
                else if(caseType.compareTo("CT") == 0){
                    Carreau c = new CarreauTirage(i+1, data.get(i)[2], this);
                    System.out.println("Case Tirage :\t" + data.get(i)[2] + "\t@ case " + data.get(i)[1]);
                }
                else if(caseType.compareTo("CA") == 0){
                    Carreau c = new CarreauArgent(i+1, data.get(i)[2], this, Integer.parseInt(data.get(i)[4]));
                    System.out.println("Case Argent :\t" + data.get(i)[2] + "\t@ case " + data.get(i)[1]);
                }
                else if(caseType.compareTo("CM") == 0){
                    Carreau c = new CarreauMouvement(i+1, data.get(i)[2], this);
                    System.out.println("Case Mouvement :\t" + data.get(i)[2] + "\t@ case " + data.get(i)[1]);
                }
                else
                    System.err.println("[buildGamePleateau()] : Invalid Data type");
            }

        } 
        catch(FileNotFoundException e){
                System.err.println("[buildGamePlateau()] : File is not found!");
        }
        catch(IOException e){
                System.err.println("[buildGamePlateau()] : Error while reading file!");
        }
    }

    private ArrayList<String[]> readDataFile(String filename, String token) throws FileNotFoundException, IOException {
        ArrayList<String[]> data = new ArrayList<String[]>();
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        String line = null;
        while((line = reader.readLine()) != null){
                data.add(line.split(token));
        }
        reader.close();
        return data;
    }
//------------------------------------------------------//
    public Carreau getCaseDepart(){
        return carreaux.get(1);
    }
    
    private int getNbMaisons() {
        return nbMaisons;
    }

    private int getNbHotels() {
        return nbHotels;
    }

    private HashMap<Integer,Carreau> getCarreaux() {
        return carreaux;
    }

    private ArrayList<Joueur> getJoueurs() {
        return joueurs;
    }

    private Interface getInterface() {
        return inter;
    }
//------------------------------------------------------//
    private void setNbMaisons(int nbMaisons) {
        this.nbMaisons = nbMaisons;
    }

    private void setNbHotels(int nbHotels) {
        this.nbHotels = nbHotels;
    }

    private void setCarreaux(HashMap<Integer,Carreau> carreaux) {
        this.carreaux = carreaux;
    }

    private void setJoueurs(ArrayList<Joueur> joueurs) {
        this.joueurs = joueurs;
    }

    private void setInterface(Interface inter) {
        this.inter = inter;
    }
}

