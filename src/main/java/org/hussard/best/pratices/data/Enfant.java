package org.hussard.best.pratices.data;

import java.time.LocalDate;

public class Enfant {

    private String nom;
    private String prenom;
    private LocalDate dateNaissance;
    private boolean scolarise;

    public Enfant(String nom,
                  String prenom,
                  LocalDate dateNaissance,
                  boolean scolarise) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.scolarise = scolarise;
    }

}
