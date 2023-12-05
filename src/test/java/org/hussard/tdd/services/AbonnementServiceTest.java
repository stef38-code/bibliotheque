package org.hussard.tdd.services;

import org.hussard.tdd.data.Adherent;
import org.hussard.tdd.data.AdherentBuilder;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.time.LocalDate;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("Les tarifs sont dégressifs en fonction de l âge pour une année d abonnement.")
class AbonnementServiceTest {
    private final AbonnementService abonnementService = new AbonnementServiceDefault();

    @ParameterizedTest(name = "Adherent de {0} ans : {1}€/an")
    @MethodSource("reglesTarifs")
    void calculerTarif(int annee,
                       int tarif) {
        LocalDate dateNaissance = LocalDate.now().minusYears(annee);
        Adherent adherent = AdherentBuilder
                .get()
                .dateNaiss(dateNaissance)
                .build();

        int tarifCalcule = abonnementService.calculerTarif(adherent);
        assertThat(tarifCalcule)
                .isEqualTo(tarif);
    }

    private static Stream<Arguments> reglesTarifs() {
        return Stream.of(
                Arguments.of(16, 200),
                Arguments.of(18, 400),
                Arguments.of(26, 600),
                Arguments.of(65, 200)
        );
    }
}
