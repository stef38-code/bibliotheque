package org.hussard.tdd.data;

public class AdherentBuilder{
    private AdherentBuilder() {
        throw new UnsupportedOperationException("AdherentBuilder is a utility class and cannot be instantiated");
    }
    public static AdherentStep get() {
        return new AdherentApi();
    }
}
