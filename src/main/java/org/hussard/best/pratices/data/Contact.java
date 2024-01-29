package org.hussard.best.pratices.data;

public class Contact {
    private String email;
    private String telephone;
    private String mobile;

    public Contact(String email, String telephone, String mobile) {
        this.email = email;
        this.telephone = telephone;
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getMobile() {
        return mobile;
    }
}
