package org.hussard.snippets;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Cette classe montre comment passer d'une boucle for avec un continue.
 * 4 méthodes pour comprendre comment faire
 */
public class ForAndContinue {
    /**
     * Première méthode :
     * <p>
     * Avec les instructions
     * <ul>
     * <li>For</li>
     * <li>Continue</li>
     * <li>Une liste pour le résultat</li>
     * </ul>
     * </p>
     * @param list la liste d'entrée
     * @return le resultat
     */
    public List<Integer> basiqueSolution(List<Integer> list) {
        // la liste du résultat
        List<Integer> resultats = new ArrayList<>();
        //Parcours les éléments de la liste
        for (Integer value : list) {
            //ne pas traiter les chiffres négatifs
            if(value < 0){
                continue;
            }
            // traitement des chiffres positifs
            // on ajoute +1 puis l'ajout à la liste resultats
            resultats.add(value+1);
        }
        return resultats;
    }

    /**
     * Deuxième méthode :
     * <p>
     * Avec les instructions
     * <ul>
     * <li>
     *     Une nouvelle liste contenant que les chiffres positifs<br/>
     *     via stream().filter()
     * </li>
     * <li>For</li>
     * <li>Une liste pour le résultat</li>
     * </ul>
     * </p>
     * @param list la liste d'entrée
     * @return le resultat
     */
    public List<Integer> filterAndFor(List<Integer> list) {
        // La liste du résultat
        List<Integer> resultats = new ArrayList<>();
        // La nouvelle liste qui ne contient que les chiffres positifs
        List<Integer> positifList = list.stream()
                //filtre
                .filter(element -> element >= 0).toList();
        // Parcours les éléments de la liste
        for (Integer value : positifList) {
            // Traitement des chiffres positifs, on ajoute +1
            resultats.add(value+1);
        }
        return resultats;
    }

    /**
     * Troisième méthode :
     * <p>
     * Avec les instructions
     * <ul>
     * <li>
     *     Une nouvelle liste contenant que les chiffres positifs<br/>
     *     via stream().filter()
     * </li>
     * <li>ForEach du Stream</li>
     * <li>Une liste pour le résultat</li>
     * </ul>
     * </p>
     * @param list la liste d'entrée
     * @return le résultat
     */
    public List<Integer> filterAndForeach(List<Integer> list) {
        List<Integer> resultats = new ArrayList<>();
        Predicate<Integer> selectionDesChiffresPositifs = element -> element >= 0;
        list.stream()
                .filter(selectionDesChiffresPositifs)
                //traitement des chiffres positifs, on ajoute +1
                .forEach(element -> resultats.add(element + 1));
        return resultats;
    }

    /**
     * Quatrième méthode :
     * <p>
     * Avec les instructions
     * <ul>
     * <li>
     *    Predicate pour la règle de filtre
     * </li>
     * <li>
     *    Function pour le traitement dans le map
     * </li>
     * <li>toList pour la génération de la liste</li>
     * </ul>
     * </p>
     * @param list
     * @return
     */
    public List<Integer> filterAndMapToList(List<Integer> list) {
        Predicate<Integer> selectionDesChiffresPositifs = element -> element >= 0;
        Function<Integer,Integer> ajoutePlusUn = element -> element + 1;
        return list.stream()
                .filter(selectionDesChiffresPositifs)
                .map(ajoutePlusUn)
                //map permet d'avoir une action sur l'élément et retourne cette nouvelle valeur,
                // le tous dans un stream
                .toList();
    }
}
