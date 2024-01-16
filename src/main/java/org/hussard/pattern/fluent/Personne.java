package org.hussard.pattern.fluent;

import java.time.LocalDate;

public class Personne {
    private String nom;
    private String prenom;
    private LocalDate dNaiss;

    private String emploi;
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
    public static PersonneFluent.PersonnePrenom nom(String name) {
        return PersonneFluent.name(name);
    }
}
