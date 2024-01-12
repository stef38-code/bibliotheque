package org.hussard.bidon;

import org.apache.commons.lang3.builder.ToStringBuilder;

import java.time.LocalDate;

public class PeriodeDto {
   private final LocalDate dateDebut;
    private final LocalDate dateFin;

    public PeriodeDto(LocalDate dateDebut, LocalDate dateFin) {
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
    }
    public LocalDate getDateDebut() {
        return dateDebut;
    }
    public LocalDate getDateFin() {
        return dateFin;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("dateDebut", dateDebut)
                .append("dateFin", dateFin)
                .toString();
    }
}
