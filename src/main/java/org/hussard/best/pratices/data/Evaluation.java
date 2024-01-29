package org.hussard.best.pratices.data;

import java.time.LocalDate;
import java.util.List;

public class Evaluation {
    private LocalDate date;
    private String commentaireResponsable;
    private int note;
    private String commentaireCollaborateur;
    private boolean objectifsAtteints;
    private List<Objectifs> objectifs;
}
