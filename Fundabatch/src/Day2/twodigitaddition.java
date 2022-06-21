package Day2;

import java.util.Scanner;

public class twodigitaddition {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Accept no and check whether it 2 digit no or not");
	int n=sc.nextInt();
	
	
	if(n<=99)
	{
		System.out.println("this is two digit no");
		int lastdigit=n%10;
		int firstdigit=n/10;
		
		System.out.println(firstdigit+lastdigit);
		
	}
	else 
	{
		System.out.println("this is not two digit no");
	}
	sc.close();
}
}
