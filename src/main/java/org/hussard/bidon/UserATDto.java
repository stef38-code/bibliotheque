package org.hussard.bidon;

public class UserATDto {
    private static final long serialVersionUID = 1L;
    private final String idGdi;
    private final String nom;
    private final String prenom;
    private final String email;

    public UserATDto(String idGdi,
                     String nom,
                     String prenom,
                     String email) {
        this.idGdi = idGdi;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
    }
     public String getIdGdi() {
         return idGdi;
     }
     public String getNom() {
         return nom;
     }

    public String getPrenom() {
        return prenom;
    }

    public String getEmail() {
        return email;
    }
    @Override
    public String toString() {
        return "UserDto [ idGdi="+idGdi+" ,nom=" + nom + ", prenom=" + prenom + ", email=" + email + "]";
    }
}
