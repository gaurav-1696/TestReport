package com.exceptionpp;

public class ExceptionExample2 {
	
int getStringLength(String s) throws NullPointerException
{
	if(s==null)
	{
		throw new NullPointerException("String is null");
	}
	return s.length();
}
public static void main(String[] args) {
	ExceptionExample2 e=new ExceptionExample2();
	System.out.println(e.getStringLength("Mumbai"));
	try
	{
	System.out.println(e.getStringLength(null));
	}
	catch(NullPointerException s)
	{
	//	System.out.println(s);
		s.printStackTrace(); 
	}
	System.out.println(e.getStringLength("Goa"));
	System.out.println(e.getStringLength("honeymoon"));
}
}
