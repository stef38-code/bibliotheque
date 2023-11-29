package org.hussard.codewars;

/**
 * <p>
 * Créez une fonction qui prend un entier comme argument
 * <br>et renvoie "Even" pour les nombres pairs ou "Odd" pour les nombres impairs.
 * </p>
 */
public class EvenOrOdd {
    private EvenOrOdd() {
        throw new UnsupportedOperationException("EvenOrOdd is a utility class and cannot be instantiated");
    }
    public static String evenOrOdd(int number) {
        if((number % 2) == 0){
            return "Even";
        }
        return "Odd";
    }
}
