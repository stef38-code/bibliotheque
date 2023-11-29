package org.hussard.codewars;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * <p>
 * L'acide désoxyribonucléique (ADN) est une substance chimique qui se trouve dans le noyau des cellules et qui porte les "instructions" pour le développement et le fonctionnement des organismes vivants.
 * <br>
 * Pour en savoir plus : http://en.wikipedia.org/wiki/DNA
 * <br>
 * Dans les chaînes d'ADN, les symboles "A" et "T" sont complémentaires, tout comme "C" et "G". Votre fonction reçoit un côté de l'ADN (chaîne, sauf pour Haskell) ; vous devez renvoyer l'autre côté complémentaire. Le brin d'ADN n'est jamais vide ou il n'y a pas d'ADN du tout (encore une fois, sauf pour Haskell).
 * <br>
 * D'autres exercices similaires se trouvent ici : http://rosalind.info/problems/list-view/ (source)
 *<P>
 * <b>Exemple : (entrée --> sortie)</b>
 *<br>
 * <ul>
 *    <li>"ATTGC" --> "TAACG"</li>
 *    <li>"GTAT" --> "CATA"</li>
 * </ul>
 * </p>
 * </p>
 */
public class DnaStrand {
    private DnaStrand() {
        throw new UnsupportedOperationException("DnaStrand is a utility class and cannot be instantiated");
    }
    public static String makeComplement(String dna) {
        return replace(getCharacterStream(dna));
    }
    private static String replace(Stream<Character> characterStream){
        return characterStream.map(
                character -> {
                    if(character.equals('A')){
                        return 'T';
                    }
                    if(character.equals('T')){
                        return 'A';
                    }
                    if(character.equals('G')){
                        return 'C';
                    }
                    if(character.equals('C')){
                        return 'G';
                    }
                    return character;
                }
        ).map(Object::toString).collect(Collectors.joining());
    }
    private static Stream<Character> getCharacterStream(String str) {
        return Arrays.stream(str.chars()
                .mapToObj(c -> (char) c)
                .toArray(Character[]::new));
    }
}
