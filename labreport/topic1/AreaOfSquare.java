package com.labreport.topic1;

import java.util.Scanner;
    public class AreaOfSquare {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the length: ");
            int l = scan.nextInt();
            int area = l * l;
            System.out.println("The area of the square is " + area);
            scan.close();
        }
    }