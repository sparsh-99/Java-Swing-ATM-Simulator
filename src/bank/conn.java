/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

/**
 *
 * @author sparsh
 */
import java.sql.*;

public class conn {
    Connection c;
    Statement s;
    public conn(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/user-db?zeroDateTimeBehavior=convertToNull","root","");
            s = c.createStatement();
        }
        catch(ClassNotFoundException | SQLException e){
            System.out.println(e);
        }
    }
}
