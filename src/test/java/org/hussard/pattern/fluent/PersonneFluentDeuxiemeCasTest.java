package org.hussard.pattern.fluent;

import com.github.javafaker.Faker;
import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.ZoneId;

import static org.hussard.pattern.fluent.Personne.nom;

class PersonneFluentDeuxiemeCasTest {
    private Faker faker;
    @BeforeEach
    void setUp() {
        faker = new Faker();
    }
    @Test
    @DisplayName("Une Personne marié et sans emploi")
    void creerUnePersonne_deuxiemeCas(){
//Conditions préalables (given)
        String prenom = faker.name().firstName();
        String nom = faker.name().lastName();
        LocalDate dNaiss = faker.date().birthday().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

        //Une action se produit (when)
        Personne personne = nom(nom)
                .prenom(prenom)
                .dateNaiss(dNaiss)
                .marie(true)
                .create();
        // Vérifier la sortie (then)
        SoftAssertions softly = new SoftAssertions();
        softly.assertThat(personne).isNotNull();
        softly.assertThat(personne.getNom()).isEqualTo(nom);
        softly.assertThat(personne.getPrenom()).isEqualTo(prenom);
        softly.assertThat(personne.getdNaiss()).isEqualTo(dNaiss);
        softly.assertThat(personne.getEmploi()).isEmpty();
        softly.assertThat(personne.isMarie()).isTrue();
        // Ajouter les autres tests
        softly.assertAll();
    }
}
