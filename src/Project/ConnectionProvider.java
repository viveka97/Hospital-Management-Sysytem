/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;


import java.sql.*;
import javax.swing.*;

/**
 *
 * @author Viveka
 */
public class ConnectionProvider {
    
    Connection con = null;
    
    public static Connection getCon()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con;
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project" , "root", "");
            return con;
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
              return null;      
        }
    }
}
