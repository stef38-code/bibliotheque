package org.hussard.tdd.services;

import org.hussard.tdd.data.Adherent;

import java.time.LocalDate;

public class AbonnementServiceDefault implements AbonnementService {
    private static final int TARIF_16_17_SUP_65 = 200;
    private static final int TARIF_18_25 = 400;
    private static final int TARIF_26_64 = 600;
    @Override
    public int calculerTarif(Adherent adherent) {
        int age = calculerAge(adherent);

        if(isAdulte(age))
            return TARIF_26_64;
        if(isEtudiant(age))
            return TARIF_18_25;

        return TARIF_16_17_SUP_65;
    }



    /**
     * Calculer l'age d'un adhérent
     * @param adherent l'adhérent
     * @return l'âge
     */
    private int calculerAge(Adherent adherent) {
        return adherent.getDateNaiss().until(LocalDate.now()).getYears();
    }

    /**
     * Verifier si l'adhérent est un étudiant avec un âge entre 18 et 25 ans
     * @param age l'age de l'adhérent
     * @return true si l'adhérent est un étudiant
     */
    private boolean isEtudiant(int age) {
        return age >= 18 && age <= 25;
    }

    /**
     * Verifier si l'adhérent est un adulte avec un âge entre 26 et 64 ans
     * @param age l'age de l'adhérent
     * @return true si l'adhérent est un adulte
     */
    private boolean isAdulte(int age) {
        return age >= 26 && age <= 64;
    }
}
