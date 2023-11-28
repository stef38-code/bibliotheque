package org.hussard.codewars;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

/**
 * <P>Votre tâche consiste à créer une fonction capable de prendre en argument n'importe quel nombre entier non négatif
 * et de le renvoyer avec ses chiffres dans l'ordre décroissant.
 * <br> Il s'agit essentiellement de réorganiser les chiffres pour créer le nombre le plus élevé possible.
 * </p>
 */
public class DescendingOrder {
    private DescendingOrder() {
        throw new UnsupportedOperationException("DescendingOrder is a utility class and cannot be instantiated");
    }
    public static int sortDesc(final int num) {
        //Your code
        String value = Arrays.stream(Arrays.stream(String.valueOf(num).chars()
                .mapToObj(c -> (char) c)
                .toArray(Character[]::new))
                .sorted(Comparator.reverseOrder())
                .toArray(Character[]::new))
                .map(Object::toString).collect(Collectors.joining());

        return Integer.parseInt(value);
    }
}
