package org.hussard.codewars;

import java.util.List;

/**
 * <p>>Dans ce kata, vous allez créer une fonction qui prend une liste d'entiers non négatifs et de chaînes de caractères
 * et qui renvoie une nouvelle liste dont les chaînes de caractères ont été filtrées.</p>
 */
public class KataFilterList {
    private KataFilterList() {
        throw new UnsupportedOperationException("KataFilterList is a utility class and cannot be instantiated");
    }
    public static List<Object> filterList(final List<Object> list) {
        // Return the List with the Strings filtered out
        return list.stream()
                .filter(Integer.class::isInstance)
                .filter(element -> (Integer)element  >= 0)
                .toList();
    }
}
