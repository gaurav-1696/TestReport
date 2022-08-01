package com.exception;

public class AgeExceptionExample {

	
	void validate(int age) throws AgeException1
	{
		if(age<18)
		{
			throw new AgeException1("age is less,not allowed for rollercaoster ride");
			
		}
		else if(age>60)
		{
			throw new AgeException1("age is greater ,not allowed for rollercoaster ride");
		}
		else
		{
			System.out.println("Enjoy your ride");
		}
	}
	
	public static void main(String[] args) {
		int age=61;
		AgeExceptionExample a=new AgeExceptionExample();
		try {
			a.validate(age);
		} catch (AgeException1 e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
