package org.hussard.snippets;

import org.assertj.core.api.Assertions;
import org.hussard.data.Employee;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.catchThrowable;

class OptionalCreateTest {
    /**
     * Test de la méthode ofNullable
     * avec un paramètre null
     * En utilisant la methode OfNullable si le paramètre est null
     * l'Optional retourné est vide
     * Ce qui peut être utile pour retourner une valeur par défaut
     * Et éviter de retourner null
     */
    @Test
    void getEmployeeNameWithOfNullable_ParamNull() {
        OptionalCreate optionalCreate = new OptionalCreate();
        Optional<Employee> employeeOptional = optionalCreate.getEmployeeWithOfNullable(null);
        assertThat(employeeOptional).isNotNull();
        assertThat(employeeOptional).isNotPresent();
        assertThat(employeeOptional).isEmpty();
    }
    /**
     * Test de la méthode ofNullable
     * avec un paramètre non null
     * En utilisant la methode OfNullable si le paramètre est non null
     * l'Optional retourné est non vide
     */
    @Test
    void getEmployeeNameWithOfNullable_ParamEmployee() {
        OptionalCreate optionalCreate = new OptionalCreate();
        Employee employee = new Employee("John", 29, "john@monmail.com");
        Optional<Employee> optionalEmployee = optionalCreate.getEmployeeWithOfNullable(employee);
        assertThat(optionalEmployee).isNotNull();
        assertThat(optionalEmployee).isPresent();
        assertThat(optionalEmployee).isNotEmpty();
    }
    /**
     * Test de la méthode Of
     * avec un paramètre null
     * si le paramètre est null alors une exception est levée
     */
    @Test
    void getEmployeeNameWithOf_ParamNull() {
        OptionalCreate optionalCreate = new OptionalCreate();
        Throwable thrown = catchThrowable(() -> optionalCreate.getEmployeeWithOf(null));
        Assertions.assertThat(thrown)
                .isInstanceOf(NullPointerException.class);
    }
    /**
     * Test de la méthode Of
     * avec un paramètre non null
     * En utilisant la methode Of si le paramètre est non null
     * l'Optional retourné est non vide
     */
    @Test
    void getEmployeeNameWithOf_ParamEmployee() {
        OptionalCreate optionalCreate = new OptionalCreate();
        Employee employee = new Employee("John", 29, "john@monmail.com");
        Optional<Employee> optionalEmployee = optionalCreate.getEmployeeWithOf(employee);
        assertThat(optionalEmployee).isNotNull();
        assertThat(optionalEmployee).isPresent();
        assertThat(optionalEmployee).isNotEmpty();
    }
    /**
     * Test de la méthode empty
     * En utilisant la methode empty
     * l'Optional retourné est vide
     * Ce qui peut être utile pour initialiser pour retourner une valeur par défaut
     * Et éviter de retourner null
     */
    @Test
    void getEmployeeNameWithEmpty_ParamNull() {
        OptionalCreate optionalCreate = new OptionalCreate();
        Optional<Employee> optionalEmployee = optionalCreate.getEmployeeWithEmpty();
        assertThat(optionalEmployee).isNotNull();
        assertThat(optionalEmployee).isNotPresent();
        assertThat(optionalEmployee).isEmpty();
    }
}
