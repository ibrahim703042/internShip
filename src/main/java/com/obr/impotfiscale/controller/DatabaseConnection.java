/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.obr.impotfiscale.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Ibrahim
 */

public class DatabaseConnection {
    
    public static Connection getConnection() {
        
        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            String url = "jdbc:mysql://localhost:3306/db_impotfiscal";
            String username = "root";
            String password = "";
            
            Connection connection = DriverManager.getConnection( url, username, password);
            
            return connection;
            
        } 
        catch (ClassNotFoundException | SQLException e){
            
            System.out.println("Database.getConnection() Error -->" + e.getMessage());
            return null;
            
        }
    }

    public static void close(Connection connection) {
        try {
            connection.close();
        } 
        catch (SQLException e) {
            
        }
    }
}
