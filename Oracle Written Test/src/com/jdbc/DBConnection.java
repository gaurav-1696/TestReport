package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	static String driver="com.mysql.cj.jdbc.Driver";
	  static String url="jdbc:mysql://localhost:3306/model";  
	  static String username="root";                      
	  static String password="8970";
	  static Connection conn;
	  
	  static Connection getconnection() throws SQLException 
	  {
		  
			  try {
				Class.forName(driver);
				System.out.println("Driver loaded");
				  conn=DriverManager.getConnection(url,username,password);
				  System.out.println("connection successful");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			  
			return conn;
}
}
