package com.example.systemvote.console;



import java.sql.*;
public class DB {
    public static Connection main() {
        String url = "jdbc:mysql://localhost:3306/my_DB";
        String username = "admin";
        String password = "12345";

        try {
            return DriverManager.getConnection(url, username, password);

        } catch (SQLException e) {
            System.out.println(e);
        }

        return null;
    }

}
