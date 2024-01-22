package org.hussard.pattern.fluent;

import org.apache.commons.lang3.StringUtils;

import java.time.LocalDate;
import java.util.Objects;

/**
 * Classe Builder qui va permettre de mettre les restrictions/contrôles pour la création d'une nouvelle personne
 *  - Le nom est obligatoire
 *  - Le prénom est obligatoire
 *  - La date de naissance est obligatoire
 *  - La date de naissance ne peut pas être supérieur à la date du jour
 *  - L'emploi est optionnel
 *  - La personne est mariée est optionnel
 *
 * @see PersonneFluent
 */
public class PersonneBuilder
        implements PersonneFluent,
                PersonneFluent.PersonnePrenom,
                PersonneFluent.PersonneDateNaiss,
                PersonneFluent.PersonneMarieOrEmploi,
                PersonneFluent.PersonneMarie,
                PersonneFluent.PersonneEmploi,
                PersonneFluent.PersonneCreate {
    private final String nom;
    private String prenom;
    private LocalDate dNaiss;
    private String emploi = StringUtils.EMPTY;
    private boolean marie = false;

    PersonneBuilder(String nom) {
        this.nom = nom;
    }

    /**
     * Méthode statique pour créer une nouvelle personne
     *
     * @param prenom le prénom de la personne
     * @return PersonnePrenom
     * @throws PersonneException si le prénom est null ou vide
     */
    @Override
    public PersonneDateNaiss prenom(String prenom) {
        if (StringUtils.isBlank(prenom)) {
            //
            throw new PersonneException("Le prenom est obligatoirement renseigné !!");
        }
        this.prenom = prenom;
        return this;
    }

    /**
     * date de naissance de la personne
     * @param dNaiss la date de naissance
     * @return PersonneMarieOrEmploi
     * @throws PersonneException si la date de naissance est null ou si la date de naissance est supérieur à la date du jour
     * @see PersonneException
     * @see PersonneFluent
     */
    @Override
    public PersonneMarieOrEmploi dateNaiss(LocalDate dNaiss) {
        if (Objects.isNull(dNaiss)) {
            throw new PersonneException("La date de naissance est obligatoirement renseigné !!");
        }
        if (dNaiss.isAfter(LocalDate.now())) {
            throw new PersonneException("La date de naissance ne peut pas être supérieur à date du jour");
        }
        this.dNaiss = dNaiss;
        return this;
    }
    /**
     * Méthode pour créer une personne mariée
     * @return PersonneEmploi
     */
    @Override
    public Personne create() {
        return new Personne(nom, prenom, dNaiss, emploi, marie);
    }
    /**
     * Méthode pour créer une personne mariée
     * @return PersonneEmploi
     */
    @Override
    public PersonneEmploi marie(boolean isMarie) {
        this.marie = isMarie;
        return this;
    }
    /**
     * Méthode pour créer une personne mariée
     * @return PersonneMarie
     *
     */
    @Override
    public PersonneMarie emploi(String emploi) {
        this.emploi = emploi;
        return this;
    }


}
