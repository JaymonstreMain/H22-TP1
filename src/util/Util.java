package util;

public class Util {
    public static int trouverStr(String couleur, String[] lescouleurs) {
        int indice;

        indice = -1;

        for (int x = 0; x < lescouleurs.length; x++) {
            if (couleur.equalsIgnoreCase(lescouleurs[x])) {
                indice = x;
                break;
            }
        }

        return indice;

    }
}
