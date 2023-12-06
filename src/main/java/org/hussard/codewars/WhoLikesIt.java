package org.hussard.codewars;
//https://www.codewars.com/kata/5266876b8f4bf2da9b000362/train/java

/**
 * <p>
 * Vous connaissez probablement le système "like" de Facebook et d'autres pages.<br>
 * Les gens peuvent "aimer" des articles de blog, des images ou d'autres éléments. <br>
 * Nous voulons créer le texte qui doit s'afficher à côté d'un tel élément.<br>
 * </p>
 * <p>
 * Implémentez la fonction qui prend un tableau contenant les noms des personnes qui aiment un article.
 * Elle doit renvoyer le texte affiché comme indiqué dans les exemples :
 * <ul>
 * <li>[]                                -->  "no one likes this"</li>
 * <li>["Peter"]                         -->  "Peter likes this"</li>
 * <li>["Jacob", "Alex"]                 -->  "Jacob and Alex like this"</li>
 * <li>["Max", "John", "Mark"]           -->  "Max, John and Mark like this"</li>
 * <li>["Alex", "Jacob", "Mark", "Max"]  -->  "Alex, Jacob and 2 others like this"</li>
 * </ul>
 * </p>
 */
public class WhoLikesIt {
    public static final String NO_ONE_LIKES_THIS = "no one likes this";

    private WhoLikesIt() {
        throw new UnsupportedOperationException("WhoLikesIt is a utility class and cannot be instantiated");
    }

    public static String whoLikesIt(String... names) {
        if (names.length == 0) {
            return NO_ONE_LIKES_THIS;
        }
        if (names.length == 1) {
            return "%s likes this".formatted(names[0]);
        }
        if (names.length == 2) {
            return "%s and %s like this".formatted(names[0],names[1]);
        }

        if (names.length == 3) {
            return "%s, %s and %s like this".formatted(names[0],names[1],names[2]);
        }
        return "%s, %s and %d others like this".formatted(names[0], names[1], names.length - 2);
    }
}
