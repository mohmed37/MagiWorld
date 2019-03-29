package main;

public class Main {
    public static void main(String[] arg) {
        Jeux jeux = new Jeux();
        jeux.joueur1();
        jeux.joueur2();
        while (jeux.vieJoueur1 > 0 && jeux.vieJoueur2 > 0) {
            jeux.choixAttaque1();
            jeux.choixAttaque2();
        }

    }
}