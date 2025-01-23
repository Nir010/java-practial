package com.labreport.topic2;

public class CompoundAssignmentOperators {
    public static void main(String[] args) {
            int num = 10;

            System.out.println("After += 5: " +(num +=5));
            System.out.println("After -= 6: " + (num -= 6));
            System.out.println("After *= 2: " + (num *= 2));
            System.out.println("After /= 3: " + (num /= 3));
            System.out.println("After %= 4: " + (num %= 4));
        }
    }
