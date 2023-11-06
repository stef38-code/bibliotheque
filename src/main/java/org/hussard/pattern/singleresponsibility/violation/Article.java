package org.hussard.pattern.singleresponsibility.violation;

public class Article {

    private String titre;
    private String auteur;
    private String contenu;

    public Article(String titre, String auteur, String contenu) {
        this.titre = titre;
        this.auteur = auteur;
        this.contenu = contenu;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public String getContenu() {
        return contenu;
    }

    public void setContenu(String contenu) {
        this.contenu = contenu;
    }

    public void afficher() {
        System.out.println("Titre : " + titre);
        System.out.println("Auteur : " + auteur);
        System.out.println("Contenu : " + contenu);
    }

    public void modifierTitre(String nouveauTitre) {
        titre = nouveauTitre;
    }

    public void modifierAuteur(String nouvelAuteur) {
        auteur = nouvelAuteur;
    }

    public void modifierContenu(String nouveauContenu) {
        contenu = nouveauContenu;
    }
}
