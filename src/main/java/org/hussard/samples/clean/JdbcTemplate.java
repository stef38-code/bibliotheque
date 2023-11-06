package org.hussard.samples.clean;

public interface JdbcTemplate {
    Livre queryForObject(String query, Object[] objects, LivreRowMapper livreRowMapper);
}
