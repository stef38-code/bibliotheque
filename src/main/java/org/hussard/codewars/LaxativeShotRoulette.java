package org.hussard.codewars;

/**
 * <p>
 * Peter aime prendre des risques, et cette fois-ci, il a décidé de passer à la vitesse supérieure !
 * <br>
 * <br>
 * Peter demande au barman de son quartier de lui servir neuf verres,
 * <br>après quoi il met des laxatifs dans chacun d'entre eux.
 * <br>Il se retourne ensuite et laisse le barman mélanger les verres.
 * <br>Peter s'approche des verres et en boit un à la fois.
 * <br>Un seul verre suffit à donner à Pierre un ventre qui coule.
 * <br><br>Quelle est la probabilité que Pierre n'ait pas besoin de courir aux toilettes ?
 * </p>
 * <p>
 * On vous donne :
 * <br>
 * <ul>
 *     <li>n - Le nombre total de verres</li>
 *     <li>x - Le nombre de verres chargés de laxatifs</li>
 *     <li>a - Le nombre de verres que Pierre boit</li>
 * </ul>
 * Indiquez la probabilité que Peter n'ait pas la diarrhée après avoir bu.
 * <br> n sera toujours supérieur à x, et a sera toujours inférieur à n.
 * <br><br>
 * <b>Vous devez renvoyer la probabilité arrondie à deux décimales, c'est-à-dire 0,05 ou 0,81.</b>
 * </p>
 * <p>
 *  <br> P = n/N
 * <ul>
 *  <li>P = Probabilité d'une issue favorable lors d'un événement.</li>
 *  <li>n = Nombre d'issues favorables possibles.</li>
 *  <li>N = Nombre total d'issues possibles pour l'événement.</li>
 * </ul>
 * </p>
 */
public class LaxativeShotRoulette {
    private LaxativeShotRoulette() {
        throw new UnsupportedOperationException("LaxativeShotRoulette is a utility class and cannot be instantiated");
    }

    public static double getChance(int n,
                                   int x,
                                   int a) {
        double p = 1.0;
        for (int i = a; i > 0; i--) {
            p *= (double) (n - x - i + 1) / (n - i + 1);
        }
        return Math.round(100 * p) / 100.;
    }
}
