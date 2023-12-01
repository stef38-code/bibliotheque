package org.hussard.snippets;

import org.hussard.data.Employee;

import java.util.Optional;

public class OptionalOtherMethods {

    public String getEmployeeNameWithGet(Employee employee) {
        Optional<Employee> optional = Optional.ofNullable(employee);
        //sonarlint va détecter une violation de règle
        //https://rules.sonarsource.com/java/RSPEC-3655/

        //Attention si l'optional est vide une exception est levée
        return optional.get().getName();
    }

    public void getEmployeeNameWithIfPresentOrElse(Employee employee) {
        Optional<Employee> optional = Optional.ofNullable(employee);
        //permet de faire des traitements si l'optional est non vide
        optional.ifPresentOrElse(
                //traitements si l'optional est non vide
                e -> upperCaseName(e.getName()),
                //traitements si l'optional est vide
                this::getEmployeeNotFound);
    }

    private void getEmployeeNotFound() {
        System.out.println("Employee not found");
    }

    private void upperCaseName(String name) {
        System.out.println(name.toUpperCase());
    }
    /**
     * Retourne un Employee avec la méthode orElseThrow
    * si l'optional est vide alors on aura une exception
     * si l'optional est non vide alors on retourne l'Employee
     *
     * @param employee peut-être null
     * @return Employee
     */
    public Employee getEmployeeWithOrElseThrow(Employee employee) {
        Optional<Employee> optional = Optional.ofNullable(employee);
        return optional.orElseThrow(() -> new RuntimeException("Employee not found"));
    }
    /**
     * Retourne le nom d'un Employee avec la méthode orElse
     * si l'optional est vide alors, on retourne un nom par défaut
     * sinon, on retourne le nom de l'Employee
     *
     * @param employee peut-être null
     * @return Employee
     */
    public String getEmployeeNameWithOrElse(Employee employee) {
        Optional<Employee> optional = Optional.ofNullable(employee);
        return optional.map(Employee::getName).orElse("Unknown");
    }
    public Optional<String> getEmployeeNameWithOr(Employee employee) {
        Optional<Employee> optional = Optional.ofNullable(employee);
        return optional.map(Employee::getName).or(() -> Optional.of("Unknown"));
    }
    public Optional<String> getEmployeeNameWithMap(Employee employee) {
        Optional<Employee> optional = Optional.ofNullable(employee);
        return optional.map(Employee::getName);
    }
}
