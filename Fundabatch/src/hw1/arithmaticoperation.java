package hw1;

import java.util.Scanner;

public class arithmaticoperation {
  public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter two numbers");
	int a=sc.nextInt();
	int b=sc.nextInt();
	//addition
	int add=a+b;
	//Subtraction
	int sub=a-b;
	//multiplication
	int mul=a*b;
	//divide
	int div=a/b;
	//mod(remainder)
	int rem=a%b;
	System.out.println("addtion ot two number= "+add);
	System.out.println("subtraction of two number= "+sub);
	System.out.println("multiplication of two number= "+mul);
	System.out.println("division of two number= "+div);
	System.out.println("remainder of two number= "+rem);
}
}
