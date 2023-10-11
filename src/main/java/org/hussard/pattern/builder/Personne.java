package org.hussard.pattern.builder;

import java.time.LocalDate;

public class Personne {
    private final String nom;
    private final String prenom;
    private final LocalDate dNaiss;

    private final String emploi;
    private final boolean marie;

    private Personne(PersonneBuilder personneBuilder) {
        this.nom = personneBuilder.nom;
        this.prenom = personneBuilder.prenom;
        this.dNaiss = personneBuilder.dNaiss;
        this.emploi = personneBuilder.emploi;
        this.marie = personneBuilder.marie;
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
    public static PersonneBuilder build(){
        return new PersonneBuilder();
    }
    public static class PersonneBuilder {
        private String nom;
        private String prenom;
        private LocalDate dNaiss;
        private String emploi;
        private boolean marie;

        public PersonneBuilder nom(String nom) {
            this.nom = nom;
            return this;
        }

        public PersonneBuilder prenom(String prenom) {
            this.prenom = prenom;
            return this;
        }

        public PersonneBuilder dNaiss(LocalDate dNaiss) {
            this.dNaiss = dNaiss;
            return this;
        }

        public PersonneBuilder emploi(String emploi) {
            this.emploi = emploi;
            return this;
        }

        public PersonneBuilder marie(boolean marie) {
            this.marie = marie;
            return this;
        }

        public Personne create() {
            return new Personne(this);
        }
    }
}
