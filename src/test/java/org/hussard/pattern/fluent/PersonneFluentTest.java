package org.hussard.pattern.fluent;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import uk.co.jemos.podam.api.PodamFactory;
import uk.co.jemos.podam.api.PodamFactoryImpl;

import java.time.LocalDate;
import java.time.ZoneId;

import static org.assertj.core.api.Assertions.assertThat;

class PersonneFluentTest {
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

        //Vérifier la sortie (then)
        assertThat("Default test").isEmpty();
    }

}
