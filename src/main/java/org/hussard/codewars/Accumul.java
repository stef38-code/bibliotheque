package org.hussard.codewars;

/**
 * <p>
 * Cette fois-ci, pas d'histoire, pas de théorie.
 * <br>Les exemples ci-dessous vous montrent comment écrire des accumulations de fonctions :
 * </p>
 * <p>
 * <b>Exemples:</b><br>
 * <ul>
 *     <li>accum("abcd") -> "A-Bb-Ccc-Dddd"</li>
 *     <li>accum("RqaEzty") -> "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"</li>
 *     <li>accum("cwAt") -> "C-Ww-Aaa-Tttt"</li>
 * </ul>
 * </p>
 */
public class Accumul {
    private Accumul() {
        throw new UnsupportedOperationException("Accumul is a utility class and cannot be instantiated");
    }
    public static String accum(String s) {
        char[] charArray = s.toCharArray();
        String[] resultat = new String[charArray.length];
        for (int index = 0; index < charArray.length; index++) {
            String value = String.valueOf(charArray[index]).toUpperCase();
            if(index > 0){
                value = value.concat(value.toLowerCase().repeat(index ));
            }
            resultat[index] = value;
        }
        return String.join("-",resultat);
    }
}
