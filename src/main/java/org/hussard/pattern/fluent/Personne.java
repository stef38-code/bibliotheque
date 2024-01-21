package org.hussard.pattern.fluent;

import org.hussard.pattern.fluent.annotations.Model;

import java.time.LocalDate;

/**
 * Classe de données
 */
@Model
public class Personne {
    /**
     * Nom de la personne
     */
    private String nom;
    /**
     * Prénom de la personne
     */
    private String prenom;
    /**
     * La date de naissance de la personne
     */
    private LocalDate dNaiss;
    /**
     * L'emploi de la personne
     */
    private String emploi;
    /**
     * La personne est-elle mariée
     */
    private boolean marie;

    @Deprecated
    Personne() {}

    Personne(String nom, String prenom, LocalDate dNaiss, String emploi, boolean marie) {
        this.nom = nom;
        this.prenom = prenom;
        this.dNaiss = dNaiss;
        this.emploi = emploi;
        this.marie = marie;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public LocalDate getdNaiss() {
        return dNaiss;
    }

    public String getEmploi() {
        return emploi;
    }

    public boolean isMarie() {
        return marie;
    }

    /**
     * Methode static du principe du bluider Fluent par Interface
     * @param name nom de la personne
     * @return PersonneFluent.PersonnePrenom
     * @see PersonneFluent.PersonnePrenom
     */
    public static PersonneFluent.PersonnePrenom nom(String name) {
        return PersonneFluent.name(name);
    }
}
