package org.hussard.testunitaire.mock.premierpas;

public class Personn {
    private final String nom;
    private final String prenom;
    public Personn(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }
    public String getNom() {
        return nom;
    }
    public String getPrenom() {
        return prenom;
    }
}
