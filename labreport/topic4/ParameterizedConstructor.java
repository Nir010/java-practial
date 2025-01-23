package com.labreport.topic4;

public class ParameterizedConstructor {
    int x;
    ParameterizedConstructor(int value) {
        x = value;
        System.out.println("Value: " + x);
    }
    public static void main(String[] args) {
        new ParameterizedConstructor(10);
    }
}
