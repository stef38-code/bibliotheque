package org.hussard.codewars;

/**
 * <P>Notre équipe de football a terminé le championnat.</p>
 * <p>Les résultats des matchs de notre équipe sont enregistrés dans une collection de chaînes de caractères.
 * Chaque match est représenté par une chaîne au format "x:y", où x est le score de notre équipe et y celui de nos adversaires.
 * </p>
 * <P>
 * <u>Par exemple :</u>
 * ["3:1", "2:2", "0:1", ...]
 * Les points sont attribués pour chaque match de la manière suivante :
 * <ul>
 * <li>si x > y : 3 points (victoire)</li>
 * <li>si x < y : 0 point (défaite)</li>
 * <li>si x = y : 1 point (égalité)</li>
 * </ul>
 * </p>
 * <p>
 * Nous devons écrire une fonction qui prend cette collection et renvoie le nombre de points que notre équipe (x) a obtenu dans le championnat selon les règles données ci-dessus.
 * Notes :<br>
 * notre équipe joue toujours 10 matchs dans le championnat
 *</p>
 */
public class TotalAmountOfPoints {
private TotalAmountOfPoints() {
    throw new UnsupportedOperationException("TotalAmountOfPoints is a utility class and cannot be instantiated");
}
    public static int points(String[] games) {
        int resultat = 0;
        //implement me
        for (String game : games) {
            Match match = getMatch(game);
            resultat = match.getPointValue() + resultat;
        }
        return resultat;
    }

    private static Match getMatch(String game) {
        String[] split = game.split(":");
        String nous = split[0];
        String eux = split[1];
        return new Match(nous,eux);
    }

    private static class Match {
        private final int x;
        private final int y;

        public Match(String x,
                     String y) {

            this.x = Integer.parseInt(x);
            this.y = Integer.parseInt(y);
        }

        public int getPointValue() {
            // si x > y : 3 points (victoire)
            if(x > y) return 3;
            // si x < y : 0 point (défaite)
            if(x < y) return 0;
            //si x = y : 1 point (égalité)
            return 1;
        }
    }
}
