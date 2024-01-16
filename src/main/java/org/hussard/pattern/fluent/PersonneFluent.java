package org.hussard.pattern.fluent;

import org.apache.commons.lang3.StringUtils;

import java.time.LocalDate;

public interface PersonneFluent {
    static PersonnePrenom name(String nom) {
        if (StringUtils.isBlank(nom)) {
            //
            throw new PersonneException("Le nom est obligatoirement renseigné !!");
        }
        return new PersonneBuilder(nom);
    }
    interface PersonnePrenom{
        PersonneDateNaiss prenom(String prenom);
    }
    interface PersonneDateNaiss{
        PersonneCreate dateNaiss(LocalDate dNaiss);
    }
    interface PersonneCreate{
        Personne create();
    }
}
