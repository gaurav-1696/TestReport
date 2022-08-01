package com.exception;

public class ThrowNThrows {
int getStringLength(String s)throws NullPointerException
{
	if(s==null)
	{
		throw new NullPointerException("String is null");
		//System.out.println("String is null");
	}
	
	return s.length();
}
public static void main(String[] args) {
	ThrowNThrows t=new ThrowNThrows();
	System.out.println(t.getStringLength("India"));
	try
	{
		
		//System.out.println(t.getStringLength(null));
	}
	catch(NullPointerException e)
	{
	throw new NullPointerException("null String...please enter valid String");
	}
	System.out.println(t.getStringLength("Mumbai"));
	System.out.println(t.getStringLength("Pune"));
}
}
