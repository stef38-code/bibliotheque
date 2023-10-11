package org.hussard.pattern.builder;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;

class PersonneTest {
    @Test
    @DisplayName("Test avec toutes les propriétés")
    void creationPersonne(){
        Personne personne = Personne.build()
                .nom("Bob")
                .prenom("Eponge")
                .dNaiss(LocalDate.of(2000, 2, 25))
                .emploi(null)
                .marie(false)
                .create();
        assertThat(personne).isNotNull();
        assertThat(personne.getNom()).hasToString("Bob");
        assertThat(personne.getPrenom()).hasToString("Eponge");
        assertThat(personne.getdNaiss()).isEqualTo(LocalDate.of(2000, 2, 25));
        assertThat(personne.getEmploi()).isNull();
        assertThat(personne.isMarie()).isFalse();

    }
    @Test
    @DisplayName("Test avec uniquement le nom")
    void creationPersonne_uniquementLeNom(){
        Personne personne = Personne.build()
                .nom("Bob")
                .create();
        assertThat(personne).isNotNull();
        assertThat(personne.getNom()).hasToString("Bob");
    }
    @Test
    @DisplayName("Test avec une saisie de plusieurs fois le nom")
    void creationPersonne_plusieursFoisLeNom(){
        Personne personne = Personne.build()
                .nom("Bob")
                .nom("Robert")
                .nom("Sylvie")
                .create();
        assertThat(personne).isNotNull();
        assertThat(personne.getNom()).doesNotHaveToString("Bob");
    }
}
