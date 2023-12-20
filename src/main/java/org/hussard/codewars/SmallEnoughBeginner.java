package org.hussard.codewars;

import java.util.Arrays;

/**
 * <p>
 * On vous donne un tableau et une valeur limite. Vous devez vérifier que toutes les valeurs du tableau sont inférieures
 * ou égales à la valeur limite. Si c'est le cas, vous renverrez true, dans le cas contraire, vous renverrez false.
 * </p>
 * <br>
 * Vous pouvez supposer que toutes les valeurs du tableau sont des nombres
 */
public class SmallEnoughBeginner {

    private SmallEnoughBeginner() {
        throw new UnsupportedOperationException("SmallEnoughBeginner is a utility class and cannot be instantiated");
    }

    public static boolean smallEnough(int[] values,
                                      int limit) {
        return Arrays.stream(values).
                noneMatch(value -> value > limit);
    }
}
