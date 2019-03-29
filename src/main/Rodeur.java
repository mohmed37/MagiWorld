package main;


public class Rodeur extends Personnages {


    public Rodeur() {
        getVie();

    }

    /**
     *
     * @param joueur2: le personnage rodeur lance l'attaque basique sur le joueur 2 qui est l'adversaire
     */

    @Override
    public void attaqueBasique(Personnages joueur2) {
        joueur2.setVie(joueur2.getVie()-this.getAgilite());
        setDommage(this.getAgilite());
        setNomAttaqueBasique("Tir à l’Arc");
    }

    /**
     *
     * @param joueur2: le personnage rodeur lance l'attaque speciale sur le joueur 2 qui est l'adversaire
     */

    @Override
    public void attaqueSpeciale(Personnages joueur2) {
        this.setAgilite(this.getAgilite()+(getNiveau()/2));
        setDommage(this.getAgilite()+(getNiveau()/2));
        setNomAttaqueSpesial("Concentration");
    }




}
