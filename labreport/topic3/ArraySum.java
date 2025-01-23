package com.labreport.topic3;

public class ArraySum {
    public static void main(String[] args) {
        int[] num = {2, 4, 6, 8, 10, 12};
        int sum = 0;

        for (int number : num) {
            // enhanced for loop in Java
            sum += number;
        }

        System.out.println("The sum of array elements is: " + sum);
    }
}