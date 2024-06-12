package org.example;

public class OperationOnImmutable {
    public static void operationOnImmutable() {
        String str = "example";
    // Caught by error prone as return value ignored
        str.toUpperCase();
    }
}
