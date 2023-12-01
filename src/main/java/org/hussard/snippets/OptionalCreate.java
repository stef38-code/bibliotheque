package org.hussard.snippets;

import org.hussard.data.Employee;

import java.util.Optional;

public class OptionalCreate {
    /**
     * Retourne un Optional<Employee> avec la méthode ofNullable
     *
     * @param employee peut-être null
     * @return Optional<Employee>
     */
    public Optional<Employee> getEmployeeWithOfNullable(Employee employee) {
        return Optional.ofNullable(employee);
    }

    /**
     * Retourne un Optional<Employee> avec la méthode of
     *
     * @param employee ne peut pas être null
     * @return Optional<Employee>
     */
    public Optional<Employee> getEmployeeWithOf(Employee employee) {
        return Optional.of(employee);
    }

    /**
     * Retourne un Optional<Employee> avec la méthode empty
     *
     * @return Optional<Employee>
     */
    public Optional<Employee> getEmployeeWithEmpty() {
        return Optional.empty();
    }
}
