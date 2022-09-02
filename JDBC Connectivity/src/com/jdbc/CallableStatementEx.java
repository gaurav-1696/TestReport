package com.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class CallableStatementEx {
static Connection conn;
void functionCall(int id) throws SQLException
{
	CallableStatement cs=conn.prepareCall("{call fullname(?)}");
	//cs.registerOutParameter(1, Types.VARCHAR);
	cs.registerOutParameter(1, id);
	cs.execute();
//	String s=cs.getNString(1);
//	System.out.println(s);
}
public static void main(String[] args) throws SQLException {
	conn=DBConnection.getconnection1("newschema");
	CallableStatementEx sc=new CallableStatementEx();
	System.out.println("enter the id of the employee");
	Scanner c=new Scanner(System.in);
	int id=c.nextInt();
	sc.functionCall(id);
	c.close();
	
	
}
}
