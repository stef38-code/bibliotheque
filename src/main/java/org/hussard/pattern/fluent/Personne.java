package org.hussard.pattern.fluent;

import org.hussard.pattern.fluent.annotations.Model;

import java.time.LocalDate;

/**
 * Classe représentant une personne
 * <p>
 *     <b>Exemple d'utilisation:</b>
 * <pre>
 * {@code
 * public class PersonneExemple {
 *  public getPersonne() {
 *     return Personne.nom("DUPONT")
 *        .prenom("Jean")
 *        .dateNaiss(LocalDate.of(1970, 1, 1))
 *        .emploi("Ingénieur")
 *        .marie(true)
 *        .create();
 *   }
 * }
 * }
 * </pre>
 * </p>
 *
 */
@Model
public class Personne {
    /**
     * Nom de la personne
     */
    private final String nom;
    /**
     * Prénom de la personne
     */
    private final String prenom;
    /**
     * La date de naissance de la personne
     */
    private final LocalDate dNaiss;
    /**
     * L'emploi de la personne
     */
    private final String emploi;
    /**
     * La personne est-elle mariée
     */
    private final boolean marie;

    /**
     * Constructeur par défaut
     * @throws PersonneException impossible de créer une personne en utilisant le constructeur par défaut
     * @see Personne#Personne(String, String, LocalDate, String, boolean)
     */
    Personne() {
        throw new PersonneException("Impossible de créer une personne en utilisant le constructeur par défaut");
    }
    /**
     * Constructeur avec paramètres
     *
     * @param nom    nom de la personne
     * @param prenom prenom de la personne
     * @param dNaiss date de naissance de la personne
     * @param emploi emploi de la personne
     * @param marie  la personne est-elle mariée
     */
    Personne(String nom,
             String prenom,
             LocalDate dNaiss,
             String emploi,
             boolean marie) {
        this.nom = nom;
        this.prenom = prenom;
        this.dNaiss = dNaiss;
        this.emploi = emploi;
        this.marie = marie;
    }

    /**
     * Methode static pour créer une personne
     *
     * @param name nom de la personne
     * @return PersonneFluent.PersonnePrenom
     * @see PersonneFluent.PersonnePrenom
     */
    public static PersonneFluent.PersonnePrenom nom(String name) {
        return PersonneFluent.name(name);
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
}
