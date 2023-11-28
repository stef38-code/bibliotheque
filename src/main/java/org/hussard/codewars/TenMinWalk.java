package org.hussard.codewars;

import java.util.List;

/**
 * <p>Vous habitez dans la ville de Cartesia où toutes les routes sont parfaitement quadrillées.
 * Vous arrivez dix minutes trop tôt à un rendez-vous.
 * </p>
 * <p>Alors vous décidez d'en profiter pour faire une petite promenade.
 * La ville met à la disposition de ses citoyens une application de génération de marche sur leur téléphone.
 * Chaque fois que vous appuyez sur le bouton,
 * l'application vous envoie un tableau de chaînes d'une lettre représentant les directions à suivre
 * (par exemple ['n', 's', 'w', 'e']).
 * </p>
 * <p>
 * Vous ne marchez toujours qu'un seul pâté de maisons pour chaque lettre (direction) et
 * vous savez qu'il vous faut une minute pour parcourir un pâté de maisons.
 * Créez donc une fonction qui renverra true
 * si la promenade que vous propose l'application vous prendra exactement dix minutes (vous ne voulez pas être en avance ou en retard !)
 * et qui vous ramènera, bien sûr, à votre point de départ.
 * Dans le cas contraire, il renverra false.
 *</p>
 * <p><b>
 * Note : vous recevrez toujours un tableau valide contenant un assortiment aléatoire de lettres de direction
 * ('n', 's', 'e', ou 'w' uniquement).
 * Il ne vous donnera jamais un tableau vide
 * (ce n'est pas une marche, c'est de l'immobilisme !).
 * </b>
 * </p>
 */
public class TenMinWalk {
    private TenMinWalk() {
        throw new UnsupportedOperationException("TenMinWalk is a utility class and cannot be instantiated");
    }
    public static boolean isValid(char[] walk) {

        // Insert brilliant code here
        List<String> values = List.of("n", "s", "e", "w");
        //n -> s -> n ->

        //on controle si nous avons bien les bons caractères


        for (int i = 0; i < walk.length; i++) {

            if(! values.contains(String.valueOf(walk[i]))){
                return false;
            }
        }
        return true;
    }
}
