package org.hussard.pattern.fluent;

import org.apache.commons.lang3.StringUtils;

import java.time.LocalDate;
import java.util.Objects;

public class PersonneBuilder
        implements PersonneFluent,
                PersonneFluent.PersonnePrenom,
                PersonneFluent.PersonneDateNaiss,
                PersonneFluent.PersonneMarieOrEmploi,
                PersonneFluent.PersonneCreate {
    private String nom;
    private String prenom;
    private LocalDate dNaiss;
    private String emploi = StringUtils.EMPTY;
    private boolean marie = false;
    PersonneBuilder(String nom) {
        this.nom = nom;
    }

    @Override
    public PersonneDateNaiss prenom(String prenom) {
        if (StringUtils.isBlank(prenom)) {
            //
            throw new PersonneException("Le prenom est obligatoirement renseigné !!");
        }
        this.prenom = prenom;
        return this;
    }

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

    @Override
    public Personne create() {
        return new Personne(nom, prenom, dNaiss, emploi, marie);
    }

    @Override
    public PersonneCreate marie(boolean isMarie) {
        this.marie = isMarie;
        return this;
    }

    @Override
    public PersonneCreate emploi(String emploi) {
        this.emploi = emploi;
        return this;
    }
}
