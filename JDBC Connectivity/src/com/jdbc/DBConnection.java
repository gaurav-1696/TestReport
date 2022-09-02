package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	
	static String driver="com.mysql.cj.jdbc.Driver";
  static String url="jdbc:mysql://localhost:3306/";  //3306/database name:hardcore data
  static String username="root";                      //3306  :user input database
  static String password="8970";
  static Connection conn;
  static Connection getconnection()
  {
	  try
	  {
		  Class.forName(driver);
		  System.out.println("Driver loaded");
		  conn=DriverManager.getConnection(url,username,password);
		  System.out.println("connection successful");
	  }
	  catch(ClassNotFoundException e)
	  {
		e.printStackTrace();  
	  } catch (SQLException e) {
		
		e.printStackTrace();
	}
	  return conn;
  }
  static Connection getconnection1(String database)   //user intput database
  {
	  try
	  {
		  Class.forName(driver);
		  System.out.println("Driver loaded");
		  url=url+database;
		  conn=DriverManager.getConnection(url,username,password);
		  System.out.println("connection successful");
	  }
	  catch(ClassNotFoundException e)
	  {
		e.printStackTrace();  
	  } catch (SQLException e) {
		
		e.printStackTrace();
	}
	  return conn;
  }
}
