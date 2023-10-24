package org.hussard.pattern.fluent;

public class PersonneBuilder {
    private PersonneBuilder() {
        throw new UnsupportedOperationException("Is a utility class and cannot be instantiated");
    }
    public static PersonneStep get() {
        return new PersonneApi();
    }
}
