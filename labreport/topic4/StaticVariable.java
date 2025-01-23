package com.labreport.topic4;

public class StaticVariable {
    static int count = 0;
    StaticVariable() {
        count++;
    }
    public static void main(String[] args) {
        new StaticVariable();
        new StaticVariable();
        System.out.println("Count= " + StaticVariable.count);
    }
}

