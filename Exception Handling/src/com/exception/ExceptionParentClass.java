package com.exception;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

class AA
{
	void display() throws IOException
	{
		System.out.println("In parent class");
	}
}
class BB extends AA
{
	void display() throws FileNotFoundException
	
	{
		System.out.println("In child class");
	}
}
public class ExceptionParentClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
