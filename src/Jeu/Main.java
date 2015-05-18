package Jeu;

public class Main {

    public static void main(String[] args) {
            Interface inter = new Interface("/users/info/etu-s2/hermentj/M2104/Projet_Monopoly/Monopoly/src/data/data.txt");
            Joueur j1 = new Joueur("J1", Interface.getMonopoly());
    }
}