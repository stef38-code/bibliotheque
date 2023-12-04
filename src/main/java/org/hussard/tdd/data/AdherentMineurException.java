package org.hussard.tdd.data;

public class AdherentMineurException extends RuntimeException {
    public AdherentMineurException() {
        super("L'accès à la salle de sport est interdit aux moins 16 ans");
    }
}
