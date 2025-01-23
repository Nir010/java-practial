package com.labreport.topic4;

public class ConstructorOverloading {
    ConstructorOverloading() {
        System.out.println("Default constructor");
    }
    ConstructorOverloading(int a) {
        System.out.println("Parameterized constructor: " + a);
    }
    public static void main(String[] args) {
        new ConstructorOverloading();
        new ConstructorOverloading(5);
    }
}
