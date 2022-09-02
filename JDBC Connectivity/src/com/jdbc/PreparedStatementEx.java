package com.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedStatementEx {
 static Connection connec;
 void displayData() {
	 try
	 {		 
    PreparedStatement psmt= connec.prepareStatement("select * from student");

	ResultSet rs=psmt.executeQuery();
	while (rs.next())
	{
		System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getInt(4)+" "+rs.getInt(5));
	}
	 }
	catch(SQLException e)
	{
		e.printStackTrace();
	}
 }
 void insertData(int id,String sname,int smarks,int deptid,int spid)
 {
	
	try {
		 PreparedStatement pst = connec.prepareStatement("insert into student values(?,?,?,?,?)");
		pst.setInt(1,id);
		pst.setString(2, sname);
		pst.setInt(3, smarks);
		pst.setInt(4, deptid);
		pst.setInt(5, spid);
		int i=pst.executeUpdate();
		if(i!=0)
		{
			System.out.println("record inserted");
		}
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
	 
 }
	
 public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the database name");
	String database=sc.next();
	connec=DBConnection.getconnection1(database);
	PreparedStatementEx pse=new PreparedStatementEx();
	pse.displayData();
	System.out.println("enter the student info (id,name,mark,departmentid,sportid");
	int i=sc.nextInt();
	String n=sc.next(); 
	int m=sc.nextInt();
	int d=sc.nextInt();
	int s=sc.nextInt();
	pse.insertData(i, n, m, d, s);
	sc.close();
}
 }

