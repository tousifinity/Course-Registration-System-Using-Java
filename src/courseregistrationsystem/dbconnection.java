/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package courseregistrationsystem;


import java.sql.*;
/**
 *
 * @author Tousif
 */
public class dbconnection {
        /**
     * @param args the command line arguments
     * @throws java.lang.ClassNotFoundException
     */
    public static void main(String[] args) throws ClassNotFoundException{
        // TODO code application logic here
       
    try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/courseregsystem", "root", "");
//            System.out.println("Connection created");
            
            conn.close();
//            System.out.println("Connection closed");                     
        }     
    catch (ClassNotFoundException | SQLException e) {
          System.out.println(e.toString());
        }
}
}
