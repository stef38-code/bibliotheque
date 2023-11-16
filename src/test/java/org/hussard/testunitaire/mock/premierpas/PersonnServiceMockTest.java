package org.hussard.testunitaire.mock.premierpas;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;

class PersonnServiceMockTest {
    @Test
    void getPersonn() {
        //Décclaration du mock, on va simuler le comportement de la classe PersonnService
        PersonnService personnService = mock(PersonnService.class);
        // definition de la valeur de retour de la méthode getPersonn()
        Personn personn = new Personn("Smithee", "Adam");
        // on simule le comportement de la méthode getPersonn()
        given(personnService.getPersonn()).willReturn(personn);
        // on appelle la méthode getPersonn()
        Personn resultat = personnService.getPersonn();
        // on vérifie que le résultat est bien celui attendu
        assertThat(resultat.getNom()).isEqualTo("Smithee");
        assertThat(resultat.getPrenom()).isEqualTo("Adam");
    }
}
