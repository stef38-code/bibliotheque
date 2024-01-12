package org.hussard.bidon;

import java.util.Comparator;
import java.util.List;

public class PeriodeTri {
    public List<PeriodeDto> trier(List<PeriodeDto> periodes) {
        return periodes.stream()
                .sorted(getComparator())
                .toList();
    }

    /**
     * Inférieure à zéro : l'objet actuel est inférieur à l'objet spécifié.
     * Zéro : les deux objets sont égaux.
     * Supérieure à zéro : l'objet actuel est supérieur à l'objet spécifié.
     * @return
     */
    private Comparator<PeriodeDto> getComparator() {
        return (ligneCourant, ligneSuivante) -> {
            boolean dateDebutIsBefore = ligneCourant.getDateDebut().isBefore(ligneSuivante.getDateDebut());
            boolean dateateFinIsBefore = ligneCourant.getDateFin().isBefore(ligneSuivante.getDateFin());
            boolean dateDebutIsEqual = ligneCourant.getDateDebut().isEqual(ligneSuivante.getDateDebut());
            boolean dateateFinIsEqual = ligneCourant.getDateFin().isEqual(ligneSuivante.getDateFin());
            if (dateDebutIsBefore &&  dateateFinIsBefore) {
                return 1;
            }
            if (dateDebutIsEqual &&  dateateFinIsEqual) {
                return 0;
            }
            return -1;
        };
    }
}
