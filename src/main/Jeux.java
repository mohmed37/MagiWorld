package main;


import java.util.InputMismatchException;
import java.util.Scanner;



public class Jeux {
    Scanner clavier = new Scanner(System.in);
    private int joueur[] = new int[2];
    private int choixPersonnageJoueur1;
    private int choixPersonnageJoueur2;
    public int vieJoueur1;
    public int vieJoueur2;


    Personnages guerrier1 = new Guerrier();
    Personnages rodeur1 = new Rodeur();
    Personnages mage1 = new Mage();
    Personnages guerrier2 = new Guerrier();
    Personnages rodeur2 = new Rodeur();
    Personnages mage2 = new Mage();

    /**
     * Choix du personnage pour le joueur 1.
     */

    public void joueur1() {

        System.out.println("Création du personnage du Joueur 1");
        System.out.println("Veuillez choisir la classe de votre personnage (1 : Guerrier, 2 : Rôdeur, 3 : Mage)");
        try {
            choixPersonnageJoueur1 = clavier.nextInt();
            if (choixPersonnageJoueur1 == 1) {
                System.out.println("Niveau du personnage ?");
                guerrier1.setNiveau(clavier.nextInt());
                guerrier1.setVie(guerrier1.getNiveau() * 5);
                System.out.println("Force du personnage ?");
                guerrier1.setForce(clavier.nextInt());
                System.out.println("Agilité du personnage ?");
                guerrier1.setAgilite(clavier.nextInt());
                System.out.println("Intelligence du personnage ?");
                guerrier1.setIntelligence(clavier.nextInt());
                System.out.println(" Je suis le " + guerrier1.getNonPersonnage(1) + " Joueur 1  niveau " + guerrier1.getNiveau() + " je possède "
                        + guerrier1.getVie() + " de vitalité, " + guerrier1.getForce() + " de force, " + guerrier1.getAgilite() + " d'agilité et " + guerrier1.getIntelligence() +
                        " d'intelligence !");
                vieJoueur1 = guerrier1.getVie();
            } else if (choixPersonnageJoueur1 == 2) {
                System.out.println("Niveau du personnage ?");
                rodeur1.setNiveau(clavier.nextInt());
                rodeur1.setVie(rodeur1.getNiveau() * 5);
                System.out.println("Force du personnage ?");
                rodeur1.setForce(clavier.nextInt());
                System.out.println("Agilité du personnage ?");
                rodeur1.setAgilite(clavier.nextInt());
                System.out.println("Intelligence du personnage ?");
                rodeur1.setIntelligence(clavier.nextInt());
                System.out.println("Je suis le " + rodeur1.getNonPersonnage(2) + " Joueur 1 niveau " + rodeur1.getNiveau() + " je possède "
                        + rodeur1.getVie() + " de vitalité, " + rodeur1.getForce() + " de force, " + rodeur1.getAgilite() + " d'agilité et " + rodeur1.getIntelligence() +
                        " d'intelligence !");
                vieJoueur1 = rodeur1.getVie();
            } else if (choixPersonnageJoueur1 == 3) {
                System.out.println("Niveau du personnage ?");
                mage1.setNiveau(clavier.nextInt());
                mage1.setVie(mage1.getNiveau() * 5);
                System.out.println("Force du personnage ?");
                mage1.setForce(clavier.nextInt());
                System.out.println("Agilité du personnage ?");
                mage1.setAgilite(clavier.nextInt());
                System.out.println("Intelligence du personnage ?");
                mage1.setIntelligence(clavier.nextInt());
                System.out.println("Je suis le " + mage1.getNonPersonnage(3) + " Joueur 1 niveau " + mage1.getNiveau() + " je possède "
                        + mage1.getVie() + " de vitalité, " + mage1.getForce() + " de force, " + mage1.getAgilite() + " d'agilité et " + mage1.getIntelligence() +
                        " d'intelligence !");
                vieJoueur1 = mage1.getVie();


            } else {
                System.out.println("Vous n'avez pas choisi parmis les choix proposés");
                clavier = new Scanner(System.in);
                joueur1();

            }
        } catch (InputMismatchException e) {
            clavier = new Scanner(System.in);
            System.out.println("Erreur de saisie");
            joueur1();
        }

    }

    /**
     * Choix du personnage pour le joueur 2.
     */

    public void joueur2() {



        System.out.println("Création du personnage du Joueur 2");
        System.out.println("Veuillez choisir la classe de votre personnage (1 : Guerrier, 2 : Rôdeur, 3 : Mage)");
        try {
            choixPersonnageJoueur2 = clavier.nextInt();


            if (choixPersonnageJoueur2 == 1) {
                System.out.println("Niveau du personnage ?");
                guerrier2.setNiveau(clavier.nextInt());
                guerrier2.setVie(guerrier2.getNiveau() * 5);
                System.out.println("Force du personnage ?");
                guerrier2.setForce(clavier.nextInt());
                System.out.println("Agilité du personnage ?");
                guerrier2.setAgilite(clavier.nextInt());
                System.out.println("Intelligence du personnage ?");
                guerrier2.setIntelligence(clavier.nextInt());
                System.out.println(" Je suis le " + guerrier2.getNonPersonnage(1) + " Joueur 2  niveau " + guerrier2.getNiveau() + " je possède "
                        + guerrier2.getVie() + " de vitalité, " + guerrier2.getForce() + " de force, " + guerrier2.getAgilite() + " d'agilité et " + guerrier2.getIntelligence() +
                        " d'intelligence !");
                vieJoueur2 = guerrier2.getVie();

            } else if (choixPersonnageJoueur2 == 2) {
                System.out.println("Niveau du personnage ?");
                rodeur2.setNiveau(clavier.nextInt());
                rodeur2.setVie(rodeur2.getNiveau() * 5);
                System.out.println("Force du personnage ?");
                rodeur2.setForce(clavier.nextInt());
                System.out.println("Agilité du personnage ?");
                rodeur2.setAgilite(clavier.nextInt());
                System.out.println("Intelligence du personnage ?");
                rodeur2.setIntelligence(clavier.nextInt());
                System.out.println("Je suis le " + rodeur2.getNonPersonnage(2) + " Joueur 2 niveau " + rodeur2.getNiveau() + " je possède "
                        + rodeur2.getVie() + " de vitalité, " + rodeur2.getForce() + " de force, " + rodeur2.getAgilite() + " d'agilité et " + rodeur2.getIntelligence() +
                        " d'intelligence !");
                vieJoueur2 = rodeur2.getVie();

            } else if (choixPersonnageJoueur2 == 3) {
                System.out.println("Niveau du personnage ?");
                mage2.setNiveau(clavier.nextInt());
                mage2.setVie(mage2.getNiveau() * 5);
                System.out.println("Force du personnage ?");
                mage2.setForce(clavier.nextInt());
                System.out.println("Agilité du personnage ?");
                mage2.setAgilite(clavier.nextInt());
                System.out.println("Intelligence du personnage ?");
                mage2.setIntelligence(clavier.nextInt());
                System.out.println("Je suis le " + mage2.getNonPersonnage(3) + " Joueur 2 niveau " + mage2.getNiveau() + " je possède "
                        + mage2.getVie() + " de vitalité, " + mage2.getForce() + " de force, " + mage2.getAgilite() + " d'agilité et " + mage2.getIntelligence() +
                        " d'intelligence !");
                vieJoueur2 = mage2.getVie();

            } else {
                System.out.println("Vous n'avez pas choisi parmis les choix proposés");
                clavier = new Scanner(System.in);
                joueur2();
            }
        } catch (InputMismatchException e) {
            clavier = new Scanner(System.in);
            System.out.println("Erreur de saisie");
            joueur2();
        }

    }

    /**
     * Choix de l'attaque  pour le joueur 1
     */

    public void choixAttaque1() {

        System.out.println("Joueur 1 (" + vieJoueur1 + " Vitalité) veuillez choisir votre action(1 : Attaque Basique, 2 : Attaque Spéciale)");
        try {

            int choixAttaque1 = clavier.nextInt();
            if (choixAttaque1 == 1) {
                if (choixPersonnageJoueur1 == 1 && choixPersonnageJoueur2 == 1) {
                    guerrier1.attaqueBasique(guerrier2);
                    System.out.println("Joueur 1 utilise " + guerrier1.getNomAttaqueBasique() + " et inflige " + guerrier1.getDommage() + " dommage");
                    System.out.println("Joueur 2 perd " + guerrier1.getDommage() + " points de vie");
                    vieJoueur2 = guerrier2.getVie();
                    if (vieJoueur2 == 0) {
                        System.out.println("Joueur 2 est mort");
                    }
                } else if (choixPersonnageJoueur1 == 1 && choixPersonnageJoueur2 == 2) {
                    guerrier1.attaqueBasique(rodeur2);
                    System.out.println("Joueur 1 utilise " + guerrier1.getNomAttaqueBasique() + " et inflige " + guerrier1.getDommage() + " dommage");
                    System.out.println("Joueur 2 perd " + guerrier1.getDommage() + " points de vie");
                    vieJoueur2 = rodeur2.getVie();
                    if (vieJoueur2 == 0) {
                        System.out.println("Joueur 2 est mort");
                    }
                } else if (choixPersonnageJoueur1 == 1 && choixPersonnageJoueur2 == 3) {
                    guerrier1.attaqueBasique(mage2);
                    System.out.println("Joueur 1 utilise " + guerrier1.getNomAttaqueBasique() + " et inflige " + guerrier1.getDommage() + " dommage");
                    System.out.println("Joueur 2 perd " + guerrier1.getDommage() + " points de vie");
                    vieJoueur2 = mage2.getVie();
                    if (vieJoueur2 == 0) {
                        System.out.println("Joueur 2 est mort");
                    }
                } else if (choixPersonnageJoueur1 == 2 && choixPersonnageJoueur2 == 1) {
                    rodeur1.attaqueBasique(guerrier2);
                    System.out.println("Joueur 1 utilise " + rodeur1.getNomAttaqueBasique() + " et inflige " + rodeur1.getDommage() + " dommage");
                    System.out.println("Joueur 2 perd " + rodeur1.getDommage() + " points de vie");
                    vieJoueur2 = guerrier2.getVie();
                    if (vieJoueur2 == 0) {
                        System.out.println("Joueur 2 est mort");
                    }
                } else if (choixPersonnageJoueur1 == 2 && choixPersonnageJoueur2 == 2) {
                    rodeur1.attaqueBasique(rodeur2);
                    System.out.println("Joueur 1 utilise " + rodeur1.getNomAttaqueBasique() + " et inflige " + rodeur1.getDommage() + " dommage");
                    System.out.println("Joueur 2 perd " + rodeur1.getDommage() + " points de vie");
                    vieJoueur2 = guerrier2.getVie();
                    vieJoueur2 = rodeur2.getVie();
                    if (vieJoueur2 == 0) {
                        System.out.println("Joueur 2 est mort");
                    }
                } else if (choixPersonnageJoueur1 == 2 && choixPersonnageJoueur2 == 3) {
                    rodeur1.attaqueBasique(mage2);
                    System.out.println("Joueur 1 utilise " + rodeur1.getNomAttaqueBasique() + " et inflige " + rodeur1.getDommage() + " dommage");
                    System.out.println("Joueur 2 perd " + rodeur1.getDommage() + " points de vie");
                    vieJoueur2 = guerrier2.getVie();
                    vieJoueur2 = mage2.getVie();
                    if (vieJoueur2 == 0) {
                        System.out.println("Joueur 2 est mort");
                    }
                } else if (choixPersonnageJoueur1 == 3 && choixPersonnageJoueur2 == 1) {
                    mage1.attaqueBasique(guerrier2);
                    System.out.println("Joueur 1 utilise " + mage1.getNomAttaqueBasique() + " et inflige " + mage1.getDommage() + " dommage");
                    System.out.println("Joueur 2 perd " + mage1.getDommage() + " points de vie");
                    vieJoueur2 = guerrier2.getVie();
                    if (vieJoueur2 == 0) {
                        System.out.println("Joueur 2 est mort");
                    }

                } else if (choixPersonnageJoueur1 == 3 && choixPersonnageJoueur2 == 2) {
                    mage1.attaqueBasique(rodeur2);
                    System.out.println("Joueur 1 utilise " + mage1.getNomAttaqueBasique() + " et inflige " + mage1.getDommage() + " dommage");
                    System.out.println("Joueur 2 perd " + mage1.getDommage() + " points de vie");
                    vieJoueur2 = rodeur2.getVie();
                    if (vieJoueur2 == 0) {
                        System.out.println("Joueur 2 est mort");
                    }
                } else if (choixPersonnageJoueur1 == 3 && choixPersonnageJoueur2 == 3) {
                    mage1.attaqueBasique(mage2);
                    System.out.println("Joueur 1 utilise " + mage1.getNomAttaqueBasique() + " et inflige " + mage1.getDommage() + " dommage");
                    System.out.println("Joueur 2 perd " + mage1.getDommage() + " points de vie");
                    vieJoueur2 = mage2.getVie();
                    if (vieJoueur2 == 0) {
                        System.out.println("Joueur 2 est mort");
                    }
                }
            }
            else if (choixAttaque1 == 2) {
                if (choixPersonnageJoueur1 == 1 && choixPersonnageJoueur2 == 1) {
                    guerrier1.attaqueSpeciale(guerrier2);
                    System.out.println("Joueur 1 utilise " + guerrier1.getNomAttaqueSpesial() + " et inflige " + guerrier2.getDommage() + " dommage");
                    System.out.println("Joueur 2 perd " + guerrier2.getDommage() + " points de vie");
                    vieJoueur2 = guerrier2.getVie();
                    if (vieJoueur2 == 0) {
                        System.out.println("Joueur 2 est mort");
                    }
                    System.out.println("Joueur 1 perd " + guerrier1.getDommage() + " points de vie");


                } else if (choixPersonnageJoueur1 == 1 && choixPersonnageJoueur2 == 2) {
                    guerrier1.attaqueSpeciale(rodeur2);
                    System.out.println("Joueur 1 utilise " + guerrier1.getNomAttaqueSpesial() + " et inflige " + rodeur2.getDommage() + " dommage");
                    System.out.println("Joueur 2 perd " + rodeur2.getDommage() + " points de vie");
                    vieJoueur2 = rodeur2.getVie();
                    if (vieJoueur2 == 0) {
                        System.out.println("Joueur 2 est mort");
                    }
                    System.out.println("Joueur 1 perd " + guerrier1.getDommage() + " points de vie");


                } else if (choixPersonnageJoueur1 == 1 && choixPersonnageJoueur2 == 3) {
                    guerrier1.attaqueSpeciale(mage2);
                    System.out.println("Joueur 1 utilise " + guerrier1.getNomAttaqueSpesial() + " et inflige " + mage2.getDommage() + " dommage");
                    System.out.println("Joueur 2 perd " + mage2.getDommage() + " points de vie");
                    vieJoueur2 = mage2.getVie();
                    if (vieJoueur2 == 0) {
                        System.out.println("Joueur 2 est mort");
                    }
                    System.out.println("Joueur 1 perd " + guerrier1.getDommage() + " points de vie");


                } else if (choixPersonnageJoueur1 == 2 && choixPersonnageJoueur2 == 1) {
                    rodeur1.attaqueSpeciale(guerrier2);
                    System.out.println("Joueur 1 utilise " + rodeur1.getNomAttaqueSpesial() + " et inflige " + rodeur1.getDommage() + " dommage");
                    System.out.println("Joueur 2 perd " + rodeur1.getDommage() + " points de vie");
                    vieJoueur2 = guerrier2.getVie();
                    if (vieJoueur2 == 0) {
                        System.out.println("Joueur 2 est mort");
                    }
                } else if (choixPersonnageJoueur1 == 2 && choixPersonnageJoueur2 == 2) {
                    rodeur1.attaqueSpeciale(rodeur2);
                    System.out.println("Joueur 1 utilise " + rodeur1.getNomAttaqueSpesial() + " et inflige " + rodeur1.getDommage() + " dommage");
                    System.out.println("Joueur 2 perd " + rodeur1.getDommage() + " points de vie");
                    vieJoueur2 = rodeur2.getVie();
                    if (vieJoueur2 == 0) {
                        System.out.println("Joueur 2 est mort");
                    }
                } else if (choixPersonnageJoueur1 == 2 && choixPersonnageJoueur2 == 3) {
                    rodeur1.attaqueSpeciale(mage2);
                    System.out.println("Joueur 1 utilise " + rodeur1.getNomAttaqueSpesial() + " et inflige " + rodeur1.getDommage() + " dommage");
                    System.out.println("Joueur 2 perd " + rodeur1.getDommage() + " points de vie");
                    vieJoueur2 = mage2.getVie();
                    if (vieJoueur2 == 0) {
                        System.out.println("Joueur 2 est mort");
                    }
                } else if (choixPersonnageJoueur1 == 3 && choixPersonnageJoueur2 == 1) {
                    mage1.attaqueSpeciale(guerrier2);
                    System.out.println("Joueur 1 utilise " + mage1.getNomAttaqueSpesial() + " et gagne " + mage1.getDommage() + " en vitalité");
                    vieJoueur2 = guerrier2.getVie();

                } else if (choixPersonnageJoueur1 == 3 && choixPersonnageJoueur2 == 2) {
                    mage1.attaqueSpeciale(rodeur2);
                    System.out.println("Joueur 1 utilise " + mage1.getNomAttaqueSpesial() + " et  gagne " + mage1.getDommage() + " en vitalité");
                    vieJoueur2 = rodeur2.getVie();
                } else if (choixPersonnageJoueur1 == 3 && choixPersonnageJoueur2 == 3) {
                    mage1.attaqueSpeciale(mage2);
                    System.out.println("Joueur 1 utilise " + mage1.getNomAttaqueSpesial() + " et  gagne " + mage1.getDommage() + " en vitalité");
                    vieJoueur2 = mage2.getVie();
                }


            }else {
                System.out.println("Vous n'avez pas choisi parmis les choix proposés");
                clavier = new Scanner(System.in);
                choixAttaque1();
            }
        } catch (InputMismatchException e) {
            clavier = new Scanner(System.in);
            System.out.println("Erreur de saisie");
            choixAttaque1();
        }
        if (vieJoueur2 == 0) {
            System.out.println("Joueur 2 a perdu !");
            System.exit(0);
        }


    }
    /**
     * Choix de l'attaque  pour le joueur 2.
     */
    public void choixAttaque2(){
        System.out.println("Joueur 2 (" + vieJoueur2 + " Vitalité) veuillez choisir votre action(1 : Attaque Basique, 2 : Attaque Spéciale)");
        try {
            int choixAttaque2 = clavier.nextInt();
            if (choixAttaque2 == 1) {
                if (choixPersonnageJoueur2 == 1 && choixPersonnageJoueur1 == 1) {
                    guerrier2.attaqueBasique(guerrier1);
                    System.out.println("Joueur 2 utilise " + guerrier2.getNomAttaqueBasique() + " et inflige " + guerrier2.getDommage() + " dommage");
                    System.out.println("Joueur 1 perd " + guerrier2.getDommage() + " points de vie");
                    vieJoueur1 = guerrier1.getVie();
                    if (vieJoueur1 == 0) {
                        System.out.println("Joueur 1 est mort");
                    }
                } else if (choixPersonnageJoueur2 == 1 && choixPersonnageJoueur1 == 2) {
                    guerrier2.attaqueBasique(rodeur1);
                    System.out.println("Joueur 2 utilise " + guerrier2.getNomAttaqueBasique() + " et inflige " + guerrier2.getDommage() + "   dommage");
                    System.out.println("Joueur 1 perd " + guerrier2.getDommage() + " points de vie");
                    vieJoueur1 = rodeur1.getVie();
                    if (vieJoueur1 == 0) {
                        System.out.println("Joueur 1 est mort");
                    }
                } else if (choixPersonnageJoueur2 == 1 && choixPersonnageJoueur1 == 3) {
                    guerrier2.attaqueBasique(mage1);
                    System.out.println("Joueur 2 utilise " + guerrier2.getNomAttaqueBasique() + " et inflige " + guerrier2.getDommage() + "  dommage");
                    System.out.println("Joueur 2 perd " + guerrier2.getDommage() + " points de vie");
                    vieJoueur1 = mage1.getVie();
                    if (vieJoueur1 == 0) {
                        System.out.println("Joueur 1 est mort");
                    }

                } else if (choixPersonnageJoueur2 == 2 && choixPersonnageJoueur1 == 1) {
                    rodeur2.attaqueBasique(guerrier1);
                    System.out.println("Joueur 2 utilise " + rodeur2.getNomAttaqueBasique() + " et inflige " + rodeur2.getDommage() + "  dommage");
                    System.out.println("Joueur 1 perd " + rodeur2.getDommage() + " points de vie");
                    vieJoueur1 = guerrier1.getVie();
                    if (vieJoueur1 == 0) {
                        System.out.println("Joueur 1 est mort");
                    }
                } else if (choixPersonnageJoueur2 == 2 && choixPersonnageJoueur1 == 2) {
                    rodeur2.attaqueBasique(rodeur1);
                    System.out.println("Joueur 2 utilise " + rodeur2.getNomAttaqueBasique() + " et inflige " + rodeur2.getDommage() + "  dommage");
                    System.out.println("Joueur 1 perd " + rodeur2.getDommage() + " points de vie");
                    vieJoueur1 = rodeur1.getVie();
                    if (vieJoueur1 == 0) {
                        System.out.println("Joueur 1 est mort");
                    }
                } else if (choixPersonnageJoueur2 == 2 && choixPersonnageJoueur1 == 3) {
                    rodeur2.attaqueBasique(mage1);
                    System.out.println("Joueur 2 utilise " + rodeur2.getNomAttaqueBasique() + " et inflige " + rodeur2.getDommage() + "  dommage");
                    System.out.println("Joueur 1 perd " + rodeur2.getDommage() + " points de vie");
                    vieJoueur1 = mage1.getVie();
                    if (vieJoueur1 == 0) {
                        System.out.println("Joueur 1 est mort");
                    }
                } else if (choixPersonnageJoueur2 == 3 && choixPersonnageJoueur1 == 1) {
                    mage2.attaqueBasique(guerrier1);
                    System.out.println("Joueur 2 utilise " + mage2.getNomAttaqueBasique() + " et inflige " + mage2.getDommage() + " dommage");
                    System.out.println("Joueur 1 perd " + mage2.getDommage() + " points de vie");
                    vieJoueur1 = guerrier1.getVie();
                    if (vieJoueur1 == 0) {
                        System.out.println("Joueur 1 est mort");
                    }
                } else if (choixPersonnageJoueur2 == 3 && choixPersonnageJoueur1 == 2) {
                    mage2.attaqueBasique(rodeur1);
                    System.out.println("Joueur 2 utilise " + mage2.getNomAttaqueBasique() + " et inflige " + mage2.getDommage() + " dommage");
                    System.out.println("Joueur 1 perd " + mage2.getDommage() + " points de vie");
                    vieJoueur1 = rodeur1.getVie();
                    if (vieJoueur1 == 0) {
                        System.out.println("Joueur 1 est mort");
                    }
                } else if (choixPersonnageJoueur2 == 3 && choixPersonnageJoueur1 == 3) {
                    mage2.attaqueBasique(mage1);
                    System.out.println("Joueur 2 utilise " + mage2.getNomAttaqueBasique() + " et inflige " + mage2.getDommage() + " dommage");
                    System.out.println("Joueur 1 perd " + mage2.getDommage() + " points de vie");
                    vieJoueur1 = mage1.getVie();
                    if (vieJoueur1 == 0) {
                        System.out.println("Joueur 1 est mort");
                    }
                }
            }


            else if (choixAttaque2 == 2) {
                if (choixPersonnageJoueur2 == 1 && choixPersonnageJoueur1 == 1) {
                    guerrier2.attaqueSpeciale(guerrier1);
                    System.out.println("Joueur 2 utilise " + guerrier1.getNomAttaqueSpesial() + " et inflige " + guerrier1.getDommage() + " dommage");
                    System.out.println("Joueur 1 perd " + guerrier1.getDommage() + " points de vie");
                    vieJoueur1 = guerrier2.getVie();
                    if (vieJoueur1 == 0) {
                        System.out.println("Joueur 1 est mort");
                    }
                    System.out.println("Joueur 2 perd " + guerrier2.getDommage() + " points de vie");

                } else if (choixPersonnageJoueur2 == 1 && choixPersonnageJoueur1 == 2) {
                    guerrier2.attaqueSpeciale(rodeur1);
                    System.out.println("Joueur 2 utilise " + rodeur1.getNomAttaqueSpesial() + " et inflige " + rodeur1.getDommage() + " dommage");
                    System.out.println("Joueur 1 perd " + rodeur1.getDommage() + " points de vie");
                    vieJoueur1 = rodeur1.getVie();
                    if (vieJoueur1 == 0) {
                        System.out.println("Joueur 1 est mort");
                    }
                    System.out.println("Joueur 2 perd " + guerrier2.getDommage() + " points de vie");

                } else if (choixPersonnageJoueur2 == 1 && choixPersonnageJoueur1 == 3) {
                    guerrier2.attaqueSpeciale(mage1);
                    System.out.println("Joueur 2 utilise " + mage1.getNomAttaqueSpesial() + " et inflige " + mage1.getDommage() + " dommage");
                    System.out.println("Joueur 1 perd " + mage1.getDommage() + " points de vie");
                    vieJoueur1 = mage1.getVie();
                    if (vieJoueur1 == 0) {
                        System.out.println("Joueur 1 est mort");
                    }
                    System.out.println("Joueur 2 perd " + guerrier2.getDommage() + " points de vie");

                } else if (choixPersonnageJoueur2 == 2 && choixPersonnageJoueur1 == 1) {
                    rodeur2.attaqueSpeciale(guerrier1);
                    System.out.println("Joueur 2 utilise " + rodeur2.getNomAttaqueSpesial() + " et inflige " + rodeur2.getDommage() + " dommage");
                    System.out.println("Joueur 1 perd " + rodeur2.getDommage() + " points de vie");
                    vieJoueur1 = guerrier1.getVie();
                    if (vieJoueur1 == 0) {
                        System.out.println("Joueur 1 est mort");
                    }
                } else if (choixPersonnageJoueur2 == 2 && choixPersonnageJoueur1 == 2) {
                    rodeur2.attaqueSpeciale(rodeur1);
                    System.out.println("Joueur 2 utilise " + rodeur2.getNomAttaqueSpesial() + " et inflige " + rodeur2.getDommage() + " dommage");
                    System.out.println("Joueur 1 perd " + rodeur2.getDommage() + " points de vie");
                    vieJoueur1 = rodeur1.getVie();
                    if (vieJoueur1 == 0) {
                        System.out.println("Joueur 1 est mort");
                    }
                } else if (choixPersonnageJoueur2 == 2 && choixPersonnageJoueur1 == 3) {
                    rodeur2.attaqueSpeciale(mage1);
                    System.out.println("Joueur 2 utilise " + rodeur2.getNomAttaqueSpesial() + " et inflige " + rodeur2.getDommage() + " dommage");
                    System.out.println("Joueur 1 perd " + rodeur2.getDommage() + " points de vie");
                    vieJoueur1 = mage1.getVie();
                    if (vieJoueur1 == 0) {
                        System.out.println("Joueur 1 est mort");
                    }
                } else if (choixPersonnageJoueur2 == 3 && choixPersonnageJoueur1 == 1) {
                    mage2.attaqueSpeciale(guerrier1);
                    System.out.println("Joueur 2 utilise " + mage2.getNomAttaqueSpesial() + " et  gagne " + mage2.getDommage() + "  en vitalité");
                    vieJoueur1 = guerrier1.getVie();

                } else if (choixPersonnageJoueur2 == 3 && choixPersonnageJoueur1 == 2) {
                    mage2.attaqueSpeciale(rodeur1);
                    System.out.println("Joueur 2 utilise " + mage2.getNomAttaqueSpesial() + " et  gagne " + mage2.getDommage() + " en vitalité");
                    vieJoueur1 = rodeur1.getVie();

                } else if (choixPersonnageJoueur2 == 3 && choixPersonnageJoueur1 == 3) {
                    mage2.attaqueSpeciale(mage1);
                    System.out.println("Joueur 2 utilise " + mage2.getNomAttaqueSpesial() + " et gagne " + mage2.getDommage() + " en vitalité");
                    vieJoueur1 = mage1.getVie();

                }

            }else {
                System.out.println("Vous n'avez pas choisi parmis les choix proposés");
                clavier = new Scanner(System.in);
                choixAttaque2();
            }
        } catch (InputMismatchException e) {
            clavier = new Scanner(System.in);
            System.out.println("Erreur de saisie");
            choixAttaque2();
        }
        if (vieJoueur1 == 0) {
            System.out.println("Joueur 1 a perdu !");
            System.exit(0);
        }

    }
}













