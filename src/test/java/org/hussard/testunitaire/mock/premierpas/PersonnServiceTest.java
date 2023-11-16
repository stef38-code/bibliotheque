package org.hussard.testunitaire.mock.premierpas;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PersonnServiceTest {
    @Test
    void getPersonn() {
        //declaration du service à tester
        PersonnService personnService = new PersonnService();
        // appel de la méthode à tester
        Personn personn = personnService.getPersonn();
        // on vérifie que le résultat est bien celui attendu
        assertThat(personn.getNom()).isEqualTo("Doe");
        assertThat(personn.getPrenom()).isEqualTo("John");
    }
}