package org.hussard.codewars;

import java.util.Arrays;

/**
 * <p>
 * Déterminer si la main de poker est une main pleine,<br>
 * c'est-à-dire si les cinq cartes sont de la même couleur.
 *</p>
 * <br>
 * <p>
 * Votre fonction recevra une liste/un tableau de 5 chaînes,<br>
 * chacune représentant une carte de poker au format "5H" (5 de cœur),
 * <br>c'est-à-dire la valeur de la carte suivie de l'initiale de sa couleur :<br>
 * (cœur(Hearts), pique(Spades), carreau(Diamonds) ou trèfle(Clubs)).
 * </p>
 * <br>
 * <p>
 * <b>Les jokers ne sont pas inclus.</b>
 * </p>
 * <br>
 *<p>
 * Votre fonction doit renvoyer true si la main est une couleur,
 * false dans le cas contraire.
 *</p>
 * <p>
 * Les valeurs possibles des cartes sont : <br>
 * <b>2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K, A.</b>
 * </p>
 * <p>
 *  Exemples :
 *  <ul>
 *      <li>["AS", "3S", "9S", "KS", "4S"]  ==> true</li>
 *      <li>["AD", "4S", "7H", "KS", "10S"] ==> false</li>
 *  </ul>
 * </p>
 */
public class DetermineIfThePokerHandIsFlush {
    private DetermineIfThePokerHandIsFlush() {
        throw new UnsupportedOperationException("DetermineIfThePokerHandIsFlush is a utility class and cannot be instantiated");
    }
    public static boolean checkIfFlush(String[] cards){
        return Arrays.stream(cards)
                .map(card -> card.charAt(card.length() - 1))
                .distinct()
                .count() == 1;
    }
}
