package Day3;

import java.util.Scanner;

public class discount {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the total amount");
	int am=sc.nextInt();
	if (am>=10000)
	{
		double d=am*20/100;
		System.out.println("you got discount of Rs. "+d);
		System.out.println("net payable amount Rs. "+ (am-d));
	}
	else if(am<10000) {
		double e=am*10/100;
	   System.out.println("you got discount of Rs. "+e);
	   System.out.println("net payable amount Rs. "+ (am-e));
	}
	System.out.println();
	sc.close();
}
}
