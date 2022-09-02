package com.innerClasses;

public class StaticOuter {
  // inner class: class inside a class (nested class)
	static int a=100;
	int b=200;
	static class Inner {
		static int a=1000;  //shadowing of variable
		void display()
		{
			System.out.println("Inside static Inner class display "+a);
			System.out.println(StaticOuter.a);
		}
		
	}
	public static void main(String[] args) {
		StaticOuter.Inner obj= new StaticOuter.Inner();
		obj.display();
	}
}
