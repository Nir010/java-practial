package com.labreport.topic6;

public class MultilevelInheritance {
    static class Grandparent {
        void message() {
            System.out.println("This is the Grandparent Class.");
        }
    }

    static class Parent extends Grandparent {}

    static class Child extends Parent {
        public static void main(String[] args) {
            Child obj = new Child();
            obj.message();
        }
    }
}
