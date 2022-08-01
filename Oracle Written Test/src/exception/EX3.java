package exception;

import java.util.Scanner;

public class EX3 {
	 static void div(int x, int y)
	{
		System.out.println(x/y);
	}
	    public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the number");
			int x=sc.nextInt();
			int y=sc.nextInt();			
			try
			{
				System.out.println("try block");
				EX3.div(x, y);
			}
			finally
			{
				System.out.println("finally block");
				EX3.div(x, y);				
			}
sc.close();
}
}