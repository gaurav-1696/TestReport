package Day2;

import java.util.Scanner;

public class additionoftwonumber {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("accept no ");
	int n=sc.nextInt();
	if(n>9 && n<=99)
	{
		System.out.println("this is two digit number: "+n);
		
	}
	else
		System.out.println("this is not two digit number: "+n);
	
	sc.close();
}
}
