package org.hussard.best.pratices.data;

public class CompteBancaire {
    private String iban;
    private String bic;

    public CompteBancaire(String iban, String bic) {
        this.iban = iban;
        this.bic = bic;
    }

    public String getIban() {
        return iban;
    }

    public String getBic() {
        return bic;
    }
}
