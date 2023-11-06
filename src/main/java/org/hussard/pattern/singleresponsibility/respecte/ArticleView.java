package org.hussard.pattern.singleresponsibility.respecte;

public class ArticleView {

    public void afficher(Article article) {
        System.out.println("Titre : " + article.getTitre());
        System.out.println("Auteur : " + article.getAuteur());
        System.out.println("Contenu : " + article.getContenu());
    }
}
