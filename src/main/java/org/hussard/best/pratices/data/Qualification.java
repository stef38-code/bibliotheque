package org.hussard.best.pratices.data;

public class Qualification {
    private String diplome;
    private String experience;
    private String competence;

    public Qualification(String diplome, String experience, String competence) {
        this.diplome = diplome;
        this.experience = experience;
        this.competence = competence;
    }

    public String getDiplome() {
        return diplome;
    }

    public String getExperience() {
        return experience;
    }

    public String getCompetence() {
        return competence;
}
}
