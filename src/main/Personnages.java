package main;

import java.util.Scanner;

public abstract class Personnages {
    private int niveau;
    private int vie;
    private int force;
    private int agilite;
    private int intelligence;
    private int dommage;
    private String nomAttaqueBasique;
    private String nomAttaqueSpesial;
    private String nonPersonnage;





    public Personnages() {
        vie=niveau*5;

    }

    public String getNonPersonnage(int nbpersonnage) {
        if(nbpersonnage==1){
            nonPersonnage="Guerrier";
        }
        if(nbpersonnage==2){
            nonPersonnage="Rôdeur";
        }
        if(nbpersonnage==3){
            nonPersonnage="Mage";
        }
        return nonPersonnage;
    }
    public String getNomAttaqueBasique() {
        return nomAttaqueBasique;
    }


    public void setNomAttaqueBasique(String nomAttaqueBasique) {
        this.nomAttaqueBasique = nomAttaqueBasique;
    }

    public String getNomAttaqueSpesial() {
        return nomAttaqueSpesial;
    }

    public void setNomAttaqueSpesial(String nomAttaqueSpesial) {
        this.nomAttaqueSpesial = nomAttaqueSpesial;
    }


    public int getNiveau() {
        Jeux jeux =new Jeux();


        return niveau;  }



    public void setNiveau(int niveau) {
        if(niveau>=1&&niveau<=100){
            this.niveau = niveau;
        }
        else {
            System.out.println("Erreur de saisie veuillez entrer un nombre entre 1 et 100");
            Scanner clavier=new Scanner(System.in);
            int nNiveau=clavier.nextInt();
            setNiveau(nNiveau);

        }}

    public int getVie() {

        return vie;

    }

    public void setVie(int vie) {

        this.vie = vie;


    }

    public int getForce() {

        return force;

    }

    public void setForce(int force) {

        if(force>=0&&force<=100&&force<=niveau){
            this.force = force;
        }
        if (force<0||force>100){
            System.out.println("Erreur de saisie veuilliez entrer un nombre entre 1 et 100");
            Scanner clavier=new Scanner(System.in);
            int nForce=clavier.nextInt();
            setForce(nForce);

        }else if(force>niveau){
            System.out.println("Erreur de saisie veulliez entrer un nombre plus petit ou égal à "+niveau);
            Scanner clavier=new Scanner(System.in);
            int nForce=clavier.nextInt();
            setForce(nForce);

        }
    }

    public int getAgilite() {

        return agilite;
    }

    public void setAgilite(int agilite) {
        if(agilite>=0&&agilite<=100&&(force+agilite)<=niveau){
            this.agilite = agilite;
        }
        if (agilite<0&&agilite>100){
            System.out.println("Erreur de saisie veuillez entrer un nombre entre 1 et 100");
            Scanner clavier=new Scanner(System.in);
            int nAgilite=clavier.nextInt();
            setAgilite(nAgilite);

        } else if((force+agilite)>niveau){
            System.out.println("Erreur de saisie veuillez entrer un nombre plus petit ou égal à "+(niveau-force));
            Scanner clavier=new Scanner(System.in);
            int nAgilite=clavier.nextInt();
            setAgilite(nAgilite);}

    }


    public int getIntelligence() {

        return intelligence;}




    public void setIntelligence(int intelligence) {

        if(intelligence>=0&&intelligence<=100&&(force+agilite+intelligence)==niveau){
            this.intelligence = intelligence;
        }
        if (intelligence<0&&intelligence>100){
            System.out.println("Erreur de saisie veuillez entrer un nombre entre 1 et 100");
            Scanner clavier=new Scanner(System.in);
            int nIntelligence=clavier.nextInt();
            setIntelligence(nIntelligence);

        } else if((force+agilite+intelligence)!=niveau){
            System.out.println("Erreur de saisie veuillez entrer un nombre  égal à "+(niveau-(force+agilite)));
            Scanner clavier=new Scanner(System.in);
            int nIntelligence=clavier.nextInt();
            setIntelligence(nIntelligence);
        }

    }




    public int getDommage() {
        return dommage;
    }

    public void setDommage(int dommage) {
        this.dommage = dommage;
    }


    public abstract void attaqueBasique(Personnages joueur2);

    public abstract void attaqueSpeciale(Personnages joueur2);
}

