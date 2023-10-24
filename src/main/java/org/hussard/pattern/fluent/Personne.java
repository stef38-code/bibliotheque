package org.hussard.pattern.fluent;

import java.time.LocalDate;

public class Personne {
    private final String nom;
    private final String prenom;
    private final LocalDate dNaiss;

    private final String emploi;
    private final boolean marie;

    public Personne(String nom, String prenom, LocalDate dNaiss, String emploi, boolean marie) {
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
}
