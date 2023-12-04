package org.hussard.tdd.services;

import org.hussard.tdd.data.Adherent;
import org.hussard.tdd.data.AdherentBuilder;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;


class AbonnementServiceTest {
    @Test
    @DisplayName("16-17 ans : 200€/an")
    void calculerTarif_Quand_AdherentEstEntre16Et17Ans_Attend_200() {

        LocalDate mineur = LocalDate.now().minusYears(16);
        Adherent adherent = AdherentBuilder
                .get()
                .dateNaiss(mineur)
                .build();
        AbonnementService abonnementService = new AbonnementServiceDefault();
        int tarif = abonnementService.calculerTarif(adherent);
        assertThat(tarif)
                .isEqualTo(200);
    }
    @Test
    @DisplayName("18-25 ans : 400€/an")
    void calculerTarif_Quand_AdherentEstEntre18Et25Ans_Attend_400() {
        LocalDate mineur = LocalDate.now().minusYears(18);
        Adherent adherent = AdherentBuilder
                .get()
                .dateNaiss(mineur)
                .build();
        AbonnementService abonnementService = new AbonnementServiceDefault();
        int tarif = abonnementService.calculerTarif(adherent);
        assertThat(tarif)
                .isEqualTo(400);
    }
    @Test
    @DisplayName("26-64 ans : 600€/an")
    void calculerTarif_Quand_AdherentEstEntre26Et64Ans_Attend_600() {
        LocalDate mineur = LocalDate.now().minusYears(26);
        Adherent adherent = AdherentBuilder
                .get()
                .dateNaiss(mineur)
                .build();
        AbonnementService abonnementService = new AbonnementServiceDefault();
        int tarif = abonnementService.calculerTarif(adherent);
        assertThat(tarif)
                .isEqualTo(600);
    }
    @Test
    @DisplayName("65 ans et plus : 200€/an")
    void calculerTarif_Quand_AdherentEstApret65Ans_Attend_200() {
        LocalDate mineur = LocalDate.now().minusYears(65);
        Adherent adherent = AdherentBuilder
                .get()
                .dateNaiss(mineur)
                .build();
        AbonnementService abonnementService = new AbonnementServiceDefault();
        int tarif = abonnementService.calculerTarif(adherent);
        assertThat( tarif)
                .isEqualTo(200);
    }
}
