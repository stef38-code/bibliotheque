package org.hussard.codewars;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;

/**
 * <p>
 * Écrivez une fonction qui prend une chaîne d'un ou plusieurs mots et retourne
 * la même chaîne, mais avec tous les mots de cinq lettres ou plus inversés
 * (tout comme le nom de ce Kata).
 * Les chaînes de caractères transmises seront composées
 * uniquement de lettres et d'espaces.
 * </p>
 * <br>
 * <b>Les espaces ne seront inclus que lorsque plus d'un mot est présent.</b>
 * <br>
 * <br>
 * <p>
 * <b>Examples:</b>
 * <br>
 * <ul>
 * <li>spinWords( "Hey fellow warriors" ) => returns "Hey wollef sroirraw"</li>
 * <li>spinWords( "This is a test") => returns "This is a test"</li>
 * <li>spinWords( "This is another test" )=> returns "This is rehtona test"</li>
 * </ul>
 * </p>
 */
public class StopGninnipSMySdroW {
    private StopGninnipSMySdroW() {
        throw new UnsupportedOperationException("StopGninnipSMySdroW is a utility class and cannot be instantiated");
    }
    public static String spinWords(String sentence) {
        return StringUtils.join(Arrays.stream(sentence.split("\\s+")).map(word -> {
                    if (word.length() >= 5) {
                        return StringUtils.reverse(word);
                    }
                    return word;
                })
                .toList(), " ");
    }
}
