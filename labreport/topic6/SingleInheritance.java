package com.labreport.topic6;

class Parent {
    void show() {
        System.out.println("This is the parent class.");
    }
}
public class SingleInheritance{
    static class Child extends Parent {
        public static void main(String[] args) {
            Child obj = new Child();
            obj.show();
        }
    }
}