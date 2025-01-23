package com.labreport.topic8;

public class ThrowExample {
    public static void main(String[] args) {
        try {
            throw new ArithmeticException("Custom error message.");
        } catch (ArithmeticException e) {
            System.out.println("Caught: " + e.getMessage());
        }
    }
}
