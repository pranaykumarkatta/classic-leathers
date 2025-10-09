package com.classicLeathers.classic_leathers_inventory_api.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConnector {
    private static final String DB_URL = "jdbc:postgresql://localhost:5432/classicleathers-stock-prod";
    private static final String DB_USER = "postgres";
    private static final String DB_PASSWORD = "postgres";
    private static Connection connection = null;

    static {
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            connection.setAutoCommit(false);
            System.out.println("Connection successful!");
        } catch (ClassNotFoundException e) {
            System.out.println("PostgreSQL JDBC Driver not found");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Connection failed");
            e.printStackTrace();
        }
    }

    public static Connection getConnection() {
        return connection;
    }

    public static void main(String[] args) {
        getConnection();
    }

}
