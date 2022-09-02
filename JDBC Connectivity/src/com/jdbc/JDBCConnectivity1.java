package com.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
//import java.util.Scanner;

public class JDBCConnectivity1 {
	
	static Connection conn;
	static ResultSet rsStud;
	static Statement stmt;
	void insertStudentData(int id,String n,int m,int d,int s)  //insert data
	{
		try {
			 stmt=conn.createStatement();
			String query="insert into student values("+id+",'"+n+"',"+m+","+d+","+s+")";
			int i=stmt.executeUpdate(query);
			if(i!=0)
			{
				System.out.println("reocrd inserted");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	void deletedata()   //data delete
	{
		try {
			stmt=conn.createStatement();
			int i=stmt.executeUpdate("delete from student where id=7");
			if(i!=0)
			{
				System.out.println("record deleted");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	void updatedata()  //update data
	{
		try {
			stmt=conn.createStatement();
			int i=stmt.executeUpdate("update student set smarks=90 where id=1");
			if(i!=0)
			{
				System.out.println("record updated");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	void displayStudentData() {    //display data
		try
		{
			Statement stmt=conn.createStatement();
			rsStud=stmt.executeQuery("Select * from Student");
			System.out.println("Student Dtails");
			while(rsStud.next())
			{
				System.out.println(rsStud.getInt(1)+" "+rsStud.getString(2)+" "+rsStud.getInt(3)+" "+rsStud.getInt(4)+" "+rsStud.getInt(5));
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		System.out.println("-----------------------");
	}
	void displayStudentSDepartment() {
		try
		{
			Statement stmt=conn.createStatement();
			rsStud=stmt.executeQuery("Select * from sdepartment");
			System.out.println("Department Details");
			while(rsStud.next())
			{
				System.out.println(rsStud.getInt(1)+" "+rsStud.getString(2));
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		System.out.println("--------------------------");
	}
	void displayStudentSports() {
		try
		{
			Statement stmt=conn.createStatement();
			rsStud=stmt.executeQuery("Select * from sports");
			System.out.println("Sport Detail");
			while(rsStud.next())
			{
				System.out.println(rsStud.getInt(1)+" "+rsStud.getString(2)+" "+rsStud.getString(3));
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
     public static void main(String[] args) {
//    	 Scanner sc=new Scanner(System.in);
//    	 System.out.println("enter id,name,marks,department id,sport id");
//    	 int id=sc.nextInt();
//    	 String n=sc.next();
//    	 int m=sc.nextInt();
//    	 int d=sc.nextInt();
//    	 int s=sc.nextInt();
    	conn=DBConnection.getconnection();
    	 JDBCConnectivity1 jdbc=new JDBCConnectivity1();
    	 jdbc.displayStudentData();
    	 //jdbc.displayStudentSDepartment();
    	// jdbc.displayStudentSports();
    	// jdbc.insertStudentData(id,n,m,d,s);
    	// sc.close();
    	 jdbc.deletedata();
    	 jdbc.updatedata();
	}
}
