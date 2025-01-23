package com.labreport.topic6;

public class HierarchicalInheritance {
    static class Parent {
        void greet() {
            System.out.println("Hello from parent class.");
        }
    }
    static class Child1 extends Parent {}

    static class Child2 extends Parent {
        public static void main(String[] args) {
            Child1 obj1 = new Child1();
            obj1.greet();
            Child2 obj2 = new Child2();
            obj2.greet();
        }
    }
}
