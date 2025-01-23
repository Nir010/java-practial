package com.labreport.topic4;

    class Person {
        String name;
        // Default constructor.......
        Person() {
            name = "Niraj";
        }

        void display() {
            System.out.println("Name: " + name);
        }
    }
    public class ConstructorExample {
        public static void main(String[] args) {
            Person person = new Person();
            person.display();
        }
    }
