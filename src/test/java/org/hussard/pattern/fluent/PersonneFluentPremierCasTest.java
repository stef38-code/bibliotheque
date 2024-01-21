package org.hussard.pattern.fluent;

import com.github.javafaker.Faker;
import org.apache.commons.lang3.StringUtils;
import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.ZoneId;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.catchThrowable;

class PersonneFluentPremierCasTest {
    private Faker faker;
    @BeforeEach
    void setUp() {
        faker = new Faker();
    }

    @Test
    @DisplayName("Une Personne non marié et sans emploi")
    void creerUnePersonne_PremierCas() {

        //Conditions préalables (given)
        String prenom = faker.name().firstName();
        String nom = faker.name().lastName();
        LocalDate dNaiss = faker.date().birthday().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

        //Une action se produit (when)
        Personne personne = Personne.nom(nom)
                .prenom(prenom)
                .dateNaiss(dNaiss)
                .create();

        // Vérifier la sortie (then)
        SoftAssertions softly = new SoftAssertions();
        softly.assertThat(personne).isNotNull();
        softly.assertThat(personne.getNom()).isEqualTo(nom);
        softly.assertThat(personne.getPrenom()).isEqualTo(prenom);
        softly.assertThat(personne.getdNaiss()).isEqualTo(dNaiss);
        softly.assertThat(personne.getEmploi()).isEmpty();
        softly.assertThat(personne.isMarie()).isFalse();
       // Ajouter les autres tests
        softly.assertAll();
    }
    @Test
    @DisplayName("Une Personne le nom vide")
    void creerUnePersonne_NomVide_AttendUneException() {
        //Conditions préalables (given)
        String prenom = faker.name().firstName();
        String nom = StringUtils.EMPTY;
        LocalDate dNaiss = faker.date().birthday().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

        // Une action se produit (when)
        Throwable thrown =
                catchThrowable(() -> Personne.nom(nom).prenom(prenom).dateNaiss(dNaiss).create());
        assertThat(thrown).isInstanceOf(PersonneException.class).hasMessage("Le nom est obligatoirement renseigné !!");
        //
    }
    @Test
    @DisplayName("Une Personne le prénom vide")
    void creerUnePersonne_PrenomVide_AttendUneException() {
        //Conditions préalables (given)
        String prenom = StringUtils.EMPTY;
        String nom = faker.name().lastName();
        LocalDate dNaiss = faker.date().birthday().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

        // Une action se produit (when)
        Throwable thrown =
                catchThrowable(() -> Personne.nom(nom).prenom(prenom).dateNaiss(dNaiss).create());
        assertThat(thrown).isInstanceOf(PersonneException.class).hasMessage("Le prenom est obligatoirement renseigné !!");
        //
    }
    @Test
    @DisplayName("Une Personne date de naissance supérieur à aujourd'hui")
    void creerUnePersonne_DateNaissSuppAAjourdhui_AttendUneException() {
        //Conditions préalables (given)
        String prenom = faker.name().firstName();
        String nom = faker.name().lastName();
        LocalDate dNaiss = LocalDate.now().plusDays(1);

        // Une action se produit (when)
        Throwable thrown =
                catchThrowable(() -> Personne.nom(nom).prenom(prenom).dateNaiss(dNaiss).create());
        assertThat(thrown).isInstanceOf(PersonneException.class).hasMessage("La date de naissance ne peut pas être supérieur à date du jour");
        //
    }
}
