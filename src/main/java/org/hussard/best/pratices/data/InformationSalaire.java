package org.hussard.best.pratices.data;

public class InformationSalaire {
    private double salaire;
    private double prime;
    private double bonus;

    public InformationSalaire(double salaire, double prime, double bonus) {
        this.salaire = salaire;
        this.prime = prime;
        this.bonus = bonus;
    }

    public double getSalaire() {
        return salaire;
    }

    public double getPrime() {
        return prime;
    }

    public double getBonus() {
        return bonus;
    }
}
