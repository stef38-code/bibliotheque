package org.hussard.tdd.data;

import java.time.LocalDate;

public interface AdherentStep {
    Builder dateNaiss(LocalDate dateNaiss);
    interface Builder {
        Adherent build();
    }
}
