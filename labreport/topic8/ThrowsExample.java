package com.labreport.topic8;

public class ThrowsExample {
    static void riskyMethod() throws ArithmeticException {
        int result = 10/0;
    }

    public static void main(String[] args) {
        try {
            riskyMethod();
        } catch (ArithmeticException e) {
            System.out.println("Caught an Exception: " + e.getMessage());
        }
    }
}

