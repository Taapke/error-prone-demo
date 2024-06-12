package org.example;

public class UnusedVariable {
    public static void nullDereferenceMethod() {
        // Caught by error prone as unused variable
        String possiblyNull = getNullString();
    }

    private static String getNullString() {
        return null;
    }
}
