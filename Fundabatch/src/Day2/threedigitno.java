package Day2;

import java.util.Scanner;

public class threedigitno {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Accept no and check whether it 3 digit no or not");
	int n=sc.nextInt();
	
	
	if(n>=100 && n<=999)
	{
		System.out.println("this is three digit no");
		int lastdigit=n%10;
		int two=n/10;
		int first=two/10;
		int mid=two%10;
		int add=lastdigit+first+mid;
		System.out.println("Addition of number is: "+add);
		
	}
	else 
	{
		System.out.println("this is not three digit no");
	}
	sc.close();
}
}
