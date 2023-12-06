package org.hussard.codewars;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * <p>
 * Un bus circule dans la ville et prend et dépose des personnes à chaque arrêt.
 *</p>
 * <p>
 * Vous disposez d'une liste (ou d'un tableau) de paires d'entiers. <br>
 * Les éléments de chaque paire représentent le nombre de personnes qui montent dans le bus <br>
 * (le premier élément) et le nombre de personnes qui descendent du bus (le deuxième élément)<br>
 * à un arrêt de bus.
 *</p>
 * <br>
 * <p>
 * Votre tâche consiste à retourner le nombre de personnes qui sont encore <br>
 * dans le bus après le dernier arrêt (après le dernier tableau). <br>
 * Même s'il s'agit du dernier arrêt, le bus n'est peut-être pas vide et <br>
 * certaines personnes peuvent encore être à l'intérieur du bus, <br>
 * elles dorment probablement :D
 *</p>
 * <br>
 * <p>
 * Gardez à l'esprit que les cas de test garantissent que le nombre de personnes  <br>
 * dans le bus est toujours >= 0.  <br>
 * L'entier retourné ne peut donc pas être négatif. <br>
 *</p>
 * <br>
 * <p>
 * La deuxième valeur de la première paire du tableau est 0,  <br>
 * puisque le bus est vide au premier arrêt. <br>
 * <br>
 * <br>
 * Exemple : new int[] {3,5} -> 3 montes, 5 descendes
 * </p>
 */
public class NumberOfPeopleInTheBus {
    private NumberOfPeopleInTheBus() {
        throw new UnsupportedOperationException("NumberOfPeopleInTheBus is a utility class and cannot be instantiated");
    }
    public static int countPassengers(List<int[]> stops) {
        AtomicInteger up = new AtomicInteger();
        AtomicInteger down = new AtomicInteger();
        stops.forEach(stop ->{
            up.set(up.get() + stop[0]);
            down.set(down.get() + stop[1]);
        });

        return up.get() - down.get();
    }
}
