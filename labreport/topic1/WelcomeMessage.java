package com.labreport.topic1;

import java.util.Scanner;
public class WelcomeMessage {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scan.nextLine();
        System.out.println("Hello " + name +"! Welcome to Java Programming.");
        scan.close();
    }
}