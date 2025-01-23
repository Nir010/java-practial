package com.labreport.topic10;

import java.io.FileWriter;
public class WriteToFile {
    public static void main(String[] args) throws Exception {
        FileWriter writer = new FileWriter("writeToFile.txt");
        writer.write("Hello, Something is written into file!");
        writer.close();
        System.out.println("Message written to file.");
    }
}

