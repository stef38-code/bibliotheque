package org.hussard.tdd.data;

import java.time.LocalDate;

public class AdherentApi  implements  AdherentStep, AdherentStep.Builder{
    private LocalDate dateNaiss;
    @Override
    public AdherentStep.Builder dateNaiss(LocalDate dateNaiss) {
        this.dateNaiss = dateNaiss;
        return this;
    }

    @Override
    public Adherent build() {
        return new Adherent("nom", "prenom", this.dateNaiss, "email", "telephone");
    }
}
