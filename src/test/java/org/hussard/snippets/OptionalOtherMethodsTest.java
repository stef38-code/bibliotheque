package org.hussard.snippets;

import org.hussard.data.Employee;

import java.util.Optional;
import java.util.function.Function;

public class OptionalOtherMethodsTest {

    public String get(Employee employee) {
        Optional<Employee> optional = Optional.ofNullable(employee);
        //sonarlint va détecter une violation de règle
        //https://rules.sonarsource.com/java/RSPEC-3655/

        //Attention si l'optional est vide une exception est levée
        return optional.get().getName();
    }

    public void ifPresentOrElse(Employee employee) {
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
    public Employee orElseThrow(Employee employee) {
        Optional<Employee> optional = Optional.ofNullable(employee);
        return optional.orElseThrow(() -> new RuntimeException("Employee not found"));
    }
    /**
     * Retourne le nom d'un Employee avec la méthode ifPresentOrElse
     * si l'optional est vide alors, on retourne un nom par défaut
     * sinon, on retourne le nom de l'Employee
     *
     * @param employee peut-être null
     * @return Employee
     */
    public String orElse(Employee employee) {
        Optional<Employee> optional = Optional.ofNullable(employee);
        return optional.map(Employee::getName).orElse("Unknown");
    }

    /**
     * Retourne le nom d'un Employee avec la méthode or
     * si l'optional est vide alors, on retourne un nom par défaut
     * sinon, on retourne le nom de l'Employee
     * @param employee peut-être null
     * @return Optional<String>
     */
    public Optional<String> or(Employee employee) {
        Optional<Employee> optional = Optional.ofNullable(employee);
        return optional.map(Employee::getName).or(() -> Optional.of("Unknown"));
    }

    /**
     * Retourne le nom d'un Employee avec la méthode ifPresentOrElse
     * si l'optional est vide alors, on retourne un nom par défaut
     * sinon, on retourne le nom de l'Employee
     * @param employee peut-être null
     * @return String
     */
    public String map(Employee employee) {
        Optional<Employee> optional = Optional.ofNullable(employee);
        return optional.map(getMapper()).orElse("Valeur par défaut");
    }

    /**
     * Mapper qui permet de transformer le nom de l'Employee en majuscule
     * si le nom est null alors on retourne "Unknown" en majuscule
     * @return Function<Employee, String>
     */
    private static Function<Employee, String> getMapper() {
        Function<Employee, String> getName = Employee::getName;
        getName = getName.andThen(String::toUpperCase);
        return getName;
    }
}

