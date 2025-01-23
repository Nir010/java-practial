package com.labreport.topic7;

import java.util.Scanner;
public class UseOfScanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scan.nextLine();

        System.out.println("Hello, " + name + "!! Welcome here.");
        scan.close();
    }
}