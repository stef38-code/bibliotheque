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

    interface PersonnePrenom {
        PersonneDateNaiss prenom(String prenom);
    }

    interface PersonneDateNaiss extends PersonneCreate {
        PersonneMarieOrEmploi dateNaiss(LocalDate dNaiss);
    }

    interface PersonneMarieOrEmploi extends PersonneCreate {
        PersonneCreate marie(boolean isMarie);

        PersonneCreate emploi(String emploi);
    }

    interface PersonneCreate {
        Personne create();
    }
//    interface PersonneMarieOrEmploi extends PersonneCreate{
//        PersonneEmploi marie(boolean isMarie);
//        PersonneMarie emploi(String emploi);
//    }
//
//    interface PersonneMarie extends PersonneCreate {
//        PersonneCreate marie(boolean isMarie);
//    }
//
//    interface PersonneEmploi extends PersonneCreate {
//        PersonneCreate emploi(String emploi);
//    }

}
