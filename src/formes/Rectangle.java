package formes;

import exceptions.FormeException;
import util.Util;

public class Rectangle {
    public static final int MIN_VAL = 1;
    public static final int MAX_VAL = 30;
    public static final String[] LES_COULEURS = {"rouge", "vert", "bleu", "jaune", "noir", "orange"};
    public static final String COULEUR_DEFAUT = "rouge";

    private int hauteur;
    private int largeur;
    private static String nom;
    private String couleur;

    public Rectangle(int hauteur, int largeur) {
        if (validerHauteur(this.hauteur) == true && validerLargeur(largeur) == true) {
            setHauteur(hauteur);
            setLargeur(largeur);
            setCouleur(COULEUR_DEFAUT);
        }

        Rectangle.nom = "Rectangle";
      /*  else if (validerCouleur(couleur) == false)
            new FormeException("erreur couleur");

        else if (validerHauteur(hauteur) == false)
            new FormeException("erreur hauteur");

        else if (validerHauteur(largeur) == false)
            new FormeException("erreur largeur");
*/

//        calclulerPerimetre();
    }


    public String getCouleur() {
        return couleur;
    }

    public int getHauteur() {
        return hauteur;
    }

    public int getLargeur() {
        return largeur;
    }

    public static String getNom() {
        return Rectangle.nom;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public void setHauteur(int hauteur) {
        this.hauteur = hauteur;
    }

    public void setLargeur(int largeur) {
        this.largeur = largeur;
    }


    private static boolean validerCouleur(String couleur){
        if (Util.trouverStr(couleur, LES_COULEURS) >= 0)
            return true;
        else
            return false;
    }

    private static boolean validerHauteur(int hauteur){
        if (hauteur >=  MIN_VAL && hauteur <= MAX_VAL)
            return true;
        else
            return false;
    }

    private static boolean validerLargeur(int largeur){
        if (largeur >=  MIN_VAL && largeur <= MAX_VAL)
            return true;
        else
            return false;
    }

   /* public int calclulerPerimetre() {
        int perimetre;
        this.hauteur = hauteur;
        this.largeur = largeur;
        perimetre = 2 * (hauteur + largeur);
        System.out.println(perimetre);
        return perimetre;
    } */

    public static void main(String[] args) {
        new Rectangle(3, 2);
    }
}
