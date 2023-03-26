package org.example;

public class CalculatorServiceImpl {
    public int add(String a, String b) {
        if (a == null || b == null) {
            throw new IllegalArgumentException("Arguments 'a' and 'b' can be null.");
        }

        return Math.addExact(Integer.parseInt(a), Integer.parseInt(b));
    }
}
