package com.labreport.topic8;

public class FinallyExample {
    public static void main(String[] args) {
        try {
            int result = 38/0;
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero.");
        } finally {
            System.out.println("This will always execute.");
        }
    }
}

