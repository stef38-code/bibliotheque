package org.hussard.tdd.data;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.catchThrowable;

class AdherentBuilderTest {
    @Test
    @DisplayName("L'accès à la salle de sport est interdit aux moins 16 ans")
    void build_Quand_AdherentEstMineur_Attend_UneErreur() {
        LocalDate mineur = LocalDate.now().minusYears(15);
        Throwable thrown = catchThrowable(() -> AdherentBuilder
                .get()
                .dateNaiss(mineur)
                .build());
        assertThat(thrown)
                .isInstanceOf(AdherentMineurException.class)
                .hasMessage("L'accès à la salle de sport est interdit aux moins 16 ans");
    }
}
