package org.hussard.samples.clean;

public class BaseDeDonneesDefault  implements BaseDeDonnees {
    private JdbcTemplate jdbcTemplate;

    public BaseDeDonneesDefault(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
    @Override
    public Livre trouverLivre(int id) {
        // Trouver le livre dans la base de données
        return jdbcTemplate.queryForObject("SELECT * FROM livre WHERE id = ?", new Object[]{id}, new LivreRowMapper());
    }
}
