package com.labreport.topic3;

public class MaxInArray {
    public static void main(String[] args) {
        int[] numbers = {3, 7, 2, 8, 5};
        int max = numbers[0];

        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }

        System.out.println("The maximum element in the array is: " + max);
    }
}
