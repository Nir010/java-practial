package com.labreport.topic10;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadFromFile {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new FileReader("readFromFile.txt"));
        System.out.println("File Content: " + reader.readLine());
        reader.close();
    }
}