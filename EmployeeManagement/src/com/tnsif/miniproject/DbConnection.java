package com.tnsif.miniproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
	 // Private fields for database configuration
	private static final String url = "jdbc:mysql://localhost:3306/employee";
	private static final String userName = "root";
	private static final String passWord = "Saravana001@";

    // Public static method to get the database connection
	public static Connection getConnection() throws SQLException
	{
		return  DriverManager.getConnection(url,userName,passWord);//return the connection 
	}
	
	
}

