package com.labreport.topic10;

import java.sql.Connection;
import java.sql.DriverManager;
public class JDBCConnection {
    public static void main(String[] args) throws Exception {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/nirajdb", "root", "aditya@1234@");
        System.out.println("Database connected!");
        conn.close();
    }
}
