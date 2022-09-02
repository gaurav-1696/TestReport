package com.innerClasses;

public class LocalOuter {
private int a=100;
void display()
{
	class Inner
	{
		final static int b=90;
		void show()
		{
			System.out.println("inside local inner class "+a+" "+b);
		}
	}
	Inner in =new Inner();
	in.show();
}
public static void main(String[] args) {
	LocalOuter lo=new LocalOuter();
	lo.display();
}
}
