package org.hussard.codewars;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
/**
 * <p>
 * Le coucou sort de l'horloge et sonne une fois au quart d'heure, à la demi-heure et aux trois quarts d'heure. <br>Au début
 * de chaque heure (1-12), il sonne l'heure. <br>Etant donné l'heure actuelle et un nombre n, déterminez l'heure à laquelle
 * le coucou a sonné n fois.
 * </p>
 * <p>
 * Paramètres d'entrée :
 * <ul>
 * <li>initial_time - une chaîne au format "HH:MM", où 1 ≤ HH ≤ 12 et 0 ≤ MM ≤ 59, avec des 0 en tête</li>
 * si nécessaire.
 * <li>n - un nombre entier représentant le nombre cible de carillons, avec 1 <= n <= 200.</li>
 * </ul>
 * </p>
 * <p>
 * Valeur de retour : L'heure à laquelle le coucou a sonné n fois - une chaîne au même format que initial_time(<b>"HH:MM"</b>).
 * </p>
 * <br>
 * <p>
 * Si le coucou émet un carillon à l'heure initiale, il faut l'inclure dans le décompte. <br>Si le nème carillon est atteint
 * au cours de l'heure, indiquez l'heure au début de cette heure (c'est-à-dire en supposant que le coucou a terminé son
 * carillon avant que la minute ne soit écoulée).
 * </p>
 * <br>
 * <p>
 * <i>Exemple : <br>"03:38", 19 doit renvoyer "06:00".</i><br>
 * <br>Explication :
 * <ul>Il sonne
 * <li>une fois à "03:45", </li>
 * <li>4 fois à "04:00", </li>
 * <li>une fois à "04:15", "04:30", "04:45",</li>
 * <li>5 fois à "05:00",</li>
 * <li>une fois à "05:15", "05:30", "05:45".</li>
 * </ul>
 * <br>À ce stade, il a sonné 16 fois, et le 19e carillon se produit lorsqu'il sonne 6 fois à "06:00".
 * </p>
 * <br>
 * <p>
 * <b>Source : International Collegiate Programming Contest, North Central North American Regional, 2023.</b>
 * </p>
 */
public class CuckooClock {
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm");
    private CuckooClock() {
        throw new UnsupportedOperationException("CuckooClock is a utility class and cannot be instantiated");
    }

    public static String cuckooClock(String inputTime,
                                     int chimes) {

        LocalTime result = convertStringToLocalTime(inputTime);
        chimes = calculatesNumberOfChimesOnQuarterHoursOrHours(chimes,result);

        int chime = 0;
        while (chime < chimes) {
            result = roundUpToNextQuarterHour(result);
            if(result.getMinute() == 0){
                chime = chime + result.getHour()-1; //add nb hours
            }
                chime++; //next chime
        }
        // Insert code here
        return result.format(formatter);
    }
    private static int calculatesNumberOfChimesOnQuarterHoursOrHours(int chimes,LocalTime time){
        List<Integer> quart = List.of(15,30,45);
        if(quart.contains(time.getMinute())){
            return chimes -1; // minus one chime on chimes sum
        }else if (time.getMinute() == 0){
            return chimes - time.getHour() ; // minus number of hours on the chimes sum
        }
        return chimes;
    }
    private static LocalTime convertStringToLocalTime(String inputTime) {
        return LocalTime.parse(inputTime);
    }

    public static LocalTime roundUpToNextQuarterHour(LocalTime temporal) {
        int quarterHour = calculateNextQuarterHour(temporal);
        return calculateNextTime( quarterHour,  temporal);
    }

    private static LocalTime calculateNextTime(int quarterHour, LocalTime temporal) {
        LocalTime localTime;
        if(quarterHour == 60) { //hh:00
            int temporalMinute = temporal.getMinute();
            localTime = temporal.plusHours(1).minusMinutes(temporalMinute);//calculate next hour
        }else{
            localTime = temporal.withMinute(quarterHour); // add quarter hour default value
        }
        String time = localTime.format(formatter); //format 1 ≤ HH ≤ 12 and 0 ≤ MM ≤ 59
        return convertStringToLocalTime(time);
    }

    private static int calculateNextQuarterHour(LocalTime temporal) {
        int minute = temporal.getMinute();
        return ((minute +15) / 15) * 15;
    }
}
