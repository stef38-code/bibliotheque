package org.hussard.pattern.fluent;

import com.github.javafaker.Faker;
import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.ZoneId;

class PersonneFluentTroisiemeCasTest {
    private Faker faker;
    @BeforeEach
    void setUp() {
        faker = new Faker();
    }
    @Test
    @DisplayName("Une personne pas marié avec emploi")
    void creerUnePersonne_deuxiemeCas(){
//Conditions préalables (given)
        String prenom = faker.name().firstName();
        String nom = faker.name().lastName();
        LocalDate dNaiss = faker.date().birthday().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        String emploi = faker.company().profession();
        //Une action se produit (when)
        Personne personne = Personne.nom(nom)
                .prenom(prenom)
                .dateNaiss(dNaiss)
                .emploi(emploi)
                .create();
        // Vérifier la sortie (then)
        SoftAssertions softly = new SoftAssertions();
        softly.assertThat(personne).isNotNull();
        softly.assertThat(personne.getNom()).isEqualTo(nom);
        softly.assertThat(personne.getPrenom()).isEqualTo(prenom);
        softly.assertThat(personne.getdNaiss()).isEqualTo(dNaiss);
        softly.assertThat(personne.getEmploi()).hasToString(emploi);
        softly.assertThat(personne.isMarie()).isFalse();
        // Ajouter les autres tests
        softly.assertAll();
    }
}
