package org.hussard.best.pratices.data;

import java.time.LocalDate;
import java.util.List;

public class Employe {
    private String nom;
    private String prenom;
    private String emploi;

    private LocalDate dateNaissance;
    private Adresse adresse;
    private Contact contact;
    private CompteBancaire compteBancaire;
    private InformationSalaire informationSalaire;
    private Qualification qualification;
    private List<Evaluation> evaluations;
    private SituationFamiliale situationFamiliale;

    public Employe(String nom, String prenom, String emploi,
                   LocalDate dateNaissance) {
        this.nom = nom;
        this.prenom = prenom;
        this.emploi = emploi;

        this.dateNaissance = dateNaissance;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getEmploi() {
        return emploi;
    }

    public LocalDate getDateNaissance() {
        return dateNaissance;
    }
}
