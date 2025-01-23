package com.labreport.topic5;

public class OverloadWithReturn {
    int square(int x) {
        return x * x;
    }
    double square(double y) {
        return y * y;
    }
    public static void main(String[] args) {
        OverloadWithReturn obj = new OverloadWithReturn();
        System.out.println("Square of 5= " + obj.square(5));
        System.out.println("Square of 5.5= " + obj.square(5.5));
    }
}
