package org.hussard.samples.clean;

public class ServiceDefault implements Service {
    private BaseDeDonnees baseDeDonnees;

    public ServiceDefault(BaseDeDonnees baseDeDonnees) {
        this.baseDeDonnees = baseDeDonnees;
    }
    @Override
    public Livre trouverLivre(int id) {
        // Trouver le livre dans la base de données
        return baseDeDonnees.trouverLivre(id);
    }
}
