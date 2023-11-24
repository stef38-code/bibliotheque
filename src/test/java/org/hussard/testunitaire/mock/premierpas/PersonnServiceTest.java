package org.hussard.testunitaire.mock.premierpas;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.catchThrowable;

class PersonnServiceTest {
    @Test
    void getPersonn() {
        //declaration du service à tester
        PersonnService personnService = new PersonnService();
        // appel de la méthode à tester
        Personn resultat = personnService.getPersonn();
        // on vérifie que le résultat est bien celui attendu
        assertThat(resultat.getNom()).isEqualTo("Doe");
        assertThat(resultat.getPrenom()).isEqualTo("John");
        Throwable thrown = catchThrowable(() -> resultat.getPrenom());
        assertThat(thrown)
                .isInstanceOf(Exception.class)
                .hasMessage("");


    }
}
