/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database_demo;

import java.sql. *; 
public class Driver_Demo {
    
    public static void main (String[] args){
        
        try {
            // get connection to database
            Connection myConn= DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root", "Ma@151786" );
            
            // create a statment 
            Statement myStmt = myConn.createStatement();
            
            //execute sql query 
            ResultSet myRs = myStmt.executeQuery("select * from person");  
            
            //process the result set 
              while (myRs.next()) {  
                  System.out.println(myRs.getString("lastname") + ", " + myRs.getString("firstname"));
              }    
        }
        catch (Exception exc){
            exc.printStackTrace();
        }
    }
}
