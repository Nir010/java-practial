package com.labreport.topic10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertData {
        public static void main(String[] args) throws Exception {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sem3", "root", "aditya@1234@");
            Statement stmt = conn.createStatement();
            stmt.executeUpdate("INSERT INTO studentdata (name, age, marks) VALUES ('John', 25, 78.5)");
            System.out.println("Record inserted!");
            conn.close();
        }
    }
