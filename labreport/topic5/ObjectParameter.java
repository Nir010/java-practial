package com.labreport.topic5;

public class ObjectParameter {
        String name;
        ObjectParameter(String name) {
            this.name = name;
        }
        void display(ObjectParameter p) {
            System.out.println("Name: " + p.name);
        }
        public static void main(String[] args) {
            ObjectParameter p = new ObjectParameter("Niraj");
            p.display(p);
        }
    }
