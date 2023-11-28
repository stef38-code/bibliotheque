package org.hussard.codewars;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * <P>Un isogramme est un mot qui n'a pas de lettres répétées, qu'elles soient consécutives ou non.
 * <br>Implémentez une fonction qui détermine si une chaîne de caractères contenant uniquement des lettres est un isogramme.
 * <br>Supposez que la chaîne vide est un isogramme. Ignorer la casse des lettres.
 * </p>
 */
public class Isogram {
    private Isogram() {
        throw new UnsupportedOperationException("Isogram is a utility class and cannot be instantiated");
    }
    public static boolean  isIsogram(String str) {
        String strLowerCase = str.toLowerCase();
        String resultat = Arrays.stream(getCharactersDistinct(str)).map(Object::toString).collect(Collectors.joining());
        return strLowerCase.equals(resultat);
    }

    private static Character[] getCharactersDistinct(String str) {
        return getCharacterStream(str)
                .map(Character::toLowerCase) //ignore Case
                .distinct()
                .toArray(Character[]::new);
    }

    private static Stream<Character> getCharacterStream(String str) {
        return Arrays.stream(str.chars()
                .mapToObj(c -> (char) c)
                .toArray(Character[]::new));
    }
}
