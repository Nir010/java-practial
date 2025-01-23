package com.labreport.topic5;

public class SimpleMethod {
    void display() {
        System.out.println("Hello from display method!");
    }
    public static void main(String[] args) {
        SimpleMethod obj = new SimpleMethod();
        obj.display();  // calling a method
    }
}

