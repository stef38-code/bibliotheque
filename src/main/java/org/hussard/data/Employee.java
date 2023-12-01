package org.hussard.data;

public class Employee {
    private final String name;
    private final int age;
    private final String email;

    public Employee(String name,
                    int age,
                    String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }
}
