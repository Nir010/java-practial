package com.labreport.topic6;

public class AbstractClass {
    abstract static class Shape {
        abstract void draw();
    }

    static class Circle extends Shape {
        void draw() {
            System.out.println("Drawing a circle.");
        }
        public static void main(String[] args) {
            Shape obj = new Circle();
            obj.draw();
        }
    }
}
