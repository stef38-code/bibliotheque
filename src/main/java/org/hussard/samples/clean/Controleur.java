package org.hussard.samples.clean;

// Contrôleur
public class Controleur {
    private Service service;
    public Controleur(Service service) {
        this.service = service;
    }
    public void afficherPage() {
        // Afficher la page Web
    }
    public void traiterFormulaire(int id) {
        // Traiter le formulaire
        // Appeler le service pour trouver le livre
        Livre livre = service.trouverLivre(id);
        // Afficher le livre
    }
}
