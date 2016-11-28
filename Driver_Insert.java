/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database_demo;

import java.sql.DriverManager;
import java.sql.*;

/**
 *
 * @author mackansari
 */
public class Driver_Insert {
    
 public static void main(String[] args) {
     
     String url = "jdbc:mysql://localhost:3306/demo";
     String user = "root";
     String password = "Ma@151786";
     
     try {
         // connection to database
         Connection myConn = DriverManager.getConnection(url, user, password);
         
         // statement
         Statement myStmt = myConn.createStatement();
         
         //Execute SQL
         String sql = "insert into person"
              + "(lastname, firstname)"
              + "values ('brown','David')";
         
         myStmt.executeUpdate(sql);
         System.out.println("Insert Complete.");
         
         
  
     }
     catch (Exception exc) {
         exc.printStackTrace();
     }
 }
 
}
