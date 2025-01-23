package com.labreport.topic5;

public class ReturnMethod {
    int add(int a, int b) {
        return a + b;
    }
    public static void main(String[] args) {
        ReturnMethod obj = new ReturnMethod();
        System.out.println("Sum: " + obj.add(3, 5));
    }
}
