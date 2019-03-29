package main;

public class Guerrier extends Personnages{

    /**
     *
     * @param joueur2: le personnage guerrier lance l'attaque basique sur le joueur 2 qui est l'adversaire
     */

    @Override
    public void attaqueBasique( Personnages joueur2){
        joueur2.setVie((joueur2.getVie())-(this.getForce()));
        setDommage(this.getForce());
        setNomAttaqueBasique("Coup d’Épée");



    }
    /**
     *
     * @param joueur2: le personnage guerrier lance l'attaque speciale sur le joueur 2 qui est l'adversaire
     */

    @Override
    public void attaqueSpeciale(Personnages joueur2){
        joueur2.setVie(joueur2.getVie()-((this.getForce())*2));
        joueur2.setDommage(((this.getForce())*2));
        this.setVie(this.getVie()-(this.getForce()/2));
        this.setDommage((this.getForce()/2));


        setNomAttaqueSpesial("Coup de Rage");


    }





}

