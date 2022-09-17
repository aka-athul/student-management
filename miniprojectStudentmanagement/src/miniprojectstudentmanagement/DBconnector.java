/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miniprojectstudentmanagement;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author s5
 */
public class DBconnector {
    static Connection con;
    
    public static Connection getConnection() {
	try
	{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3308/student","root","");
            System.out.println("connected");
	}
	catch(Exception e)
	{
            System.out.println("class error: "+e.getMessage());
	}
	return con;
    }
    
}

    

