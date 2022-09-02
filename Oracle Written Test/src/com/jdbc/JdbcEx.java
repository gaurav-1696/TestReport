package com.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class JdbcEx {
static Connection conn;
void  reduceCost() throws SQLException
{
	PreparedStatement psmt=conn.prepareStatement("update purchase p inner join model m on p.model_id=m.model_id set m.cost=m.cost-(cost*0.10)");
      int i=psmt.executeUpdate();
      if(i!=0)
      {
    	  System.out.println("Record: reduce cost updated");
      }
}
void RatingNotGetting() throws SQLException
{
	PreparedStatement psmt=conn.prepareStatement("select * from purchase inner join customer on \r\n"
			+ "purchase.cust_id=customer.cust_id  where rating_id is null");
	
	ResultSet re=psmt.executeQuery();
	while(re.next())
	{
		System.out.println(re.getInt(1)+" "+re.getInt(2)+" "+re.getInt(3)+" "+re.getInt(4)+" "+re.getInt(5)+" "+re.getDate(6)+" "+re.getInt(7) );
	}
}

void updateRating() throws SQLException
{
	PreparedStatement psmt=conn.prepareStatement("update purchase p inner join feedback_rating f on  p.rating_id=f.rating_id set p.rating_id=5 where p.purchase_id=92");
    int i=psmt.executeUpdate();
    if(i!=0)
    {
  	  System.out.println("Record: rating updated");
    }
}
void deleteRecord() throws SQLException
{
	PreparedStatement psmt=conn.prepareStatement("delete from purchase where rating_id=1");
          int i=psmt.executeUpdate();
          if(i!=0)
      	{
      		System.out.println(" record deleted ");
      	}	
}
public static void main(String[] args) throws SQLException {
	conn=DBConnection.getconnection();
	JdbcEx jdbc=new JdbcEx();
	jdbc.reduceCost();
	jdbc.RatingNotGetting();
	jdbc.updateRating();
	jdbc.deleteRecord();
}
}
