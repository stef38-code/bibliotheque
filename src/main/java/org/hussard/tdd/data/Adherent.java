package org.hussard.tdd.data;

import java.time.LocalDate;

public class Adherent {
    private final String nom;
    private final String prenom;
    private final LocalDate dateNaiss;
    private final String email;
    private final String telephone;

    Adherent(String nom,
                    String prenom,
                    LocalDate dateNaiss,
                    String email,
                    String telephone) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaiss = dateNaiss;
        this.email = email;
        this.telephone = telephone;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public LocalDate getDateNaiss() {
        return dateNaiss;
    }

    public String getEmail() {
        return email;
    }

    public String getTelephone() {
        return telephone;
    }
}
