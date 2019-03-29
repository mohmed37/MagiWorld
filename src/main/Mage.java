package main;


public class Mage extends Personnages {
    /**
     *
     * @param joueur2: le personnage mage lance l'attaque basique sur le joueur 2 qui est l'adversaire
     */


    @Override
    public void attaqueBasique(Personnages joueur2) {
        joueur2.setVie(joueur2.getVie() - this.getIntelligence());
        setDommage(this.getIntelligence());
        setNomAttaqueBasique("Boule de Feu ");
    }
    /**
     *
     * @param joueur2: le personnage mage lance l'attaque speciale sur le joueur 2 qui est l'adversaire
     */


    @Override
    public void attaqueSpeciale(Personnages joueur2) {
        this.setVie(this.getVie() + (this.getIntelligence() * 2));
        setDommage((this.getIntelligence() * 2));
        setNomAttaqueSpesial("Soin");
    }


}
