package Day1;

import java.util.Scanner;

public class inputfromuser {
 public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the principle amount");
	int amount=sc.nextInt();
	System.out.println("enter the  year");
	int year=sc.nextInt();
	System.out.println("enter the interest rate");
	int interest=sc.nextInt();
	 
	int simpleinterest=amount*year*interest/100;
	System.out.println("Simple interest ="+simpleinterest);
	sc.close();
}
}
